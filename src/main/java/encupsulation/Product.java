package encupsulation;

public class Product {
    private String name;
    private int cost;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid product name entry!");
        }
    }
    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        if (cost >= 0) {
            this.cost = cost;
        } else {
            System.out.println("Invalid entry for price!");
        }
    }
    public Product(String name, int cost){
        setName(name);
        setCost(cost);
    }

}
