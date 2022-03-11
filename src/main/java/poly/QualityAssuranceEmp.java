package poly;

public class QualityAssuranceEmp extends Employee {
    private boolean hasISTQB;
   // public static LinkedList<QualityAssuranceEmp> list;

    public boolean isHasISTQB() {
        return hasISTQB;
    }

    public void setHasISTQB(boolean hasISTQB) {
        this.hasISTQB = hasISTQB;
    }

    public QualityAssuranceEmp(String name, String startDate, double salary, String department, boolean hasISTQB) {
        super(name, startDate, salary, department);
        setHasISTQB(hasISTQB);
       // list.add(this);
    }

    public void writingTests(){
        System.out.println(this + "is writing tests...");
    }

    @Override
    protected void calculateBonus() {
        //some business logic here for calculating QA's bonus
        //number of Test Cases created/executed
    }

    @Override
    public void supportSomeone() {
        System.out.println("the test cases look great!");
    }

    @Override
    public String giveFeedback() {
        return "This test case is awesome!";
    }

    @Override
    public void fillInPresentSheets() {
        System.out.println("QA manager: fill in data");
    }
    @Override
    protected void setBonus(){
        super.setBonus();//super gets stuff from the parent
        this.hasISTQB = true;//this gets stuff from the current context(class)
        System.out.println("Bonus is 1500");
    }
}
