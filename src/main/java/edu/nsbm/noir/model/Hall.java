package edu.nsbm.noir.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Hall {
    private Integer id;
    private Integer capacity;
    private String hallName;
}
