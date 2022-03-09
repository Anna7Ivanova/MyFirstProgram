package poly;

public class DeveloperEmp extends Employee{
    private String programingLanguage;

    public String getProgramingLanguage() {
        return programingLanguage;
    }

    public void setProgramingLanguage(String programingLanguage) {
        this.programingLanguage = programingLanguage;
    }

    public DeveloperEmp(String name, String startDate, double salary, String department, String programingLanguage) {
        super(name, startDate, salary, department);//super is parent class constructor
        setProgramingLanguage(programingLanguage);
    }

    public void writeCode(){
        System.out.println(this + "is writing code...");
    }

    @Override
    protected void calculateBonus() {
        //some business logic here for calculating developer's bonus
        //for example: number of issues per story develop(kolko byga e dopusnal programista za dadena funkcionalnost)
    }
}
