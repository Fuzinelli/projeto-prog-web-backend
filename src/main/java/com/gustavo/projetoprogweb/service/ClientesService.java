package com.gustavo.projetoprogweb.service;

import com.gustavo.projetoprogweb.model.ClientesEntity;
import com.gustavo.projetoprogweb.model.ClientesResponse;


import java.util.List;

public interface ClientesService {
    ClientesEntity findById(long id);

    List<ClientesEntity> findByNome(String nome);

    List<ClientesResponse> findAll();

    ClientesEntity add(ClientesEntity clientes);

    void deleteById(long id);
}
