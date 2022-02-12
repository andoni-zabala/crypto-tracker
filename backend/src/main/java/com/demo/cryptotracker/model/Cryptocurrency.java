package com.demo.cryptotracker.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cryptocurrency {
    private String id;
    private String symbol;
    private String name;
    private String hashingAlgorithm;
    private String categories; //could be a class
    private String description;
    private String links; // class
    private String image;
    private String programmingLanguageImplementation;
    private Long releaseYear;
}
