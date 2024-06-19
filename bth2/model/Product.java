package com.example.bth2.model;
import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double price;
    private String description;
    private String ImageUrl ;
    @ManyToOne
    @JoinColumn(name = "Category_id", nullable = false)
    private Category category;
}
