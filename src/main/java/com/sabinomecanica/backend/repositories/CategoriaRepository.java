package com.sabinomecanica.backend.repositories;

import com.sabinomecanica.backend.models.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, String> {
    Optional<Categoria> findById(Integer id);

    void deleteById(Integer id);
}
