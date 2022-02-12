package com.demo.cryptotracker.service;

import com.demo.cryptotracker.model.Cryptocurrency;
import com.demo.cryptotracker.repository.CryptocurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CryptocurrencyService {

    @Autowired
    private CryptocurrencyRepository repository;

    public List<Cryptocurrency> getAll() {
        return repository.findAll();
    }

    public Cryptocurrency getById(Long id) {
        return repository.getById(id);
    }

    public Cryptocurrency save(Cryptocurrency cryptocurrency) {
        return repository.save(cryptocurrency);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
