package com.unipass.unipass_manager_api.model;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String nomeCompleto;
    @Column
    private String email;
    @Column
    private String matriculaUniPass;
    @Column
    private Boolean statusUsuario;
    @Column
    private String telefone;

    public Student() {}

    public Student(String nomeCompleto, String email, String matriculaUniPass, Boolean statusUsuario, String telefone) {
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.matriculaUniPass = matriculaUniPass;
        this.statusUsuario = statusUsuario;
        this.telefone = telefone;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNomeCompleto() { return nomeCompleto; }
    public void setNomeCompleto(String nomeCompleto) { this.nomeCompleto = nomeCompleto; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getMatriculaUniPass() { return matriculaUniPass; }
    public void setMatriculaUniPass(String matriculaUniPass) { this.matriculaUniPass = matriculaUniPass; }

    public Boolean getStatusUsuario() { return statusUsuario; }
    public void setStatusUsuario(Boolean statusUsuario) { this.statusUsuario = statusUsuario; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }


}