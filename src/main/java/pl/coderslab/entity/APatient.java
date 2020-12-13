package pl.coderslab.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "patients")
public class APatient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Pattern(regexp = "^[a-zA-Z -]*", message = "Imię i nazwisko może sie składać tylko z liter i myślnika!")
    private String nameSurname;

    public APatient() {
    }

    public APatient(Long id, String nameSurname) {
        this.id = id;
        this.nameSurname = nameSurname;
    }

    @Override
    public String toString() {
        return nameSurname;
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
}
