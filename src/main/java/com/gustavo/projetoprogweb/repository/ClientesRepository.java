package com.gustavo.projetoprogweb.repository;

import com.gustavo.projetoprogweb.model.ClientesEntity;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface ClientesRepository extends JpaRepository<ClientesEntity, Long > {
    ClientesEntity findById(long id);
    List<ClientesEntity> findByNome(String nome);
}
