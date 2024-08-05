package com.shantanu.student_crud.entity;


import com.fasterxml.jackson.databind.JsonNode;
import com.shantanu.student_crud.helper.DatastoreFieldId;
import com.shantanu.student_crud.helper.JsonNodeConverter;
import jakarta.persistence.*;

@Entity
@Table(name = "datastore_fields")
@IdClass(DatastoreFieldId.class)
public class DatastoreField {

    @Id
    @Column(name = "datastore_type")
    private String datastoreType;

    @Id
    @Column(name = "section")
    private String section;

    @Convert(converter = JsonNodeConverter.class)
    @Column(columnDefinition = "json")
    private JsonNode inputFields;

    // Getters and Setters
    public String getDatastoreType() {
        return datastoreType;
    }

    public void setDatastoreType(String datastoreType) {
        this.datastoreType = datastoreType;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public JsonNode getInputFields() {
        return inputFields;
    }

    public void setInputFields(JsonNode inputFields) {
        this.inputFields = inputFields;
    }
}