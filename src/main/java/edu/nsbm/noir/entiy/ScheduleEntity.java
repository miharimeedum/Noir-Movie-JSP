package edu.nsbm.noir.entiy;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


import java.sql.Time;
@Entity
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "schedule")
public class ScheduleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Column(name = "fk_hall_id", nullable = false)
    private Integer hallId;
    @Column(name = "fk_movie_id", nullable = false)
    private Integer movieId;

    private Time time;
}
