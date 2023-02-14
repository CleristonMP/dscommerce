package com.cmp.dscommerce.dtos;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

public class CategoryDTO {

    private Long id;
    private String name;

    public CategoryDTO(){
    }

    public CategoryDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
