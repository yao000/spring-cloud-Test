package com.qhit.cloudprovider.entity;

import lombok.Data;

@Data
public class User {
    private Long id;
    private String username;
    private String name;
    private Integer age;
    private Double balance;
}
