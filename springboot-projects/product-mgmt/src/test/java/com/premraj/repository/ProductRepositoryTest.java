package com.premraj.repository;

import com.premraj.model.Product;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author premraj.murugaraj
 */
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class ProductRepositoryTest {

    @Autowired
    private ProductRepository productRepository;

    @Test
    void addProduct(){
        Product product = new Product("Story Books", "The Ant and the Grasshopper", "first cry",79.99,"book", "2025-06-01", true, 40,null,null,null);
        Product addedProduct = productRepository.save(product);
        assertThat(addedProduct).isNotNull();
        assertThat(addedProduct.getId()).isGreaterThan(0);
    }
    @Test
    void getProductById(){
        Product product = productRepository.findById(1).get();
        assertThat(product).isNotNull();
        assertThat(product.getId()).isGreaterThan(0);
    }

    @Test
    public void testFindAll() {
        Iterable<Product> brands = productRepository.findAll();
        brands.forEach(System.out::println);

        assertThat(brands).isNotEmpty();
    }

    @Test
    public void testDelete() {
        Product product = productRepository.findByName("Story Books").get();
        int idToDelete = product.getId();
        productRepository.deleteById(idToDelete);

        Optional<Product> result = productRepository.findById(idToDelete);

        assertThat(result.isEmpty());
    }


}
