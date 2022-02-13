package com.demo.cryptotracker.service.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CryptocurrencyDto extends ModelEntityDto<Long> {

    private String symbol;
    private String name;
    private String hashingAlgorithm;
    private String categories;
    private String description;
    private String programmingLanguageImplementation;
    private String image;
    private String links;
    private Long releaseYear;

    public CryptocurrencyDto(Long id, String symbol, String name, String hashingAlgorithm, String categories, String description,
                             String programmingLanguageImplementation, String image, String links, Long releaseYear) {
        super(id);
        this.symbol = symbol;
        this.name = name;
        this.hashingAlgorithm = hashingAlgorithm;
        this.categories = categories;
        this.description = description;
        this.programmingLanguageImplementation = programmingLanguageImplementation;
        this.image = image;
        this.links = links;
        this.releaseYear = releaseYear;
    }
}