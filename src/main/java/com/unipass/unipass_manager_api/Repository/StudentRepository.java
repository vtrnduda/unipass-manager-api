package com.unipass.unipass_manager_api.Repository;

import com.unipass.unipass_manager_api.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
