package com.sabinomecanica.backend.repositories;

import com.sabinomecanica.backend.models.Despesa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DespesaRepository extends JpaRepository<Despesa, String> {
    Optional<Despesa> findById(Integer id);

    void deleteById(Integer id);
}
