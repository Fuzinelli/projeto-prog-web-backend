package com.gustavo.projetoprogweb.controller;

import com.gustavo.projetoprogweb.model.ClientesEntity;
import com.gustavo.projetoprogweb.model.ClientesResponse;
import com.gustavo.projetoprogweb.service.ClientesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController

@RequestMapping(value = "/clientes")
public class ClientesController {
    @Autowired
    ClientesService clientesService;

    @RequestMapping(value = "/novo", method = RequestMethod.POST)
    public ClientesEntity cadastraCliente(@RequestBody ClientesEntity cliente){
        return clientesService.add(cliente);
    }

    @GetMapping("/getall")
    public List<ClientesResponse> getAll(){

        return clientesService.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteClienteById(@PathVariable("id") long id){
        clientesService.deleteById(id);
    }

    @PutMapping("/update/{id}")
    public ClientesEntity update(@PathVariable("id") long id, @RequestBody ClientesEntity cliente){
        ClientesEntity update = clientesService.findById(id);
        update.setNome(cliente.getNome());
        return clientesService.add(update);
    }

    @GetMapping("/getone/{id}")
    public ClientesEntity getClientesById(@PathVariable("id") long id){
        return clientesService.findById(id);
    }
}
