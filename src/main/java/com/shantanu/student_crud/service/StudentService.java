package com.shantanu.student_crud.service;

import com.shantanu.student_crud.entity.Student;
import com.shantanu.student_crud.repository.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class StudentService {

    private static final Logger log = LoggerFactory.getLogger(StudentService.class);
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        log.debug("Fetching all students");
        return studentRepository.findAll();
    }

    public Optional<Student> getStudentById(Long id) {
        log.debug("Fetching student with ID: {}", id);
        return studentRepository.findById(id);
    }

    public Student createStudent(Student student) {
        log.debug("Creating new student: {}", student);
        return studentRepository.save(student);
    }

    public Student updateStudent(Long id, Student studentDetails) {

        Optional<Student> studentOptional = studentRepository.findById(id);
        if (studentOptional.isPresent()) {
            log.debug("Updating student with ID: {}", id);
            Student student = studentOptional.get();
            student.setFirstName(studentDetails.getFirstName());
            student.setLastName(studentDetails.getLastName());
            student.setEmail(studentDetails.getEmail());
            return studentRepository.save(student);
        } else {
            log.warn("Student with ID: {} not found", id);
            return null; // or throw an exception
        }
    }

    public void deleteStudent(Long id) {
        log.debug("Deleting student with ID: {}", id);
        studentRepository.deleteById(id);
    }
}
