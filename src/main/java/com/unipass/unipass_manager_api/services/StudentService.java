package com.unipass.unipass_manager_api.services;

import com.unipass.unipass_manager_api.Repository.StudentRepository;
import com.unipass.unipass_manager_api.model.Student;

import java.util.List;

public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> findAll() {
        return this.studentRepository.findAll();
    }

    public Student findById(Long id) {
        return this.studentRepository.findById(id).orElse(null);
    }

    public boolean create(Student student) {
        return this.studentRepository.save(student) != null?true:false;

    }

    public boolean delete(Student student) {
        this.studentRepository.delete(student);
        return true;
    }
}
