package com.demo.cryptotracker.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.persistence.Entity;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Cryptocurrency extends ModelEntity<Long> {

    @NotNull
    private String symbol;

    @NotNull
    private String name;

    private String hashingAlgorithm;
    private String categories;
    private String description;
    private String programmingLanguageImplementation;
    private String image;
    private String links;
    private Long releaseYear;
}
