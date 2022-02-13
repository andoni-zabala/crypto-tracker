package com.demo.cryptotracker.repository;

import com.demo.cryptotracker.model.Cryptocurrency;
import com.demo.cryptotracker.service.dto.CryptocurrencyDto;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CryptocurrencyRepository extends ModelEntityRepository<Cryptocurrency, Long> {

    @Query("select new com.demo.cryptotracker.service.dto.CryptocurrencyDto(c.id, c.symbol, c.name, c.hashingAlgorithm, c.categories, c.description, " +
            "c.programmingLanguageImplementation, c.image, c.links, c.releaseYear) from Cryptocurrency c")
    List<CryptocurrencyDto> getAllCryptocurrenciesDto();

    List<Cryptocurrency> findAllByName(String name, Pageable pageable);
}
