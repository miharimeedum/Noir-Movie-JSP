package edu.nsbm.noir.service.impl;

import edu.nsbm.noir.entiy.ScheduleEntity;
import edu.nsbm.noir.model.Schedule;
import edu.nsbm.noir.repository.SchduleRepository;
import edu.nsbm.noir.service.SchduleService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@RequiredArgsConstructor
@Service
public class SchduleServiceImpl implements SchduleService {
    final SchduleRepository schduleRepository;
    final ModelMapper modelMapper;

    @Override
    public void addSchdule(Schedule schedule) {
        schduleRepository.save(modelMapper.map(schedule, ScheduleEntity.class));
    }

    @Override
    public void removeSchdule(Schedule schedule) {
        schduleRepository.deleteById(schedule.getScheduleId());
    }

    @Override
    public void updateSchdule(Schedule schedule) {
        schduleRepository.save(modelMapper.map(schedule, ScheduleEntity.class));
    }

    @Override
    public Schedule getSchduleById(Integer id) {
        return modelMapper.map(schduleRepository.findById(id), Schedule.class);
    }

    @Override
    public List<Schedule> getAllSchdules() {
        List<Schedule> scheduleEntities = new ArrayList<>();
        schduleRepository.findAll().forEach(scheduleEntity -> scheduleEntities.add(modelMapper.map(scheduleEntity, Schedule.class)));
        return scheduleEntities;
    }
}
