package manager.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;


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

    @Column(name = "row")
    private Integer row;

    @Column(name = "seat")
    private Integer seat;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "operator_id")
    private Operator operator;

    @Column(name = "isReserved")
    private boolean isReserved;

    @Column(name = "TimeStamp")
    private Date timeStamp = new Date();


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "client_ID")
    private Client client;



    public Ticket() {}

    public boolean isReserved() {
        return isReserved;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

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

