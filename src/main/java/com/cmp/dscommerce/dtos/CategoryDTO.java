package com.cmp.dscommerce.dtos;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

public class CategoryDTO {

    private Long id;
    private String name;
    private Set<ProductDTO> products = new HashSet<>();

    public CategoryDTO(){
    }

    public CategoryDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<ProductDTO> getProducts() {
        return products;
    }
}
