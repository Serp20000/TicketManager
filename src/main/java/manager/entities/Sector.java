package manager.entities;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.NotEmpty;
import javax.persistence.*;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "sector")
public class Sector {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id")
    private Integer id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "event_id")
    private Event event;

    @Column(name="name", nullable = false)
    @Size(min=1, max=2)
    //@Pattern(regexp="[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\.[A-Za-z]{2,4}",message="Invalid email address.")
    @Pattern(regexp="^[10-19adA20-25D1-9]", message="sector must be in range 1-25 or A or D")
    private String name;

    @NotEmpty
    @Column(name = "price")
    private Float price;

    public Sector() {}


    public Integer getId() {return id;}

    public void setId(Integer id) {this.id = id;}

    public Event getEvent() {return event;}

    public void setEvent(Event event) {this.event = event;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public Float getPrice() {return price;}

    public void setPrice(Float price) {this.price = price;}
}
