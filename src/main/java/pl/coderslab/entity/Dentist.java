package pl.coderslab.entity;

import org.mindrot.jbcrypt.BCrypt;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "dentists")
public class Dentist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Pattern(regexp = "^[a-zA-Z -]*", message = "Imię i nazwisko może sie składać tylko z liter i myślnika!")
    private String nameSurname;
    private String password;

    public Dentist() {
    }

    public Dentist(Long id, String nameSurname, String password) {
        this.id = id;
        this.nameSurname = nameSurname;
        this.password = password;
    }
    public void hashPassword(String password){
        this.password = BCrypt.hashpw(password, BCrypt.gensalt());
    }

    @Override
    public String toString() {
        return "Dentist= " +
                "id= " + id +
                ", nameSurname= '" + nameSurname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
