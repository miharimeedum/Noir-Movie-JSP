package edu.nsbm.noir.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Review {
    private Integer id;
    private String comment;
    private Date date;
    private Integer rating;

    private Integer movieId; // foreign key from movie table
    private Integer customerId; // foreign key from customer table
}
