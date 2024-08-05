package com.shantanu.student_crud.controller;

import com.shantanu.student_crud.entity.DatastoreType;
import com.shantanu.student_crud.service.DatastoreTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/datastore_types")
public class DatastoreTypeController {

    @Autowired
    private DatastoreTypeService datastoreTypeService;

    @GetMapping
    public List<DatastoreType> getAllDatastoreTypes() {
        return datastoreTypeService.getAllDatastoreTypes();
    }

    @GetMapping("/{type}")
    public ResponseEntity<DatastoreType> getDatastoreTypeById(@PathVariable String type) {
        Optional<DatastoreType> datastoreType = datastoreTypeService.getDatastoreTypeById(type);
        if (datastoreType.isPresent()) {
            return ResponseEntity.ok(datastoreType.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public DatastoreType createDatastoreType(@RequestBody DatastoreType datastoreType) {
        return datastoreTypeService.saveDatastoreType(datastoreType);
    }

    @DeleteMapping("/{type}")
    public ResponseEntity<Void> deleteDatastoreType(@PathVariable String type) {
        datastoreTypeService.deleteDatastoreType(type);
        return ResponseEntity.noContent().build();
    }
}