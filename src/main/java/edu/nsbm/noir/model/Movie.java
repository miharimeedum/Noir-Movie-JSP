package edu.nsbm.noir.model;

import lombok.Data;
import lombok.ToString;

import java.sql.Date;
import java.sql.Time;

@Data
@ToString
public class Movie {
    private Integer id;
    private String title;
    private Date releaseDate;
    private Time duration;
    private String description;
    private String posterUrl;
    private String trailerUrl;
    private String genre;
}
