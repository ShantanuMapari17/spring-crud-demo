package com.shantanu.student_crud.service;

import com.shantanu.student_crud.entity.StudTable;
import com.shantanu.student_crud.repository.StudTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudTableService {

    @Autowired
    private StudTableRepository studTableRepository;

    public List<StudTable> getAllStudTables() {
        return studTableRepository.findAll();
    }

    public Optional<StudTable> getStudTableById(Long id) {
        return studTableRepository.findById(id);
    }

    public StudTable saveStudTable(StudTable studTable) {
        return studTableRepository.save(studTable);
    }

    public void deleteStudTable(Long id) {
        studTableRepository.deleteById(id);
    }
}
