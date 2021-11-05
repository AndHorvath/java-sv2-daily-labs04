package day05;

public class Passenger {

    private String name;
    private String ticketId;
    private int luggage;

    public Passenger(String name, String ticketId, int luggage) {
        this.name = name;
        this.ticketId = ticketId;
        this.luggage = luggage;
    }

    public String getName() {
        return name;
    }

    public String getTicketId() {
        return ticketId;
    }

    public int getLuggage() {
        return luggage;
    }
}