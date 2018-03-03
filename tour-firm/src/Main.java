import service.OptionalService;
import service.Service;
import service.ServiceType;
import service.Tour;

public class Main {

    public static void main(String[] args) {

         createTour();

    }

    private static void createTour(){
        Tour tour1 = new Tour( ServiceType.SEASIDE_HOLIDAYS, "Three star hotel","Bus","breakfast",229,7, "Bulgaria");
        Tour tour2 = new Tour( ServiceType.SEASIDE_HOLIDAYS, "Five star hotel","air","all inclusive",629,10, "Bulgaria");
        Tour tour3 = new Tour( ServiceType.SEASIDE_HOLIDAYS, "resort","Bus","breakfast-dinner",429,14, "Bulgaria");
        Tour tour4 = new Tour( ServiceType.SEASIDE_HOLIDAYS, "Hostel","Bus","room only",350,7, "Greece");
        Tour tour5 = new Tour( ServiceType.SEASIDE_HOLIDAYS, "Three star hotel","air","breakfast",541,10, "Greece");
        Tour tour6 = new Tour( ServiceType.SEASIDE_HOLIDAYS, "Three star hotel","air","breakfast-dinner",700,14, "Greece");
        Tour tour7 = new Tour( ServiceType.GUIDED_TOUR, "Three star hotel","air","breakfast",300,5, "Egypt");
        Tour tour8 = new Tour( ServiceType.GUIDED_TOUR, "Four star hotel","air","breakfast-dinner",508,10, "Egypt");
        Tour tour9 = new Tour( ServiceType.SEASIDE_HOLIDAYS, "Four star hotel","air","breakfast",345,10, "Egypt");
        Tour tour10 = new Tour( ServiceType.SEASIDE_HOLIDAYS, "Four star hotel","air","breakfast",800,14, "Egypt");
        Tour tour11 = new Tour( ServiceType.SEASIDE_HOLIDAYS, "Five star hotel","air","breakfast",389,7, "Egypt");
        Tour tour12 = new Tour( ServiceType.CRUISE, "liner","liner","breakfast",369,7, "Antarctic");
        Tour tour13 = new Tour( ServiceType.CRUISE, "liner","air","breakfast",829,10, "Malta");
        Tour tour14 = new Tour( ServiceType.CRUISE, "liner","air","all inclusive",799,10, "Italy");
        Tour tour15 = new Tour( ServiceType.CRUISE, "liner","air","all inclusive",1400,14, "Cuba");
        Tour tour16 = new Tour( ServiceType.THERAPY_TOUR, "resort","Bus","breakfast",500,7, "Belarus");
        Tour tour17 = new Tour( ServiceType.THERAPY_TOUR, "Four star hotel","air","breakfast-dinner",1500,7, "Cuba");
        Tour tour18 = new Tour( ServiceType.GUIDED_TOUR, "hostel","Bus","breakfast",689,10, "Italy");
        Tour tour19 = new Tour( ServiceType.SEASIDE_HOLIDAYS, "Four star hotel","air","breakfast",1829,10, "Malta");
        Tour tour20 = new Tour( ServiceType.GUIDED_TOUR, "Three star hotel","Bus","room only",579,7, "Belarus");
        Tour tour21 = new Tour( ServiceType.SHOPPING_TOUR, 29,1, "Lithuania");
        Tour tour22 = new Tour( ServiceType.SHOPPING_TOUR, 35,1, "Poland");
        Tour tour23 = new Tour( ServiceType.SHOPPING_TOUR, 57,2, "Poland");
        Tour tour24 = new Tour( ServiceType.SHOPPING_TOUR, "Three star hotel","air","room only",279,4, "Italy");
        Tour tour25 = new Tour( ServiceType.THERAPY_TOUR, "Three star hotel","Bus","breakfast",579,7, "Poland");

        OptionalService service1 = new OptionalService( ServiceType.PREPARATION_OF_DOCUMENTS, 7,20 );
        OptionalService service2 = new OptionalService( ServiceType.VISA_PROCESSING, 14,60 );
        OptionalService service3 = new OptionalService( ServiceType.INSURANCE, 30,15 );
        OptionalService service4 = new OptionalService( ServiceType.INSURANCE, 60,30 );
        OptionalService service5 = new OptionalService( ServiceType.INSURANCE, 90,45 );



    }

}
