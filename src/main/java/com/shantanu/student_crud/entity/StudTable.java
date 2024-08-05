package com.shantanu.student_crud.entity;

import com.fasterxml.jackson.databind.JsonNode;
import com.shantanu.student_crud.helper.JsonNodeConverter;
import jakarta.persistence.*;

@Entity
@Table(name = "stud_table")
public class StudTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Convert(converter = JsonNodeConverter.class)
    @Column(columnDefinition = "json")
    private JsonNode data;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public JsonNode getData() {
        return data;
    }

    public void setData(JsonNode data) {
        this.data = data;
    }
}
