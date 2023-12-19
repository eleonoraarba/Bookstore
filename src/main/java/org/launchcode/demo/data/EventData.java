package org.launchcode.demo.data;

import org.launchcode.demo.models.Event;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class EventData {
    //need a place tot put events
    private static final Map<Integer, Event> events = new HashMap<>();
    //get all events
    public static Collection<Event> getAll(){
        return events.values();
    }

    //get a single event
    public static Event getById(int id){
        return events.get(id);
    }

    //add event
    public static void add(Event event){
        events.put(event.getId(), event);
    }

    //remove event
    public static void remove(int id){
        events.remove(id);
    }



}
