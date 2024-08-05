package com.shantanu.student_crud.repository;

import com.shantanu.student_crud.entity.DatastoreField;
import com.shantanu.student_crud.helper.DatastoreFieldId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DatastoreFieldRepository extends JpaRepository<DatastoreField, DatastoreFieldId> {
    List<DatastoreField> findByDatastoreType(String datastoreType);
}