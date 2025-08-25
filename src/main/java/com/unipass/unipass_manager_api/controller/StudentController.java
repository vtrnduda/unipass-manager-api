package com.unipass.unipass_manager_api.controller;

import com.unipass.unipass_manager_api.model.Student;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id) {
        Student student = new Student();
        student.setId(id);
        student.setNomeCompleto("João Silva");
        student.setEmail("joao@email.com");
        student.setMatriculaUniPass("20250001");
        student.setStatusUsuario(true);
        student.setTelefone("(83) 9999-9999");

        return student;
    }
}