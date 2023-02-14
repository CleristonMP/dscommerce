package com.cmp.dscommerce.dtos;

import com.cmp.dscommerce.entities.Product;
import jakarta.validation.constraints.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ProductDTO {

    private Long id;
    @Size(min = 3, max = 80, message = "O nome precisa ter no mínimo 3 e no máximo 80 caracteres")
    @NotBlank(message = "Campo requerido")
    private String name;
    @Size(min = 10, message = "A descrição precisa ter no mínimo 10 caracteres")
    @NotBlank(message = "Campo requerido")
    private String description;
    @Positive(message = "O preço deve ser positivo")
    private Double price;
    private String imgUrl;

    public ProductDTO(Long id, String name, String description, Double price, String imgUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imgUrl = imgUrl;
    }

    public ProductDTO(Product entity) {
        id = entity.getId();;
        name = entity.getName();
        description = entity.getDescription();
        price = entity.getPrice();
        imgUrl = entity.getImgUrl();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    public String getImgUrl() {
        return imgUrl;
    }
}
