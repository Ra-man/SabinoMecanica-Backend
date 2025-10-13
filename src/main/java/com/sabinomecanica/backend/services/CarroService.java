package com.sabinomecanica.backend.services;

import com.sabinomecanica.backend.models.Carro;
import com.sabinomecanica.backend.repositories.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarroService {

    @Autowired
    private CarroRepository carroRepository;

    public List<Carro> buscarTodos() {
        return carroRepository.findAll();
    }

    public Optional<Carro> buscarPorId(Integer id) {
        return carroRepository.findById(id);
    }

    public Carro salvar(Carro carro) {
        return carroRepository.save(carro);
    }

    public void deletar(Integer id) {
        carroRepository.deleteById(id);
    }
}
