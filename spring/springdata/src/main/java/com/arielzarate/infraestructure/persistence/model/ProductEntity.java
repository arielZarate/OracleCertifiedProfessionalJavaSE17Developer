package com.arielzarate.infraestructure.persistence.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;


@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "product")
@Setter
@Getter
public class ProductEntity extends BaseEntity {

    @Column(name = "product_id", nullable = false, unique = true)
    private Long productId;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "price", nullable = false)
    private Double price;

    @Column(name = "stock", nullable = false)
    private Integer stock;


}



/**
 * Mucho cuidado al usar lombok en las entidades JPA, ya que puede generar problemas con los proxies y la carga perezosa (lazy loading).
 * En este caso, se ha utilizado @Data y @EqualsAndHashCode(callSuper = true) para incluir los campos de la clase base.
 * Asegúrate de probar bien las entidades y considerar usar @Getter y @Setter en lugar de @Data si encuentras problemas.
 * */