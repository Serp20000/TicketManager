package manager.entities;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.NotEmpty;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(schema="public", name = "event")
public class Event {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id")
    private Integer id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "eventType_id")
    private EventType type;

    @NotEmpty
    @Column(name="description", nullable = false, length = 500)
    private String description;

    @Column
    String DATE_FORMAT = "dd-MM-yyyy  hh:mm";
    private Date date = new Date();

    public Event() {
    }

    public Integer getId() {return id;}

    public void setId(Integer id) {this.id = id;}

    public EventType getType() {return type;}

    public void setType(EventType type) {this.type = type;}

    public String getDescription() {return description;}

    public void setDescription(String description) {this.description = description;}

    public Date getDate() {return date;}

    public void setDate(Date date) {this.date = date;}
}
