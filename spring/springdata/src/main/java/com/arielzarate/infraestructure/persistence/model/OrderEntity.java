package com.arielzarate.infraestructure.persistence.model;

import com.arielzarate.domain.model.Client;
import com.arielzarate.domain.model.Product;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@EqualsAndHashCode(callSuper = true, onlyExplicitlyIncluded = true)
@Entity
@Table(name = "orders")
@Setter
@Getter
public class OrderEntity extends BaseEntity{

    @ManyToMany
   @JoinTable(
           name = "order_product",
           joinColumns = @JoinColumn(name = "order_id"),
           inverseJoinColumns = @JoinColumn(name = "product_id")
   )
    private List<ProductEntity> products;

    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)  // columna FK en la tabla order
    private ClientEntity clientEntity;

    private LocalDateTime orderDate; // fecha del pedido


}
