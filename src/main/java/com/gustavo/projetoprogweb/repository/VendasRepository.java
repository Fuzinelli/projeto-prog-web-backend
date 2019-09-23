package com.gustavo.projetoprogweb.repository;

import com.gustavo.projetoprogweb.model.VendasEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendasRepository extends JpaRepository<VendasEntity, Long> {
    VendasEntity findById(long id);
}
