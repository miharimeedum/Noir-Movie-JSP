package edu.nsbm.noir.service;

import edu.nsbm.noir.model.Schedule;

import java.util.List;

public interface SchduleService {
    void addSchdule(Schedule schedule);
    void removeSchdule(Schedule schedule);
    void updateSchdule(Schedule schedule);
    Schedule getSchduleById(Integer id);
    List<Schedule> getAllSchdules();
}
