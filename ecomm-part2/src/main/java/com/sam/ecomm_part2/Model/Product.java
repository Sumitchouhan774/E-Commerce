package com.sam.ecomm_part2.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.Date;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    
    private int id;
    private String name;
    private String description;
    private String brand;
    private BigDecimal price;
    private String category;
    private boolean productAvailable;
    private int stockQuantity;
    private String imageName;
    private String imageType;
    private byte[] imageDate;
//
//    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date releaseDate;
}
