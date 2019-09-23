package com.gustavo.projetoprogweb.repository;

import com.gustavo.projetoprogweb.model.ProdutosEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutosRepository extends JpaRepository<ProdutosEntity, Long> {
    ProdutosEntity findById(long id);
    List<ProdutosEntity> findByNome(String nome);
}
