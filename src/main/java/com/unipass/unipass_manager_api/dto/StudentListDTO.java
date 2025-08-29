// StudentListDTO.java
package com.unipass.unipass_manager_api.dto;

import com.unipass.unipass_manager_api.model.StatusCadastro;
import com.unipass.unipass_manager_api.model.Student;

public class StudentListDTO {
    private Long id;
    private String nomeCompleto;
    private String cpf;
    private String universidade;
    private String campus;
    private String dataNascimento;
    private StatusCadastro statusCadastro;

    // Construtor vazio
    public StudentListDTO() {}

    // Construtor a partir de Student
    public StudentListDTO(Student student) {
        this.id = student.getId();
        this.nomeCompleto = student.getNomeCompleto();
        this.cpf = student.getCpf();
        this.universidade = student.getUniversidade();
        this.campus = student.getCampus();
        this.dataNascimento = student.getDataNascimento();
        this.statusCadastro = student.getStatusCadastro();
    }

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNomeCompleto() { return nomeCompleto; }
    public void setNomeCompleto(String nomeCompleto) { this.nomeCompleto = nomeCompleto; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getUniversidade() { return universidade; }
    public void setUniversidade(String universidade) { this.universidade = universidade; }

    public String getCampus() { return campus; }
    public void setCampus(String campus) { this.campus = campus; }

    public String getDataNascimento() { return dataNascimento; }
    public void setDataNascimento(String dataNascimento) { this.dataNascimento = dataNascimento; }

    public StatusCadastro getStatusCadastro() { return statusCadastro; }
    public void setStatusCadastro(StatusCadastro statusCadastro) { this.statusCadastro = statusCadastro; }
}