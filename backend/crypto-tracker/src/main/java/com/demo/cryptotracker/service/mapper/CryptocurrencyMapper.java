package com.demo.cryptotracker.service.mapper;

import com.demo.cryptotracker.model.Cryptocurrency;
import com.demo.cryptotracker.service.dto.CryptocurrencyDto;
import org.springframework.stereotype.Service;

@Service
public class CryptocurrencyMapper extends ModelEntityMapper<Cryptocurrency, CryptocurrencyDto> {

    public Cryptocurrency toModel(CryptocurrencyDto dto) {
        Cryptocurrency model = super.toModel(dto, Cryptocurrency.class);

        model.setSymbol(dto.getSymbol());
        model.setName(dto.getName());
        model.setHashingAlgorithm(dto.getHashingAlgorithm());
        model.setCategories(dto.getCategories());
        model.setDescription(dto.getDescription());
        model.setProgrammingLanguageImplementation(dto.getProgrammingLanguageImplementation());
        model.setImage(dto.getImage());
        model.setLinks(dto.getLinks());
        model.setReleaseYear(dto.getReleaseYear());

        return model;
    }

    public CryptocurrencyDto toDto(Cryptocurrency model) {
        CryptocurrencyDto dto = super.toDto(model, CryptocurrencyDto.class);

        dto.setId(model.getId());
        dto.setSymbol(model.getSymbol());
        dto.setName(model.getName());
        dto.setHashingAlgorithm(model.getHashingAlgorithm());
        dto.setCategories(model.getCategories());
        dto.setDescription(model.getDescription());
        dto.setProgrammingLanguageImplementation(model.getProgrammingLanguageImplementation());
        dto.setImage(model.getImage());
        dto.setLinks(model.getLinks());
        dto.setReleaseYear(model.getReleaseYear());

        return dto;
    }
}
