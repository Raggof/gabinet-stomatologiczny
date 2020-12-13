package pl.coderslab.entity;

import javax.persistence.*;

@Entity
@Table(name = "histories")
public class History {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private Long dentId;
    private Long patId;
    private String dentName;
    private String patName;
    private String data;
    private String history;

    public History() {
    }

    public History(String data, String history) {
        this.data = data;
        this.history = history;
    }

    public History(Long id, Long dentId, Long patId, String dentName, String patName, String data, String history) {
        this.id = id;
        this.dentId = dentId;
        this.patId = patId;
        this.dentName = dentName;
        this.patName = patName;
        this.data = data;
        this.history = history;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Long getDentId() {
        return dentId;
    }

    public void setDentId(Long dentId) {
        this.dentId = dentId;
    }

    public Long getPatId() {
        return patId;
    }

    public void setPatId(Long patId) {
        this.patId = patId;
    }

    public String getDentName() {
        return dentName;
    }

    public void setDentName(String dentName) {
        this.dentName = dentName;
    }

    public String getPatName() {
        return patName;
    }

    public void setPatName(String patName) {
        this.patName = patName;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    @Override
    public String toString() {
        return data + ". Historia:" + history;
    }
}
