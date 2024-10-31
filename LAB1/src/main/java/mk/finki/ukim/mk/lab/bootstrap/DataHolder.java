package mk.finki.ukim.mk.lab.bootstrap;

import jakarta.annotation.PostConstruct;
import mk.finki.ukim.mk.lab.model.Event;
import mk.finki.ukim.mk.lab.model.EventBooking;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataHolder {

    public static List<Event> eventList = new ArrayList<>();
    public static List<EventBooking> bookedEvents = new ArrayList<>();

    @PostConstruct
    public void init(){
        eventList = new ArrayList<>();
        bookedEvents = new ArrayList<>();
        eventList.add(new Event("La Tomatina", "The most vibrant and uncommon festivals in Europe. ", 9.7));
        eventList.add(new Event("Oktoberfest", "Fun Festival to be at.", 8.3));
        eventList.add(new Event("Carnival of Venice", "Historical elegance and mystery. ", 7.8));
        eventList.add(new Event("St. Patrick’s Festival", "Colorful festival of Irish culture and heritage.", 5.6));
        eventList.add(new Event("Festival of Lights", "Captivating festival with amazing light installations.  ", 7.0));
        eventList.add(new Event("Glastonbury Festival", "Iconic music, art, and culture celebration.", 7.7));
        eventList.add(new Event("Roskilde Festival", "The largest music and culture event in Northern Europe.", 3.2));
        eventList.add(new Event("Sziget Festival", "Festival of music, art, and love.", 9.9));
        eventList.add(new Event("Cannes Film Festival", "Pinnacle of filmmaking congregates. ", 6.8));
        eventList.add(new Event("Edinburgh International Festival", "Celebrate the performing arts.", 6.3));
    }
}
