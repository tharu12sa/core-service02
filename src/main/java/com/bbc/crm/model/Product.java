package com.bbc.crm.model;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Product {
    private String name;
    private String descriptiom;
    private Double price;
    private boolean isActive;
}
