package com.sabinomecanica.backend.repositories;

import com.sabinomecanica.backend.models.MovtoEntrada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovtoEntradaRepository extends JpaRepository<MovtoEntrada, String> {
    Optional<MovtoEntrada> findById(Integer id);

    void deleteById(Integer id);
}
