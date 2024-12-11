package edu.nsbm.noir.model;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
public class Payment {
    private Integer ticketId;
    private String paymentMethod;
    private Long paymentAmount;
//    private Boolean payMethod;
    private Date paymentDate;
}