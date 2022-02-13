package com.demo.cryptotracker.controller;

import com.demo.cryptotracker.model.Cryptocurrency;
import com.demo.cryptotracker.service.CryptocurrencyService;

import com.demo.cryptotracker.service.dto.CryptocurrencyDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/cryptocurrencies")
public class CryptocurrenciesController {

    @Autowired
    private CryptocurrencyService service;

    @GetMapping
    public ResponseEntity<List<CryptocurrencyDto>> getAll() {
        List<CryptocurrencyDto> cryptocurrencyDtos = service.getAll();
        return new ResponseEntity<>(cryptocurrencyDtos, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CryptocurrencyDto> getById(@PathVariable Long id) {
        CryptocurrencyDto cryptocurrencyDto = service.getById(id);
        return new ResponseEntity<>(cryptocurrencyDto, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<CryptocurrencyDto> save(@RequestBody Cryptocurrency cryptocurrency) {
        CryptocurrencyDto savedCryptocurrency = service.save(cryptocurrency);
        return new ResponseEntity<>(savedCryptocurrency, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        service.deleteById(id);
    }

}
