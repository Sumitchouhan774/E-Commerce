package com.sam.ecomm_part2.Service;

import com.sam.ecomm_part2.Model.Product;
import com.sam.ecomm_part2.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo repo;

    public List<Product> getAll() {
        return repo.findAll();
    }

    public Product addProduct(Product product, MultipartFile imageFile) throws IOException {

        product.setImageName(imageFile.getOriginalFilename());
        product.setImageType(imageFile.getContentType());
        product.setImageDate(imageFile.getBytes());

        return repo.save(product);
    }

    public Product getProductById(int id) {
        return repo.findById(id).orElse(new Product());
    }
}
