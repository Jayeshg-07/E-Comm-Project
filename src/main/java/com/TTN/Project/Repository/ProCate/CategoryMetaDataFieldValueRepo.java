package com.TTN.Project.Repository.ProCate;

import com.TTN.Project.entities.ProCate.CategoryMetadataFieldValues;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CategoryMetaDataFieldValueRepo extends JpaRepository<CategoryMetadataFieldValues,Long> {

   /* INSERT INTO table_name
    VALUES (value1, value2, value3, ...);*/
    @Modifying
    @Query(value = "insert into category_metadata_field_values values(:id,:mid,:value)",nativeQuery = true)
    void addMetadataValues(@Param("id") long id, @Param("mid") long mid,@Param("value") String value);

    @Query(value = "select * from category_metadata_field_values  where category_id=:id and category_metadata_field_id=:mid",nativeQuery = true)
    CategoryMetadataFieldValues viewMetadataValues(@Param("id") long id, @Param("mid") long mid);

    @Query(value = "select * from category_metadata_field_values  where category_id=:id and category_metadata_field_id=:mid",nativeQuery = true)
    List<Object[]> viewMetadataValues2(@Param("id") long id, @Param("mid") long mid);


    @Query(value = "select * from category_metadata_field_values",nativeQuery = true)
    List<Object> viewAllMetadataValue();



    @Modifying
    @Query(value = "update category_metadata_field_values set value=:value where category_id=:id and category_metadata_field_id=:mid",nativeQuery = true)
    void updateMetadataValues(@Param("id") long id, @Param("mid") long mid,@Param("value") String value);
}
