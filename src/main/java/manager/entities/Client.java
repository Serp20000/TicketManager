package manager.entities;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.NotEmpty;
import javax.persistence.*;

@Entity
@Table(schema="public", name = "client")
public class Client {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id")
    private Integer id;

    @NotEmpty
    @Column(name="name", nullable = false, length = 20)
    private String name;

    @NotEmpty
    @Column(name="surname", nullable = false, length = 20)
    private String surname;

    @Column(name="phone", length = 15)
    private String phone;

    public Client() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {return name;}

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.name = surname;
    }

    public String getPhone() {return phone;}

    public void setPhone(String phone) {this.phone = phone;}
}
