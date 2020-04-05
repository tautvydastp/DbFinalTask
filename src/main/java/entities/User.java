package entities;

import javax.jws.soap.SOAPBinding;
import javax.persistence.*;

@Entity
@Table(name = "USER")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long personId;

    @Column(name = "NAME")
    private String name;

    @Column(name = "LASTNAME")
    private String lastname;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "ROLE")
    private String role;

    public User(long personId){
        this.personId = personId;
    }

    public User(long personId, String name, String lastname) {
        this.personId = personId;
        this.name = name;
        this.lastname = lastname;
    }

    public User(){}

    public long getPersonId() {
        return personId;
    }

    public void setPersonId(long personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return String.valueOf(personId);
    }
}
