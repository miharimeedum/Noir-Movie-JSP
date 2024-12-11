package edu.nsbm.noir.service;

import edu.nsbm.noir.model.Hall;

import java.util.List;

public interface HallSevice {
    void addHall(Hall hall);
    void updateHall(Hall hall);
    void deleteHall(Hall hall);
    List<Hall> getHalls();
    Hall getHall(Integer id);
}
