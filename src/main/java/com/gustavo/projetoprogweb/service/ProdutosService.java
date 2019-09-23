package com.gustavo.projetoprogweb.service;

import com.gustavo.projetoprogweb.model.ProdutosEntity;



import java.util.List;

public interface ProdutosService {
    ProdutosEntity findById(long id);

    List<ProdutosEntity> findByNome(String nome);

    List<ProdutosEntity> findAll();

    ProdutosEntity add(ProdutosEntity produtos);

    void deleteById(long id);
}
