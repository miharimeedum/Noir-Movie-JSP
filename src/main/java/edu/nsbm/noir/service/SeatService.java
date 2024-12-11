package edu.nsbm.noir.service;

import edu.nsbm.noir.model.Seat;

import java.util.List;

public interface SeatService {
    void addSeat(Seat seat);
    void deleteSeat(Seat seat);
    void updateSeat(Seat seat);
    Seat getSeat(Integer id);
    List<Seat> getSeats();
}
