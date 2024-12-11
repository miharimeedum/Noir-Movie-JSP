package edu.nsbm.noir.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Customer {
    private Integer id;
    private String name;
    private String email;
    private String phone;

}
