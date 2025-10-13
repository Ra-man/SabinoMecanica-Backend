package com.sabinomecanica.backend.repositories;

import com.sabinomecanica.backend.models.Carro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CarroRepository extends JpaRepository<Carro, String> {
    Optional<Carro> findById(Integer id);
    void deleteById(Integer id);
}
