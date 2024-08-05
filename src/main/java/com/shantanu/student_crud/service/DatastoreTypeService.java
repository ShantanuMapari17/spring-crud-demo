package com.shantanu.student_crud.service;

import com.shantanu.student_crud.entity.DatastoreType;
import com.shantanu.student_crud.repository.DatastoreTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DatastoreTypeService {

    @Autowired
    private DatastoreTypeRepository datastoreTypeRepository;

    public List<DatastoreType> getAllDatastoreTypes() {
        return datastoreTypeRepository.findAll();
    }

    public Optional<DatastoreType> getDatastoreTypeById(String type) {
        return datastoreTypeRepository.findById(type);
    }

    public DatastoreType saveDatastoreType(DatastoreType datastoreType) {
        return datastoreTypeRepository.save(datastoreType);
    }

    public void deleteDatastoreType(String type) {
        datastoreTypeRepository.deleteById(type);
    }
}