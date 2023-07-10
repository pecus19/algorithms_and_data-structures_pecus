package ee.ttu.algoritmid.interestingstamps.events;

import java.util.Objects;

public class Event {
    private String eventName;
    private int eventLengthMinutes;
    private boolean freeTickets;

    public Event(String eventName, int eventLengthMinutes, boolean freeTickets) {
        this.eventName = eventName;
        this.eventLengthMinutes = eventLengthMinutes;
        this.freeTickets = freeTickets;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public int getEventLengthMinutes() {
        return eventLengthMinutes;
    }

    public void setEventLengthMinutes(int eventLengthMinutes) {
        this.eventLengthMinutes = eventLengthMinutes;
    }

    public boolean isFreeTickets() {
        return freeTickets;
    }

    public void setFreeTickets(boolean freeTickets) {
        this.freeTickets = freeTickets;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return eventLengthMinutes == event.eventLengthMinutes && freeTickets == event.freeTickets && Objects.equals(eventName, event.eventName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventName, eventLengthMinutes, freeTickets);
    }
}
