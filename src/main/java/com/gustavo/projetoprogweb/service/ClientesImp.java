package com.gustavo.projetoprogweb.service;

import com.gustavo.projetoprogweb.model.ClientesEntity;
import com.gustavo.projetoprogweb.model.ClientesResponse;
import com.gustavo.projetoprogweb.model.VendasEntity;
import com.gustavo.projetoprogweb.repository.ClientesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class ClientesImp implements ClientesService{

    @Autowired
    ClientesRepository clientesRepository;

    @Override
    public ClientesEntity findById(long id) {
        return clientesRepository.findById(id);
    }

    @Override
    public List<ClientesEntity> findByNome(String nome) {
        return clientesRepository.findByNome(nome);
    }

    @Override
    public List<ClientesResponse> findAll() {
        ArrayList<ClientesResponse> clientesResponses = new ArrayList<>();

        clientesRepository.findAll().stream().forEach(clientesEntity -> {
            ClientesResponse clientesResponse = new ClientesResponse();
            clientesResponse.setId(clientesEntity.getId());
            clientesResponse.setNome(clientesEntity.getNome());

            ArrayList<VendasEntity> vendasList = new ArrayList<>();
            clientesEntity.getListaVendas().stream().forEach(vendasEntity -> {
                VendasEntity venda = new VendasEntity();
                venda.setId(vendasEntity.getId());
                venda.setData(vendasEntity.getData());
                vendasList.add(venda);
            });
            clientesResponse.setVendas(vendasList);
            clientesResponses.add(clientesResponse);
        });
        return clientesResponses;
    }


    @Override
    public ClientesEntity add(ClientesEntity clientes) {
        return clientesRepository.save(clientes);
    }

    @Override
    public void deleteById(long id) {
        clientesRepository.deleteById(id);
    }
}
