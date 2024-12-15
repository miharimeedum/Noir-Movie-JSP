package edu.nsbm.noir.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {
    private Integer id;
    private Integer customerId;
    private Integer movieId;
    private Integer seatId;

}
