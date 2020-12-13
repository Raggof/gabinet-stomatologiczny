package pl.coderslab.entity;

import javax.persistence.*;
import javax.swing.*;

@Entity
@Table(name = "visits")
public class Visit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String dentNameSur;
    private String patNameSur;
    private String data;
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
