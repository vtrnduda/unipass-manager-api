package com.unipass.unipass_manager_api.model;

public enum StatusCadastro {
    PENDENTE("Pendente"),
    APROVADO("Aprovado"),
    RECUSADO("Recusado"),
    CANCELADO("Cancelado");

    private String valor;

    StatusCadastro(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
}