import service.OptionalService;
import service.Service;
import service.ServiceType;
import service.Tour;
import travel_agency.Agent;
import java.util.*;


public class Main {

    public static void main(String[] args) {

        HashMap<String, ArrayList<Service>> tourAndService;
        tourAndService = createTour();
        sell( tourAndService );

    }



    private static HashMap<String, ArrayList<Service>> createTour() {
        Service tour1 = new Tour( ServiceType.SEASIDE_HOLIDAYS, "Three star hotel", "bus", "breakfast", 229, 7, "Bulgaria" );
        Service tour2 = new Tour( ServiceType.SEASIDE_HOLIDAYS, "Five star hotel", "air", "all inclusive", 629, 10, "Bulgaria" );
        Service tour3 = new Tour( ServiceType.SEASIDE_HOLIDAYS, "resort", "bus", "breakfast-dinner", 429, 14, "Bulgaria" );
        Service tour4 = new Tour( ServiceType.SEASIDE_HOLIDAYS, "Hostel", "bus", "room_only", 350, 7, "Greece" );
        Service tour5 = new Tour( ServiceType.SEASIDE_HOLIDAYS, "Three star hotel", "air", "breakfast", 541, 10, "Greece" );
        Service tour6 = new Tour( ServiceType.SEASIDE_HOLIDAYS, "Three star hotel", "air", "breakfast-dinner", 700, 14, "Greece" );
        Service tour7 = new Tour( ServiceType.GUIDED_TOUR, "Three star hotel", "air", "breakfast", 300, 5, "Egypt" );
        Service tour8 = new Tour( ServiceType.GUIDED_TOUR, "Four star hotel", "air", "breakfast-dinner", 508, 10, "Egypt" );
        Service tour9 = new Tour( ServiceType.SEASIDE_HOLIDAYS, "Four star hotel", "air", "breakfast", 345, 10, "Egypt" );
        Service tour10 = new Tour( ServiceType.SEASIDE_HOLIDAYS, "Four star hotel", "air", "breakfast", 800, 14, "Egypt" );
        Service tour11 = new Tour( ServiceType.SEASIDE_HOLIDAYS, "Five star hotel", "air", "breakfast", 389, 7, "Egypt" );
        Service tour12 = new Tour( ServiceType.CRUISE, "liner", "liner", "breakfast", 369, 7, "Antarctic" );
        Service tour13 = new Tour( ServiceType.CRUISE, "liner", "air", "breakfast", 829, 10, "Malta" );
        Service tour14 = new Tour( ServiceType.CRUISE, "liner", "air", "all inclusive", 799, 10, "Italy" );
        Service tour15 = new Tour( ServiceType.CRUISE, "liner", "air", "all inclusive", 1400, 14, "Cuba" );
        Service tour16 = new Tour( ServiceType.THERAPY_TOUR, "resort", "bus", "breakfast", 500, 7, "Belarus" );
        Service tour17 = new Tour( ServiceType.THERAPY_TOUR, "Four star hotel", "air", "breakfast-dinner", 1500, 7, "Cuba" );
        Service tour18 = new Tour( ServiceType.GUIDED_TOUR, "hostel", "bus", "breakfast", 689, 10, "Italy" );
        Service tour19 = new Tour( ServiceType.SEASIDE_HOLIDAYS, "Four star hotel", "air", "breakfast", 1829, 10, "Malta" );
        Service tour20 = new Tour( ServiceType.GUIDED_TOUR, "Three star hotel", "bus", "room_only", 579, 7, "Belarus" );
        Service tour21 = new Tour( ServiceType.SHOPPING_TOUR, 29, 1, "Lithuania" );
        Service tour22 = new Tour( ServiceType.SHOPPING_TOUR, 35, 1, "Poland" );
        Service tour23 = new Tour( ServiceType.SHOPPING_TOUR, 57, 2, "Poland" );
        Service tour24 = new Tour( ServiceType.SHOPPING_TOUR, "Three star hotel", "air", "room_only", 279, 4, "Italy" );
        Service tour25 = new Tour( ServiceType.THERAPY_TOUR, "Three star hotel", "bus", "breakfast", 579, 7, "Poland" );

        Service service1 = new OptionalService( ServiceType.PREPARATION_OF_DOCUMENTS, 7, 20 );
        Service service2 = new OptionalService( ServiceType.VISA_PROCESSING, 14, 60 );
        Service service3 = new OptionalService( ServiceType.INSURANCE, 30, 15 );
        Service service4 = new OptionalService( ServiceType.INSURANCE, 60, 30 );
        Service service5 = new OptionalService( ServiceType.INSURANCE, 90, 45 );

        ArrayList tours = new ArrayList<Service>( Arrays.asList( tour1, tour2, tour3, tour4, tour5, tour6, tour7, tour8,
                tour9, tour10, tour11, tour12, tour13, tour14, tour15, tour16, tour17, tour18, tour19, tour20, tour21,
                tour22, tour23, tour24, tour25 ) );
        ArrayList services = new ArrayList<Service>( Arrays.asList( service1, service2, service3, service4, service5 ) );
        Map<String, ArrayList<Service>> tourAndService = new HashMap<String, ArrayList<Service>>();
        tourAndService.put( "tours", tours );
        tourAndService.put( "services", services );

        return (HashMap<String, ArrayList<Service>>) tourAndService;
    }

    private static void sell(HashMap<String, ArrayList<Service>> tourAndService) {
        Agent agent = new Agent( tourAndService );
        agent.sellTour();

    }



}


