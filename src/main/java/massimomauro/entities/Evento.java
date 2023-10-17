package massimomauro.entities;

import javax.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="event")
public class Evento {
    @Id
    @GeneratedValue
    private long id;
    private String title;
    private LocalDate dataEvent;
    private String description;
    private EventType typeEvent;
    private int maxNumberPartecipants;

    public Evento(String title, LocalDate dataEvent, String description, EventType typeEvent, int maxNumberPartecipants) {
        this.title = title;
        this.dataEvent = dataEvent;
        this.description = description;
        this.typeEvent = typeEvent;
        this.maxNumberPartecipants = maxNumberPartecipants;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getDataEvent() {
        return dataEvent;
    }

    public String getDescription() {
        return description;
    }

    public EventType getTypeEvent() {
        return typeEvent;
    }

    public int getMaxNumberPartecipants() {
        return maxNumberPartecipants;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDataEvent(LocalDate dataEvent) {
        this.dataEvent = dataEvent;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTypeEvent(EventType typeEvent) {
        this.typeEvent = typeEvent;
    }

    public void setMaxNumberPartecipants(int maxNumberPartecipants) {
        this.maxNumberPartecipants = maxNumberPartecipants;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", dataEvent=" + dataEvent +
                ", description='" + description + '\'' +
                ", typeEvent=" + typeEvent +
                ", maxNumberPartecipants=" + maxNumberPartecipants +
                '}';
    }
}
