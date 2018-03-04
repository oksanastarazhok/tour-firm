package travel_agent;

import client.Client;
import service.Service;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Agent {
    /**
     * This field contains name of tour operator.
     */
    private final String name = "Oksana";
    private HashMap<String, ArrayList<Service>> tourAndService;
    private ArrayList<Service> clientTours;

    public Agent(HashMap<String, ArrayList<Service>> tourAndService) {
        this.tourAndService = tourAndService;
        clientTours = tourAndService.get( "tours" );
    }


    public void startConversation() {
        Scanner sc = new Scanner( System.in );
        System.out.println( "Hello, my name is " + name + ". I can help you to pick the tour. What is your name?" );
        Client client = new Client();
        client.setName( sc.next() );
//        System.out.println("Good! We can propose " + clientTours.size() + " tours.");
        System.out.println( "Could you please specify the maximum number of vacation days available?" );
//        TODO: Write exception catch (Exception in thread "main" java.util.InputMismatchException)
        client.setVacation( sc.nextInt() );

        for (int i = 0; i < clientTours.size(); i++) {
            if (!(clientTours.get( i ).getDuration() <= client.getVacation())) {
                clientTours.remove( i );
                i--;
            }
        }
        System.out.println( "We can propose " + clientTours.size() + " tours." );
        System.out.println( "Could you please also enter the maximum amount of money you'd like to spend on your vacation?" );
        client.setMoney( sc.nextInt() );
        for (int i = 0; i < clientTours.size(); i++) {
            if (!(clientTours.get( i ).getCost() <= client.getMoney())) {
                clientTours.remove( i );
                i--;
            }
        }
        System.out.println( "We can propose " + clientTours.size() + " tours." );
        printServiceItems( clientTours );

    }

    private void printServiceItems(ArrayList<Service> services) {
        int i = 0;
        for (Service item : services) {
            i++;
            System.out.println( "#" + i + " " + item.toString() );
        }
    }

    public void sortTours() {

    }

    public String getName() {
        return name;
    }
}
