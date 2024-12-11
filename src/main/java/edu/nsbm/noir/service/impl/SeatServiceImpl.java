package edu.nsbm.noir.service.impl;

import edu.nsbm.noir.entiy.SeatEntity;
import edu.nsbm.noir.model.Seat;
import edu.nsbm.noir.repository.SeatRepository;
import edu.nsbm.noir.service.SeatService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class SeatServiceImpl implements SeatService {
    final SeatRepository seatRepository;
    final ModelMapper modelMapper;
    @Override
    public void addSeat(Seat seat) {
        seatRepository.save(modelMapper.map(seat, SeatEntity.class));
    }

    @Override
    public void deleteSeat(Seat seat) {
        seatRepository.deleteById(seat.getId());
    }

    @Override
    public void updateSeat(Seat seat) {
        seatRepository.save(modelMapper.map(seat, SeatEntity.class));
    }

    @Override
    public Seat getSeat(Integer id) {
        return modelMapper.map(seatRepository.findById(id), Seat.class);
    }

    @Override
    public List<Seat> getSeats() {
        List<Seat> seats = new ArrayList<>();
        seatRepository.findAll().forEach(seatEntity -> seats.add(modelMapper.map(seatEntity, Seat.class)));
        return seats;
    }
}
