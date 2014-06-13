package manager.entities;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

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
//    @Pattern(regexp="^[10-19adA20-25D1-9]", message="sector must be in range 1-25 or A or D")
    private String name;

    @NotEmpty
    @Column(name = "price")
    private Double price;

    @Column(name = "isDeleted")
    private boolean isDeleted;

    @NotEmpty
    @Column(name = "TimeStamp", nullable = false)
    private Date timeStamp = new Date();

    public Sector() {}


}
