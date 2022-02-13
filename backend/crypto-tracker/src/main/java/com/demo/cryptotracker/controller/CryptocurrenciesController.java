package com.demo.cryptotracker.controller;

import com.demo.cryptotracker.model.Cryptocurrency;
import com.demo.cryptotracker.service.CryptocurrencyService;

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
    public ResponseEntity<List<Cryptocurrency>> getAll() {
        List<Cryptocurrency> categories = service.getAll();
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cryptocurrency> getById(@PathVariable Long id) {
        Cryptocurrency cryptocurrency = service.getById(id);
        return new ResponseEntity<>(cryptocurrency, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Cryptocurrency> save(@RequestBody Cryptocurrency cryptocurrency) {
        Cryptocurrency savedCryptocurrency = service.save(cryptocurrency);
        return new ResponseEntity<>(savedCryptocurrency, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        service.deleteById(id);
    }

}
