package manager.repositories;


import manager.entities.Event;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import java.util.Date;
import java.util.List;

public interface EventRepository extends CrudRepository<Event, Long>{

    List<Event> findAll();

    @Query("SELECT e FROM Event e WHERE e.date>now())")
    List<Event> findAllByData();
    }
