package com.unipass.unipass_manager_api.controller;

import com.unipass.unipass_manager_api.model.Student;
import com.unipass.unipass_manager_api.services.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<Student> getStudentById(@PathVariable Long id) {
        return studentService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> students = studentService.findAll();
        return ResponseEntity.ok(students);
    }

    @PostMapping
    public boolean createStudent(@RequestBody Student student){
        Student saved = studentService.save(student);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved).hasBody();
    }

    @DeleteMapping("/{id}")
    public boolean deleteById(@PathVariable Long id){
        return studentService.remove(id);
    }

}