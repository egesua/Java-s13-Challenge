package employeeApp.enums;

public enum Plan {
    BASIC("BASIC", 6000),
    MEDIUM("MEDIUM", 10000),
    ADVANCE("ADVANCE", 15000);


    private String name;
    private int price;

    Plan(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

}
