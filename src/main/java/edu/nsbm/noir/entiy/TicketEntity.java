package edu.nsbm.noir.entiy;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "ticket" )
public class TicketEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "fk_customer_id", nullable = false)
    private Integer customerId; // Fk From customer

    @Column(name = "fk_movie_id", nullable = false)
    private Integer movieId; // Fk From movie

    @Column(name = "fk_seat_id", nullable = false)
    private Integer seatd; // Fk From seat
}
