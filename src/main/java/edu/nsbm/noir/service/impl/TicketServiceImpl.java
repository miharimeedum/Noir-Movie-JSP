package edu.nsbm.noir.service.impl;

import edu.nsbm.noir.entiy.SeatEntity;
import edu.nsbm.noir.entiy.TicketEntity;
import edu.nsbm.noir.model.Ticket;
import edu.nsbm.noir.repository.CoustomerRepository;
import edu.nsbm.noir.repository.MovieRepository;
import edu.nsbm.noir.repository.SeatRepository;
import edu.nsbm.noir.repository.TicketRepository;
import edu.nsbm.noir.service.TicketService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;


@RequiredArgsConstructor
@Service
public class TicketServiceImpl implements TicketService {
    private final TicketRepository ticketRepository;
    private final CoustomerRepository coustomerRepository;
    private final MovieRepository movieRepository;
    private final SeatRepository seatRepository;
    private final ModelMapper modelMapper;

    @Override
    public void addTicket(Ticket ticket) {
        if (movieRepository.existsById(ticket.getMovieId())
                &&seatRepository.existsById(ticket.getSeatId())
                &&seatRepository.existsById(ticket.getSeatId())
                &&coustomerRepository.existsById(ticket.getCustomerId())) {

            if(seatRepository.findById(ticket.getSeatId()).get().getIsAvailable()) {
                ticketRepository.save(modelMapper.map(ticket, TicketEntity.class));
            }
        }
    }
}

/*private Integer id;
private Integer customerId; fk
private Integer movieId; fk
private Integer seatId; fk   */
