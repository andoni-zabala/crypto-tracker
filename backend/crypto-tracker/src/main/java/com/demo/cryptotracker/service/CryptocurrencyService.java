package com.demo.cryptotracker.service;

import com.demo.cryptotracker.model.Cryptocurrency;
import com.demo.cryptotracker.repository.CryptocurrencyRepository;
import com.demo.cryptotracker.service.dto.CryptocurrencyDto;
import com.demo.cryptotracker.service.mapper.CryptocurrencyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CryptocurrencyService {

    @Autowired
    private CryptocurrencyRepository repository;

    @Autowired
    private CryptocurrencyMapper mapper;

    public List<CryptocurrencyDto> getAll() {
        return repository.getAllCryptocurrenciesDto();
    }

    public CryptocurrencyDto getById(Long id) {
        Cryptocurrency cryptocurrency = repository.getById(id);
        return mapper.toDto(cryptocurrency);
    }

    public CryptocurrencyDto save(Cryptocurrency cryptocurrency) {
        Cryptocurrency savedCryptocurrency = repository.save(cryptocurrency);
        return mapper.toDto(savedCryptocurrency);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
