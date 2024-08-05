package com.shantanu.student_crud.controller;

import com.fasterxml.jackson.databind.JsonNode;
import com.shantanu.student_crud.entity.StudTable;
import com.shantanu.student_crud.service.StudTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/stud_table")
public class StudTableController {

    @Autowired
    private StudTableService studTableService;

    @GetMapping
    public List<StudTable> getAllStudTables() {
        return studTableService.getAllStudTables();
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudTable> getStudTableById(@PathVariable Long id) {
        Optional<StudTable> studTable = studTableService.getStudTableById(id);
        if (studTable.isPresent()) {
            return ResponseEntity.ok(studTable.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public StudTable createStudTable(@RequestBody JsonNode data) {
        StudTable studTable = new StudTable();
        studTable.setData(data);
        return studTableService.saveStudTable(studTable);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudTable(@PathVariable Long id) {
        studTableService.deleteStudTable(id);
        return ResponseEntity.noContent().build();
    }
}

