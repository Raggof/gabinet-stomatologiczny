package pl.coderslab.entity;

import javax.persistence.*;

@Entity
@Table(name = "patients")
public class APatient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nameSurname;

    public APatient() {
    }

    public APatient(Long id, String nameSurname) {
        this.id = id;
        this.nameSurname = nameSurname;
    }

    @Override
    public String toString() {
        return "APatient= " +
                "id= " + id +
                ", nameSurname= " + nameSurname;
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
