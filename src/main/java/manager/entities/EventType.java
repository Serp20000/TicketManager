package manager.entities;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.NotEmpty;
import javax.persistence.*;

@Entity
@Table(schema="public", name = "eventType")
public class EventType {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id")
    private Integer id;

    @NotEmpty
    @Column(name="type", nullable = false, length = 50)
    private String type;

    public EventType(){}

    public Integer getId() {return id;}

    public void setId(Integer id) {this.id = id;}

    public String getType() {return type;}

    public void setType(String type) {this.type = type;}
}
