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

    @Column(name="description", length = 500)
    private String description;

    @Column
    String DATE_FORMAT = "dd-MM-yyyy  hh:mm";
    private Date date = new Date();

    @Column(name = "isDeleted")
    private boolean isDeleted;

    @NotEmpty
    @Column(name = "TimeStamp", nullable = false)
    private Date timeStamp = new Date();


    public Event() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }
}
