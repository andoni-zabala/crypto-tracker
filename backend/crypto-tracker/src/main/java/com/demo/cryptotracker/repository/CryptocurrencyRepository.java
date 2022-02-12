package com.demo.cryptotracker.repository;

import com.demo.cryptotracker.model.Cryptocurrency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CryptocurrencyRepository extends JpaRepository<Cryptocurrency, Long> {

}
