package com.arielzarate.infraestructure.persistence.model;


import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "address_client")
@Entity
public class AddressClientEntity extends AddressBaseEntity{

    @ManyToOne
    private ClientEntity clientEntity;

}
