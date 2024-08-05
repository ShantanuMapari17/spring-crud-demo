package com.shantanu.student_crud.helper;

import java.io.Serializable;
import java.util.Objects;

public class DatastoreFieldId implements Serializable {
    private String datastoreType;
    private String section;

    // Default constructor
    public DatastoreFieldId() {}

    public DatastoreFieldId(String datastoreType, String section) {
        this.datastoreType = datastoreType;
        this.section = section;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DatastoreFieldId that = (DatastoreFieldId) o;
        return Objects.equals(datastoreType, that.datastoreType) &&
                Objects.equals(section, that.section);
    }

    @Override
    public int hashCode() {
        return Objects.hash(datastoreType, section);
    }
}
