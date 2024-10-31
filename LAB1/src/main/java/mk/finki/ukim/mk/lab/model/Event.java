package mk.finki.ukim.mk.lab.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data

public class Event {
    private String name;
    private String description;
    private double popularityScore;

    public Event(String name, String description, double popularityScore) {
        this.name = name;
        this.description = description;
        this.popularityScore = popularityScore;
    }
}
