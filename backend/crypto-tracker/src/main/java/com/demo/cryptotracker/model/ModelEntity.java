package com.demo.cryptotracker.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.MappedSuperclass;

@Getter
@Setter
@MappedSuperclass
public abstract class ModelEntity<T> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) protected T id;
}
