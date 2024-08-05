package com.shantanu.student_crud.repository;

import com.shantanu.student_crud.entity.StudTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudTableRepository extends JpaRepository<StudTable, Long> {
}