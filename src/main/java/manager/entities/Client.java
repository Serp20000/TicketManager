package manager.entities;

        import org.hibernate.annotations.GenericGenerator;
        import org.hibernate.validator.constraints.NotEmpty;
        import javax.persistence.*;
        import java.util.Date;

@Entity
@Table(schema="public", name = "client")
public class Client {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id")
    private Integer id;

    @NotEmpty
    @Column(name = "name", nullable = false, length = 30)
    private String name;


    @Column(name = "description", length = 500)
    private String description;

    @Column(name = "isDeleted")
    private boolean isDeleted;

    @NotEmpty
    @Column(name = "TimeStamp", nullable = false)
    private Date timeStamp = new Date();

    public Client() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
