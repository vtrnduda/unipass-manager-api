package com.unipass.unipass_manager_api.repository;

import com.unipass.unipass_manager_api.model.Student;
import com.unipass.unipass_manager_api.model.StatusCadastro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByStatusCadastro(StatusCadastro statusCadastro);
}
