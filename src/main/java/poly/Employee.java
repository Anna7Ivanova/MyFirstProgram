package poly;

public abstract class Employee implements Seniority, Manager{ //abstract class is not forced to implement methods from interfaces
    private String name;
    private String startDate;
    private double salary;
    private String department;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public double getSalary(Roles role) {
        if (role.equals(Roles.Accountant)) {
            return salary;
        } else {
            return -1;
        }
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    //constructor
    public Employee(String name, String startDate, double salary, String department) {
        setName(name);//it's goot to use the setter when setting values
        setDepartment(department);//because that way we will use the validation inside the setter
        setSalary(salary);
        setStartDate(startDate);
    }
    //abstract class - therefore the class shall be abstract
    protected abstract void calculateBonus();

    //not abstract method in abstract class
    protected void setBonus(double bonus){
        System.out.println(this.name + " has " + bonus + ".");
        System.out.println("Total is: " + salary + bonus);
    }

    //method overload
    protected void setBonus(){
        System.out.println("Bonus is 1000");
    }
}
