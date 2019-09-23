package com.gustavo.projetoprogweb.service;

import com.gustavo.projetoprogweb.model.ProdutosEntity;
import com.gustavo.projetoprogweb.repository.ProdutosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import java.util.List;

@Service
public class ProdutosImp implements ProdutosService{
    @Autowired
    ProdutosRepository produtosRepository;

    @Override
    public ProdutosEntity findById(long id) {
        return produtosRepository.findById(id);
    }

    @Override
    public List<ProdutosEntity> findByNome(String nome) {
        return produtosRepository.findByNome(nome);
    }

    @Override
    public List<ProdutosEntity> findAll() {
        return produtosRepository.findAll();
    }

    @Override
    public ProdutosEntity add(ProdutosEntity clientes) {
        return produtosRepository.save(clientes);
    }

    @Override
    public void deleteById(long id) {
        produtosRepository.deleteById(id);
    }
}
