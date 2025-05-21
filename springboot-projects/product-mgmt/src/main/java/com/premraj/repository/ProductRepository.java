package com.premraj.repository;

import com.premraj.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author premraj.murugaraj
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
