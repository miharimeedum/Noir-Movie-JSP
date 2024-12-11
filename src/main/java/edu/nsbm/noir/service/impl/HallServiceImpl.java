package edu.nsbm.noir.service.impl;

import edu.nsbm.noir.entiy.HallEntity;
import edu.nsbm.noir.model.Hall;
import edu.nsbm.noir.repository.HallRepository;
import edu.nsbm.noir.service.HallSevice;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;

import java.util.List;
@RequiredArgsConstructor
public class HallServiceImpl implements HallSevice {
    final HallRepository hallRepository;
    final ModelMapper modelMapper;

    @Override
    public void addHall(Hall hall) {
        hallRepository.save(modelMapper.map(hall, HallEntity.class));
    }

    @Override
    public void updateHall(Hall hall) {
        hallRepository.save(modelMapper.map(hall, HallEntity.class));
    }

    @Override
    public void deleteHall(Hall hall) {
        hallRepository.deleteById(hall.getId());
    }

    @Override
    public List<Hall> getHalls() {
        return List.of();
    }

    @Override
    public Hall getHall(Integer id) {
        return modelMapper.map(hallRepository.findById(id), Hall.class);
    }
}
