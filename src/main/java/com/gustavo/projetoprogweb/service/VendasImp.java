package com.gustavo.projetoprogweb.service;

import com.gustavo.projetoprogweb.model.VendasEntity;
import com.gustavo.projetoprogweb.model.VendasResponse;
import com.gustavo.projetoprogweb.repository.VendasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class VendasImp implements VendasService{


    @Autowired
    VendasRepository vendasRepository;

    @Override
    public VendasEntity findById(long id) {
        return vendasRepository.findById(id);
    }


    @Override
    public List<VendasResponse> findAll() {
        ArrayList<VendasResponse> vendasResponses = new ArrayList<>();

       for (VendasEntity vendasEntity: vendasRepository.findAll()){
           VendasResponse vendasResponse = new VendasResponse();
           vendasResponse.setId(vendasEntity.getId());
           vendasResponse.setData(vendasEntity.getData());
           vendasResponse.setCliente_id(vendasEntity.getClientes().getId());
           vendasResponses.add(vendasResponse);
       }
        return vendasResponses;
    }

    @Override
    public VendasEntity add(VendasEntity vendas) {
        return vendasRepository.save(vendas);
    }

    @Override
    public void deleteById(long id) {
        vendasRepository.deleteById(id);
    }
}
