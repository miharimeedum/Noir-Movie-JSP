package edu.nsbm.noir.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Seat {
    private Integer id;
    private Integer seatNumber;
    private Boolean isAvailable;

    private Integer hallId; // Fk From Hall
}
