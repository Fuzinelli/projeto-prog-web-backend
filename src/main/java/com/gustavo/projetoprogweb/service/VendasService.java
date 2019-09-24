package com.gustavo.projetoprogweb.service;

import com.gustavo.projetoprogweb.model.VendasEntity;
import com.gustavo.projetoprogweb.model.VendasResponse;


import java.util.List;

public interface VendasService {
    VendasEntity findById(long id);

    List<VendasResponse> findAll();

    VendasEntity add(VendasEntity vendas);

    void deleteById(long id);
}
