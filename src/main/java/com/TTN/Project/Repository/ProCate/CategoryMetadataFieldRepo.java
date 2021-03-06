package com.TTN.Project.Repository.ProCate;

import com.TTN.Project.entities.ProCate.CategoryMetadataField;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CategoryMetadataFieldRepo extends JpaRepository<CategoryMetadataField,Long> {
    CategoryMetadataField findByName(String name);
    CategoryMetadataField findById(long id);

    List<CategoryMetadataField> findAll(Sort sort);
}
