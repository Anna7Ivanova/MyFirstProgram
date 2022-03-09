package homework10.polymorphism;

public class CompanyET extends Company implements Invoicing {
    private String ownerName;
    private double initialCapital;
    private double currentCapital;

    public CompanyET(String name, String dateOfCreation, String bulstat, String ownerName, double initialCapital, double currentCapital) {
        super(name, dateOfCreation, bulstat);
        setOwnerName(ownerName);
        setInitialCapital(initialCapital);
        setCurrentCapital(currentCapital);
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getInitialCapital() {
        return initialCapital;
    }

    public void setInitialCapital(double initialCapital) {
        this.initialCapital = initialCapital;
    }

    public double getCurrentCapital() {
        return currentCapital;
    }

    public void setCurrentCapital(double currentCapital) {
        this.currentCapital = currentCapital;
    }

    public double calculateProfit(double initialCapital, double currentCapital){
        double result;
        result = initialCapital + currentCapital;
        return result;
    }

    @Override
    public void describeInvoicing() {

    }
}
