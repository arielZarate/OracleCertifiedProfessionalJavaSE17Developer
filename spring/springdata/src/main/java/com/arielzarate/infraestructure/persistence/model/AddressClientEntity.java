package com.arielzarate.infraestructure.persistence.model;


import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "address_client")
@Data
public class AddressClientEntity extends AddressBaseEntity{

    @ManyToOne
    private ClientEntity clientEntity;

}
