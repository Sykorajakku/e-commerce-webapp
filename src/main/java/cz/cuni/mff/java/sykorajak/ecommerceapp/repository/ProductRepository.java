package cz.cuni.mff.java.sykorajak.ecommerceapp.repository;

import cz.cuni.mff.java.sykorajak.ecommerceapp.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
