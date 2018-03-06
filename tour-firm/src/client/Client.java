package client;

public class Client {
    /**
     * This field contains name of a person who applies for a tour or another service
     */
    private String name;
    /**
     * This field contains information about available some of money
     */
    private int money;
    /**
     * This field contains the number of vacation days
     */
    private int vacation;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getVacation() {
        return vacation;
    }

    public void setVacation(int vacation) {
        this.vacation = vacation;
    }
}
