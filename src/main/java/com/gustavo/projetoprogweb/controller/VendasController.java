package com.gustavo.projetoprogweb.controller;


import com.gustavo.projetoprogweb.model.ClientesEntity;
import com.gustavo.projetoprogweb.model.VendasEntity;
import com.gustavo.projetoprogweb.model.VendasResponse;
import com.gustavo.projetoprogweb.service.VendasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/vendas")
public class VendasController {
    @Autowired
    VendasService vendasService;

    @RequestMapping(value = "/novo", method = RequestMethod.POST)
    public VendasEntity cadastraVenda(@RequestBody VendasEntity venda){
        return vendasService.add(venda);
    }

    @GetMapping("/getall")
    public List<VendasResponse> getAll(){

        return vendasService.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteVendaById(@PathVariable("id") Long id){
        vendasService.deleteById(id);
    }

    @PutMapping("/update/{id}")
    public VendasEntity update(@PathVariable("id") long id, @RequestBody VendasEntity venda){
        VendasEntity update = vendasService.findById(id);
        update.setData(venda.getData());
        update.setClientes(venda.getClientes());
        return vendasService.add(update);
    }

    @GetMapping("/getone/{id}")
    public VendasEntity getVendasById(@PathVariable("id") Long id ){
        return vendasService.findById(id);
    }
}
