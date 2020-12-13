package pl.coderslab.entity;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "histories")
public class History {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private Long dentId;
    @NotNull
    private Long patId;
    @NotNull
    @Pattern(regexp = "^[a-zA-Z -]*", message = "Imię i nazwisko może sie składać tylko z liter lub myślnika!")
    private String dentName;
    @NotNull
    @Pattern(regexp = "^[a-zA-Z -]*", message = "Imię i nazwisko może sie składać tylko z liter lub myślnika!")
    private String patName;
    @NotNull
    @Pattern(regexp = "[0-3][0-9][.][0-1][0-9][.][2][0-9][0-9][0-9][ ][\\/][ ][0-2][0-9][:][0-5][0-9]",
            message = "Wzór: dd.mm.yyyy / hh:mm")
    private String data;
    @NotNull
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
