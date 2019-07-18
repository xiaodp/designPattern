package Singleton;

public class Main {
    public static void main(String[] args) {
//        Singleton singleton1 = Singleton.getInstance();
//        Singleton singleton2 = Singleton.getInstance();
//        System.out.println(singleton1 == singleton2);

//        TicketMaker ticketMaker = TicketMaker.getInstance();
//        System.out.println(ticketMaker.getTicketNumber());
//        System.out.println(ticketMaker.getTicketNumber());
//        System.out.println(ticketMaker.getTicketNumber());

        Triple triple1 = Triple.getInstance(1);
        Triple triple2= Triple.getInstance(2);
        Triple triple3 = Triple.getInstance(3);
        System.out.println(triple1==triple2);
    }
}
