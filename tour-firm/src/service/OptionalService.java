package service;

public class OptionalService extends Service {
    /**
     * This filed contains information about the type of additional supplements.
     */
    private ServiceType name;
    /**
     * This field contain the cost of a service.
     */
    private int sumOfMoney;
    /**
     * This field contains the required documents for the trip.
     */
    private String documentSuite;

    /**
     * This Constructor can be used for creation of any of additional supplements.
     * @param cost sum of money that should be paid for any type of service.
     * @param duration number of days.
     * @param name name of of additional supplements.
     */
    public OptionalService(ServiceType name, int duration, int cost ) {
        super( cost, duration );
        this.name = name;
    }
    /**
     * This Constructor can be used for creation of visas.
     * @param cost sum of money that should be paid for any type of service.
     * @param duration number of days.
     * @param country county name.
     * @param name name of of additional supplements.
     */
    public OptionalService(ServiceType name, String country, int duration, int cost ) {
        super( cost, duration, country );
        this.name = name;
    }
    public ServiceType getName() {
        return name;
    }

    public void setName(ServiceType name) {
        this.name = name;
    }

    public int getSumOfMoney() {
        return sumOfMoney;
    }

    public void setSumOfMoney(int sumOfMoney) {
        this.sumOfMoney = sumOfMoney;
    }

    public String getDocumentSuite() {
        return documentSuite;
    }

    public void setDocumentSuite(String documentSuite) {
        this.documentSuite = documentSuite;
    }
}
