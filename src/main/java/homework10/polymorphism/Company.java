package homework10.polymorphism;

public class Company {
    private String name;
    private String dateOfCreation;
    private String bulstat;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid name of the company!");
        }
    }

    public String getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(String dateOfCreation) {
        if (!dateOfCreation.trim().isEmpty()) {
            this.dateOfCreation = dateOfCreation;
        } else {
            System.out.println("Invalid date of creation!");
        }
    }

    public String getBulstat() {
        return bulstat;
    }

    public void setBulstat(String bulstat) {
        if (bulstat.length()==10){
            this.bulstat = bulstat;
        //}esle{
            System.out.println("Invalid bulstat");
        }
    }
    public Company( String name, String dateOfCreation, String bulstat){
        setName(name);
        setDateOfCreation(dateOfCreation);
        setBulstat(bulstat);
    }
}