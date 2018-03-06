package service;

import java.util.Objects;

public class Tour extends Service {
    /**
     * This field describes the food included into tour.
     */
    private String food;
    /**
     * This field describes destination route.
     */
    private String transport;
    /**
     * This field give the information about accommodation for living.
     */
    private String hotel;
    /**
     * This filed contains information about the type of a vacation.
     */
    private ServiceType name;

    /**
     * This Constructor can be used for creation of following holiday pakages:
     * SEASIDE_HOLIDAYS, CRUISE, GUIDED_TOUR and  THERAPY_TOUR
     *
     * @param name      Type of tour
     * @param hotel     Type of hotel
     * @param transport type of transfer from home to hotel
     * @param food      type of food included
     */
    public Tour(ServiceType name, String hotel, String transport, String food, int cost, int duration, String country) {
        super( cost, duration, country );
        this.name = name;
        this.hotel = hotel;
        this.transport = transport;
        this.food = food;

    }

    /**
     * This Constructor can be used for creation of SHOPPING_TOUR
     *
     * @param name Type of tour
     */
    public Tour(ServiceType name, int cost, int duration, String country) {
        super( cost, duration, country );
        this.name = name;
        this.transport = "bus";
        this.food = "chips";
        this.hotel = "Hostel";

    }

    @Override
    public String toString() {

        return "{" +
                "cost=" + this.getCost() +
                ", duration=" + this.getDuration() +
                ", country='" + this.getCountry() + '\'' +
                ", food='" + food + '\'' +
                ", transport='" + transport + '\'' +
                ", hotel='" + hotel + '\'' +
                ", name=" + name +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tour)) return false;
        Tour tour = (Tour) o;
        return Objects.equals( getFood(), tour.getFood() ) &&
                Objects.equals( getTransport(), tour.getTransport() ) &&
                Objects.equals( getHotel(), tour.getHotel() ) &&
                getName() == tour.getName();
    }

    @Override
    public int hashCode() {

        return Objects.hash( getFood(), getTransport(), getHotel(), getName() );
    }

    public String getFood() {
        return food;
    }

    public String getTransport() {
        return transport;
    }

    public String getHotel() {
        return hotel;
    }

    public ServiceType getName() {
        return name;
    }

}
