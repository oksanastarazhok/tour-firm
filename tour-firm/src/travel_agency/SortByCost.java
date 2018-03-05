package travel_agency;

import service.Service;


import java.util.Comparator;

public class SortByCost implements Comparator<Service> {

    @Override
    public int compare(Service o1, Service o2) {
        return o1.getCost() - o2.getCost();
    }
}
