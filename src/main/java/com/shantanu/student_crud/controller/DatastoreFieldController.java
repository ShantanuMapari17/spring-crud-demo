package com.shantanu.student_crud.controller;

import com.shantanu.student_crud.entity.DatastoreField;
import com.shantanu.student_crud.service.DatastoreFieldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DatastoreFieldController {

    @Autowired
    private DatastoreFieldService datastoreFieldService;

    @GetMapping("/{datastoreType}/getFields")
    public ResponseEntity<List<DatastoreField>> getDatastoreFieldsByType(@PathVariable String datastoreType) {
        List<DatastoreField> datastoreFields = datastoreFieldService.getDatastoreFieldsByType(datastoreType);
        if (!datastoreFields.isEmpty()) {
            return ResponseEntity.ok(datastoreFields);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Other endpoints can remain as they are or be modified as needed
}