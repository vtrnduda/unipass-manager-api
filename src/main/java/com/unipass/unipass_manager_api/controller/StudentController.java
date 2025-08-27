package com.unipass.unipass_manager_api.controller;

import com.unipass.unipass_manager_api.model.Student;
import com.unipass.unipass_manager_api.model.StatusCadastro;
import com.unipass.unipass_manager_api.services.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
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
    public ResponseEntity<List<Student>> getAllStudents(
            @RequestParam(required = false) String statusCadastro) {

        if (statusCadastro != null) {
            StatusCadastro status = StatusCadastro.valueOf(statusCadastro.toUpperCase());
            System.out.println("Status convertido: " + status);
            System.out.println("Encontrados: " + studentService.findByStatusCadastro(status).size() + " estudantes");

            return ResponseEntity.ok(studentService.findByStatusCadastro(status));
        }

        return ResponseEntity.ok(studentService.findAll());
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