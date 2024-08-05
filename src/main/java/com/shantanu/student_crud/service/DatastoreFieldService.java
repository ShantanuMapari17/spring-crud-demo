package com.shantanu.student_crud.service;

import com.shantanu.student_crud.entity.DatastoreField;
import com.shantanu.student_crud.repository.DatastoreFieldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DatastoreFieldService {

    @Autowired
    private DatastoreFieldRepository datastoreFieldRepository;

    public List<DatastoreField> getAllDatastoreFields() {
        return datastoreFieldRepository.findAll();
    }

    public List<DatastoreField> getDatastoreFieldsByType(String datastoreType) {
        return datastoreFieldRepository.findByDatastoreType(datastoreType);
    }

    public DatastoreField saveDatastoreField(DatastoreField datastoreField) {
        return datastoreFieldRepository.save(datastoreField);
    }


}