package edu.nsbm.noir.service.impl;

import edu.nsbm.noir.entiy.TicketEntity;
import edu.nsbm.noir.model.Ticket;
import edu.nsbm.noir.repository.TicketRepository;
import edu.nsbm.noir.service.TicketService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;

@RequiredArgsConstructor
public class TicketServiceImpl implements TicketService {
    private final TicketRepository ticketRepository;
    private final ModelMapper modelMapper;
    @Override
    public void addTicket(Ticket ticket) {
        ticketRepository.save(modelMapper.map(ticket, TicketEntity.class));
    }
}
