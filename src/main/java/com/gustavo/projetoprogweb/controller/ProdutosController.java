package com.gustavo.projetoprogweb.controller;

import com.gustavo.projetoprogweb.model.ClientesEntity;
import com.gustavo.projetoprogweb.model.ProdutosEntity;
import com.gustavo.projetoprogweb.service.ProdutosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutosController {
    @Autowired
    ProdutosService produtosService;
    @PostMapping("/novo")
    public ProdutosEntity cadastraProdutos(@RequestBody ProdutosEntity produto){
        return produtosService.add(produto);
    }
    @GetMapping("/getall")
    public List<ProdutosEntity> getAll(){

        return produtosService.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteProdutoById(@PathVariable("id") long id){
        produtosService.deleteById(id);
    }

    @PutMapping("/update/{id}")
    public ProdutosEntity update(@PathVariable ("id") long id, @RequestBody ProdutosEntity produto){
        ProdutosEntity update = produtosService.findById(id);
        update.setNome(produto.getNome());
        update.setPreco(produto.getPreco());
        return produtosService.add(update);
    }

    @GetMapping("/getone{id}")
    public ProdutosEntity getProdutoById(@PathVariable("id") long id){
        return produtosService.findById(id);
    }
}
