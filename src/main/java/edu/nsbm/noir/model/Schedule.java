package edu.nsbm.noir.model;

import lombok.Data;
import lombok.ToString;

import java.sql.Time;

@Data
@ToString
public class Schedule {
    private Integer scheduleId;
    private Integer hallId;
    private Integer movieId;
    private Time time;
}
