package main.java.entities;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "product", schema = "public")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "cost")
    private int cost;


}
