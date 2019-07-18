package Singleton;

public class TicketMaker {

    private static TicketMaker ticketMaker = new TicketMaker();

    private  int ticket = 1000;

    public synchronized int getTicketNumber(){
        return ticket++;
    }

    public static TicketMaker getInstance(){
        return ticketMaker;
    }

}
