package service;

public class OptionalService extends Service {
    /**
     * This filed contains information about the type of additional supplements.
     */
    private ServiceType name;
    /**
     * This field contain the cost of a service.
     */

    /**
     * This Constructor can be used for creation of any of additional supplements.
     *
     * @param cost     sum of money that should be paid for any type of service.
     * @param duration number of days.
     * @param name     name of of additional supplements.
     */
    public OptionalService(ServiceType name, int duration, int cost) {
        super( cost, duration );
        this.name = name;
    }

    @Override
    public String toString() {
        return "OptionalService{" +
                "cost=" + this.getCost() +
                ", duration=" + this.getDuration() +
                ", name=" + name +
                '}';
    }
}
