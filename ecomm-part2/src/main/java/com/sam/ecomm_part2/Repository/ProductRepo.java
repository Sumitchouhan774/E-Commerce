package com.sam.ecomm_part2.Repository;

import com.sam.ecomm_part2.Model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepo extends MongoRepository<Product, Integer> {

}
