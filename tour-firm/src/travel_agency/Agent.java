package travel_agency;

import client.Client;
import service.Service;
import service.Tour;

import java.util.*;

public class Agent {
    /**
     * This field contains name of tour operator.
     */
    private final String name = "Oksana";
    private HashMap<String, ArrayList<Service>> tourAndService;
    private ArrayList<Service> clientTours;
    private ArrayList<Service> clientOptional;

    public Agent(HashMap<String, ArrayList<Service>> tourAndService) {
        this.tourAndService = tourAndService;
        clientTours = tourAndService.get( "tours" );
        clientOptional = tourAndService.get( "services" );
    }


    public void sellTour() {
        Scanner sc = new Scanner( System.in );
        System.out.println( "Hello, my name is " + name + ". I can help you to pick the tour. What is your name?" );
        Client client = new Client();
        client.setName( sc.next() );
        System.out.println( "Hi, " + client.getName() + ". We have " + clientTours.size() + " tours available right now." +
                " You can see them on your screen below. To help you to choose the best one for you, please, answer a few questions." );
        System.out.println(" ");
        System.out.println(" ");
        sortTours();
        System.out.println(" ");
        System.out.println(" ");
        System.out.println( "Could you please specify the maximum number of vacation days?" );
//        TODO: Write exception catch (Exception in thread "main" java.util.InputMismatchException)
        client.setVacation( sc.nextInt() );

        for (int i = 0; i < clientTours.size(); i++) {
            if (!(clientTours.get( i ).getDuration() <= client.getVacation())) {
                clientTours.remove( i );
                i--;
            }
        }
        System.out.println( "We can propose " + clientTours.size() + " tours." );
        System.out.println( "Could you please also enter the maximum amount of money you'd like to spend on your tour?" );
        client.setMoney( sc.nextInt() );
        for (int i = 0; i < clientTours.size(); i++) {
            if (!(clientTours.get( i ).getCost() <= client.getMoney())) {
                clientTours.remove( i );
                i--;
            }
        }
        System.out.println( "We can propose " + clientTours.size() + " tours." );
        Set<String> transportOptions = new HashSet<>();
        for (int i = 0; i < clientTours.size(); i++) {
            Tour temp = (Tour) clientTours.get( i );
            transportOptions.add( temp.getTransport() );

        }

        System.out.println( " Currently we have the following transport options " + transportOptions.toString() );
        System.out.println( "Please, type one suitable option as above." );
        String transportChoice = sc.next();
        for (int i = 0; i < clientTours.size(); i++) {
            Tour temp = (Tour) clientTours.get( i );
            if (!(temp.getTransport().equals( transportChoice ))) {
                clientTours.remove( temp );
                i--;
            }
        }

        Set<String> foodOptions = new HashSet<>();
        for (int i = 0; i < clientTours.size(); i++) {
            Tour temp = (Tour) clientTours.get( i );
            foodOptions.add( temp.getFood() );

        }

        System.out.println( " Currently we have the following food options " + foodOptions.toString() );
        System.out.println( "Please, type one suitable option as above." );
        String foodChoice = sc.next();
        for (int i = 0; i < clientTours.size(); i++) {
            Tour temp = (Tour) clientTours.get( i );
            if (!(temp.getFood().equals( foodChoice ))) {
                clientTours.remove( temp );
                i--;
            }
        }


        printServiceItems( clientTours );


        System.out.println( "I can offer you additional services that you may need." );
        System.out.println("Menu Options:");
        System.out.println("1. I need documents to be prepared.");
        System.out.println("2. I need visa.");
        System.out.println("3. I need an insurance.");
        System.out.println("4. All above.");
        System.out.println("5. No, thanks.");
        System.out.println("");
        System.out.print("Please select an option from 1-5\r\n");

        int clientResponse = sc.nextInt();

        switch (clientResponse){
            case  1:
                System.out.println("To prepare documents I need your passport and signature.");
                break;
            case  2:
                System.out.println("To prepare visa I need 2 photographs, a filled in form and certificate of employment.");
                break;
            case 3:
                System.out.println("To prepare insurance for you I need your passport.");
                break;
            case 4:
                System.out.println("To prepare all required documents I need your passport, 2 photographs, " +
                        "a filled in form and certificate of employment");
            default:
                System.out.println("Your tour is almost redy!");
        }

    }



    private void printServiceItems(ArrayList<Service> services) {
        int i = 0;
        for (Service item : services) {
            i++;
            System.out.println( "#" + i + " " + item.toString() );
        }
    }

    public void sortTours() {
        Collections.sort( clientTours, new SortByCost() );
        for (int i = 0; i < clientTours.size(); i++)
            System.out.println( clientTours.get( i ) );
    }

    //TODO need to think how to select 1 tour

}
