package homework5;

public class Breed {
    private String breedname;

    public String getBreedname() {
        return breedname;
    }

    public void setBreedname(String breedname) {
        if (!breedname.isEmpty()) {
            this.breedname = breedname;
        } else {
            System.out.println("Invalid data!");
        }
    }
}