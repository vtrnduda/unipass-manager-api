package com.unipass.unipass_manager_api.services;

import com.unipass.unipass_manager_api.repository.StudentRepository;
import com.unipass.unipass_manager_api.model.Student;
import com.unipass.unipass_manager_api.model.StatusCadastro;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> findAll() {
        return this.studentRepository.findAll();
    }

    public Optional<Student> findById(Long id) {
        return this.studentRepository.findById(id);
    }

    public List<Student> findByStatusCadastro(StatusCadastro status) {
        return studentRepository.findByStatusCadastro(status);
    }

    public Student save(Student student) {
        return studentRepository.save(student);
    }

    public boolean remove(Long id) {
        Optional<Student> student = this.findById(id);

        if  (student.isPresent()) {
            this.studentRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public Student updateStatusCadastro (Long id, StatusCadastro newStatus){
        Student student = this.findById(id).get();
        student.setStatusCadastro(newStatus);
        return this.studentRepository.save(student);
    }
}
