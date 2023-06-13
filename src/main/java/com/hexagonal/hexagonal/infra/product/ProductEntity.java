package com.hexagonal.hexagonal.infra.product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "products")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "product_seq")
    @SequenceGenerator(sequenceName = "product_seq",allocationSize = 1,name = "product_seq")
    private Integer id;
    private String name;
    private String description;

}
