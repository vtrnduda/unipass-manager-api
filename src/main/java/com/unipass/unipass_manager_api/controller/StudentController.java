package com.unipass.unipass_manager_api.controller;

import com.unipass.unipass_manager_api.model.Student;
import com.unipass.unipass_manager_api.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

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

    @GetMapping
    public List<Student> listStudents(){
        return studentService.findAll();
    }

    @PostMapping
    public boolean save(@RequestBody Student student){
        return studentService.create(student);
    }

    public boolean deleteById(@PathVariable Long id){
        return studentService.delete(id);
    }



}