package com.unipass.unipass_manager_api.model;

import com.fasterxml.jackson.annotation.JsonCreator;

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

    @JsonCreator
    public static StatusCadastro fromString(String text) {
        for (StatusCadastro status : StatusCadastro.values()) {
            if (status.name().equalsIgnoreCase(text)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Nenhum status encontrado para o valor: " + text);
    }
}