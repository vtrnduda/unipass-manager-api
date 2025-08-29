package com.unipass.unipass_manager_api.controller;

import com.unipass.unipass_manager_api.dto.StudentUpdateRequest;
import com.unipass.unipass_manager_api.model.Student;
import com.unipass.unipass_manager_api.model.StatusCadastro;
import com.unipass.unipass_manager_api.services.StudentService;
import com.unipass.unipass_manager_api.dto.StudentListDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.Map;

import java.util.List;

@CrossOrigin(
        origins = "http://localhost:4200",
        methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PATCH}
)
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
    public ResponseEntity<List<StudentListDTO>> getAllStudents(
            @RequestParam(required = false) String statusCadastro) {

        List<Student> students;

        if (statusCadastro != null) {
            StatusCadastro status = StatusCadastro.valueOf(statusCadastro.toUpperCase());
            students = studentService.findByStatusCadastro(status);
        } else {
            students = studentService.findAll();
        }

        // Converte para DTO
        List<StudentListDTO> dtoList = students.stream()
                .map(StudentListDTO::new)
                .toList();

        return ResponseEntity.ok(dtoList);
    }

    @PostMapping
    public boolean createStudent(@RequestBody Student student){
        Student saved = studentService.save(student);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved).hasBody();
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Student> atualizarStatus(@PathVariable Long id, @RequestBody Map<String, String> updates) {
        String novoStatus = updates.get("statusCadastro");
        StatusCadastro status = StatusCadastro.valueOf(novoStatus);
        Student updated = studentService.updateStatusCadastro(id, status);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    public boolean deleteById(@PathVariable Long id){
        return studentService.remove(id);
    }

}