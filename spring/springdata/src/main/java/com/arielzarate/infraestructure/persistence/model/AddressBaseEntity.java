package com.arielzarate.infraestructure.persistence.model;


import jakarta.persistence.*;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "address")
public class AddressBaseEntity extends BaseEntity {
    @Column(name = "street")
    private String street;
    @Column(name = "city")
    private String city;
    @Column(name = "state")
    private String state;
    @Column(name = "zip_code")
    private String zipCode;
    @Column(name = "country")
    private String country;

}
