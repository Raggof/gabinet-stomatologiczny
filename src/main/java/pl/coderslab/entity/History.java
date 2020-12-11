package pl.coderslab.entity;

import javax.persistence.*;

@Entity
@Table(name = "histories")
public class History {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private Long dentistID;
    private Long patientID;
    private String History;

    public History() {
    }

    public History(Long id, Long dentistID, Long patientID, String history) {
        this.id = id;
        this.dentistID = dentistID;
        this.patientID = patientID;
        History = history;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDentistID() {
        return dentistID;
    }

    public void setDentistID(Long dentistID) {
        this.dentistID = dentistID;
    }

    public Long getPatientID() {
        return patientID;
    }

    public void setPatientID(Long patientID) {
        this.patientID = patientID;
    }

    public String getHistory() {
        return History;
    }

    public void setHistory(String history) {
        History = history;
    }
}
