package com.gustavo.projetoprogweb.model;

import lombok.Data;

import java.util.List;

@Data
public class ClientesResponse {
    private Long id;
    private String nome;
    private List<VendasEntity> vendas;
}
