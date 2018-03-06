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
    /**
     * This HashMap contains all available Tours and OptionalServices. Key is String tours or services and values are saved in ArrayList.
     */
    private HashMap<String, ArrayList<Service>> tourAndService;
    /**
     * This ArrayList contains all available Tours.
     */
    private ArrayList<Service> clientTours;
    /**
     * This ArrayList contains all available OptionalServices.
     */
    private ArrayList<Service> clientOptional;

    /**
     * This Constructor is used for creation of Agent object.
     *
     * @param tourAndService ArrayList contains all available Tours.
     */
    public Agent(HashMap<String, ArrayList<Service>> tourAndService) {
        this.tourAndService = tourAndService;
        clientTours = tourAndService.get( "tours" );
    }

    /**
     * Prints all Tours sorted by cost in ascending order. Creates Client object and fill it with meaningful values.
     * Prints selected Tour and OptionalService.
     *
     * @throws InputMismatchException
     */
    public void sellTour() throws InputMismatchException {
        Scanner sc = new Scanner( System.in );
        System.out.println( "Hello, my name is " + name + ". I can help you to pick the tour. What is your name?" );
        Client client = new Client();
        client.setName( sc.next() );
        System.out.println( "Hi, " + client.getName() + ". We have " + clientTours.size() + " tours available right now." +
                " You can see them on your screen below. To help you to choose the best one for you, please, answer a few questions." );
        System.out.println( "\n" );
        sortTours();
        System.out.println( "\n" );
        System.out.println( "Could you please specify the maximum number of vacation days?" );

        client.setVacation( sc.nextInt() );

        for (int i = 0; i < clientTours.size(); i++) {
            if (!(clientTours.get( i ).getDuration() <= client.getVacation())) {
                clientTours.remove( i );
                i--;
            }
        }
        if (clientTours.size() < 1) {
            System.out.println( "Sorry, it seems I don't have any tour that meets all your requirements. " );
            return;
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
        if (clientTours.size() < 1) {
            System.out.println( "Sorry, it seems I don't have any tour that meets all your requirements. " );
            return;
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
        if (clientTours.size() < 1) {
            System.out.println( "Sorry, it seems I don't have any tour that meets all your requirements. " );
            return;
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
        if (clientTours.size() < 1) {
            System.out.println( "Sorry, it seems I don't have any tour that meets all your requirements. " );
            return;
        }

        if (clientTours.size() == 1) {
            System.out.println( "You can see below the tour that meets all your requirements." );
            printServiceItems( clientTours );
        } else if (clientTours.size() == 0) {
            System.out.println( "Sorry, it seems I don't have any tour that meets all your requirements. " );
            return;
        } else {
            System.out.println( "More than one tour matches your criteria. Please select any from the list below." );
            System.out.println( "" );
            int i = 0;
            for (Service item : clientTours) {
                i++;
                System.out.println( "#" + i + " " + item.toString() );
            }
            int finalChoice = sc.nextInt();
            Service tempChoice = clientTours.get( finalChoice - 1 );
            clientTours.clear();
            clientTours.add( tempChoice );
            System.out.println( "Tour confirmed." );
        }


        System.out.println( "I can offer you additional services that you may need." );
        System.out.println( "Menu Options:" );
        System.out.println( "1. I need documents to be prepared." );
        System.out.println( "2. I need visa." );
        System.out.println( "3. I need an insurance." );
        System.out.println( "4. All above." );
        System.out.println( "5. No, thanks." );
        System.out.println( "" );
        System.out.print( "Please select an option from 1-5\r\n" );

        int clientResponse = sc.nextInt();

        switch (clientResponse) {
            case 1:
                System.out.println( "To prepare documents I need your passport and signature." );
                clientOptional.add( tourAndService.get( "services" ).get( 0 ) );
                break;
            case 2:
                System.out.println( "To prepare visa I need 2 photographs, a filled in form and certificate of employment." );
                clientOptional.add( tourAndService.get( "services" ).get( 1 ) );
                break;
            case 3:
                System.out.println( "To prepare insurance for you I need your passport." );
                clientOptional.add( tourAndService.get( "services" ).get( 2 ) );
                break;
            case 4:
                System.out.println( "To prepare all required documents I need your passport, 2 photographs, " +
                        "a filled in form and certificate of employment" );
                clientOptional = tourAndService.get( "services" );
                break;
            default:
                System.out.println( "" );
        }
        System.out.println( "Congratulations! You selected the best tour." );
        System.out.println();
        summarizeCost( clientTours, clientOptional );


    }

    /**
     * Prints final choice made by Client and count total cost of the selected Tour.
     *
     * @param clientTours ArrayList contains Tour selected by Client.
     * @param clientOptional ArrayList contains OptionalService selected by Client.
     */
    private void summarizeCost(ArrayList<Service> clientTours, ArrayList<Service> clientOptional) {
        Integer total = 0;

        System.out.println( "Your tour choice:" );
        printServiceItems( clientTours );
        total += clientTours.get( 0 ).getCost();
        System.out.println();

        if (clientOptional == null) {
            System.out.println( "You didn't select any additional services." );
        } else {
            System.out.println( "Your additional services choice:" );
            printServiceItems( clientOptional );
            for (Service service : clientOptional) {
                total += service.getCost();
            }
        }
        System.out.println( "\nOverall cost is " + total + "$. Thank you!" );

    }

    /**
     * Prints ordered options from ArrayList.
     *
     * @param services accept ArrayList
     */
    private void printServiceItems(ArrayList<Service> services) {
        int i = 0;
        for (Service item : services) {
            i++;
            System.out.println( "#" + i + " " + item.toString() );
        }
    }

    /**
     * Sorts Tours by their cost and prints in ascending order.
     */
    public void sortTours() {
        Collections.sort( clientTours, new SortByCost() );
        for (int i = 0; i < clientTours.size(); i++)
            System.out.println( clientTours.get( i ) );
    }


}
