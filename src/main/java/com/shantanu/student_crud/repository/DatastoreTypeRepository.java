package com.shantanu.student_crud.repository;


import com.shantanu.student_crud.entity.DatastoreType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DatastoreTypeRepository extends JpaRepository<DatastoreType, String> {
}