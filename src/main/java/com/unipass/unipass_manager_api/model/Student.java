package com.unipass.unipass_manager_api.model;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeCompleto;

    @Column(nullable = true)
    private String email;

    private String matriculaUniPass;
    private Boolean statusUsuario;

    @Column(nullable = true)
    private String telefone;

    private String cpf;
    private String rg;
    private String dataNascimento;
    private String universidade;
    private String campus;
    private String turno;
    private String previsaoConclusao;
    private String declaracaoVinculoUrl;
    private String comprovanteResidenciaUrl;

    @Enumerated(EnumType.STRING)
    private StatusCadastro statusCadastro = StatusCadastro.PENDENTE;

    public Student() {}

    public Student(String nomeCompleto, String email,
                   String telefone, String cpf, String rg,
                   String dataNascimento, String universidade, String campus,
                   String turno, String previsaoConclusao,
                   String declaracaoVinculoUrl, String comprovanteResidenciaUrl) {

        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.telefone = telefone;
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
        this.universidade = universidade;
        this.campus = campus;
        this.turno = turno;
        this.previsaoConclusao = previsaoConclusao;
        this.declaracaoVinculoUrl = declaracaoVinculoUrl;
        this.comprovanteResidenciaUrl = comprovanteResidenciaUrl;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getUniversidade() {
        return universidade;
    }

    public void setUniversidade(String universidade) {
        this.universidade = universidade;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getPrevisaoConclusao() {
        return previsaoConclusao;
    }

    public void setPrevisaoConclusao(String previsaoConclusao) {
        this.previsaoConclusao = previsaoConclusao;
    }

    public String getDeclaracaoVinculoUrl() {
        return declaracaoVinculoUrl;
    }

    public void setDeclaracaoVinculoUrl(String declaracaoVinculoUrl) {
        this.declaracaoVinculoUrl = declaracaoVinculoUrl;
    }

    public String getComprovanteResidenciaUrl() {
        return comprovanteResidenciaUrl;
    }

    public void setComprovanteResidenciaUrl(String comprovanteResidenciaUrl) {
        this.comprovanteResidenciaUrl = comprovanteResidenciaUrl;
    }

    public StatusCadastro getStatusCadastro() {
        return statusCadastro;
    }

    public void setStatusCadastro(StatusCadastro statusCadastro) {
        this.statusCadastro = statusCadastro;
    }
}