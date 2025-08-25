package com.unipass.unipass_manager_api.services;

import com.unipass.unipass_manager_api.Repository.StudentRepository;

public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

}
