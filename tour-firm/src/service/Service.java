package service;

public abstract class Service {
    /**
     * This field contains sum of money that should be paid for any type of service.
     */
    private int cost;
    /**
     * This filed contains number of days.
     */
    private int duration;
    /**
     * This field contains county name.
     */
    private String country;

    /**
     * Constructor is used in child class.
     *
     * @param cost     sum of money that should be paid for any type of service
     * @param duration number of days.
     * @param country  county name.
     */
    public Service(int cost, int duration, String country) {
        this.cost = cost;
        this.duration = duration;
        this.country = country;
    }

    /**
     * Constructor is used in child class.
     *
     * @param cost     sum of money that should be paid for any type of service
     * @param duration number of days.
     */
    public Service(int cost, int duration) {
        this.cost = cost;
        this.duration = duration;
    }


    public int getCost() {
        return cost;
    }


    public int getDuration() {
        return duration;
    }


    public String getCountry() {
        return country;
    }

}
