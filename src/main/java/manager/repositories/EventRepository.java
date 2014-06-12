package manager.repositories;


import manager.entities.Event;
import org.springframework.data.repository.CrudRepository;

public interface EventRepository extends CrudRepository<Event, Long>{
        Event findOneByDescription(String description);
    }
