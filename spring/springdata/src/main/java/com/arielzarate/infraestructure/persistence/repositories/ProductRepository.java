package com.arielzarate.infraestructure.persistence.repositories;

import com.arielzarate.infraestructure.persistence.model.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductRepository extends JpaRepository<ProductEntity, UUID> {

}
