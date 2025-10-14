package com.arielzarate.domain.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client {

    private Long clientId;
    private String name;
    private String email;
    private String phone;


}
