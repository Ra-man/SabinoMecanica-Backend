package com.sabinomecanica.backend.repositories;

import com.sabinomecanica.backend.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, String> {
    void deleteById(int id);

    Optional<Cliente> findById(int id);
}
