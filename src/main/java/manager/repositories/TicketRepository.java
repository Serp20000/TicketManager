package manager.repositories;


import manager.entities.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketRepository extends CrudRepository <Ticket, Long>{
}
