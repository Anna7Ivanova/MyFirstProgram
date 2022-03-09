package poly;

public class QualityAssuranceEmp extends Employee {
    private boolean hasISTQB;

    public boolean isHasISTQB() {
        return hasISTQB;
    }

    public void setHasISTQB(boolean hasISTQB) {
        this.hasISTQB = hasISTQB;
    }

    public QualityAssuranceEmp(String name, String startDate, double salary, String department, boolean hasISTQB) {
        super(name, startDate, salary, department);
        setHasISTQB(hasISTQB);
    }

    public void writingTests(){
        System.out.println(this + "is writing tests...");
    }

    @Override
    protected void calculateBonus() {
        //some business logic here for calculating QA's bonus
        //number of Test Cases created/executed
    }
}
