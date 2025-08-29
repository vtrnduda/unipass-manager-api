package com.unipass.unipass_manager_api.dto;

import com.unipass.unipass_manager_api.model.StatusCadastro;

public class StudentUpdateRequest {

    private StatusCadastro  status;

    public StatusCadastro getStatus() {
        return status;
    }

    public void setStatus(StatusCadastro status) {
        this.status = status;
    }
}
