package manager.entities;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.NotEmpty;
import javax.persistence.*;


@Entity
@Table(schema="public", name = "ticket")
public class Ticket {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id")
    private Integer id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "sector_id")
    private Sector sector;

    @NotEmpty
    @Column(name = "row", nullable = false)
    private Integer row;

    @NotEmpty
    @Column(name = "seat", nullable = false)
    private Integer seat;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "operator_id")
    private Operator operator;

    @NotEmpty
    @Column(name = "isReserved", nullable = false)
    private boolean isReserved;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "client_ID")
    private Client client;


    public Ticket() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRow() {
        return row;
    }

    public void setRow(Integer row) {
        this.row = row;
    }

    public Integer getSeat() {return seat;}

    public void setSeat(Integer seat) {this.seat = seat;}

    public boolean getReserved() {return isReserved;}

    public void setReserved(boolean isReserved) {
        this.isReserved = isReserved;
    }

    public Sector getSector() {return sector;}

    public void setSector(Sector sector) {
        this.sector = sector;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Operator getOperator() {return operator;}

    public void setOperator(Operator operator) {
        this.operator = operator;
    }
}

