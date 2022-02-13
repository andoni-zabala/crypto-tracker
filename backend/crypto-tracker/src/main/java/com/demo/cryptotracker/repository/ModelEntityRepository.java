package com.demo.cryptotracker.repository;

import com.demo.cryptotracker.model.ModelEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModelEntityRepository<E extends ModelEntity<T>, T> extends JpaRepository<E, T> {

}
