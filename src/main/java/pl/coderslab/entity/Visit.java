package pl.coderslab.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "visits")
public class Visit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Pattern(regexp = "^[a-zA-Z -]*", message = "Imię i nazwisko może sie składać tylko z liter i myślnika!")
    private String dentNameSur;
    @NotNull
    @Pattern(regexp = "^[a-zA-Z -]*", message = "Imię i nazwisko może sie składać tylko z liter i myślnika!")
    private String patNameSur;
    @NotNull
    @Pattern(regexp = "[0-3][0-9][.][0-1][0-9][.][2][0-9][0-9][0-9][ ][\\/][ ][0-2][0-9][:][0-5][0-9]",
            message = "Wzór: dd.mm.yyyy / hh:mm")
    private String data;
    @NotNull
    private String description;


    public Visit() {
    }

    public Visit(Long id, String dentNameSur, String patNameSur, String data, String description) {
        this.id = id;
        this.dentNameSur = dentNameSur;
        this.patNameSur = patNameSur;
        this.data = data;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Dentist: " + dentNameSur + ". Patient: " + patNameSur + ". Data: " + data
                +". Zaplanowano: " + description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDentNameSur() {
        return dentNameSur;
    }

    public void setDentNameSur(String dentNameSur) {
        this.dentNameSur = dentNameSur;
    }

    public String getPatNameSur() {
        return patNameSur;
    }

    public void setPatNameSur(String patNameSur) {
        this.patNameSur = patNameSur;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
