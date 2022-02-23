package animals;

public class Mammal {
    private String name;
    private String food;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(!name.isEmpty()){
            this.name = name;
        }else{
            System.out.println("Invalid data!");
        }
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        if (!food.isEmpty()) {
            this.food = food;
        } else {
            System.out.println("Invalid data!");
        }
    }

    public Mammal(String name, String food){
        setName(name);
        setFood(food);
    }

    protected void eatFood(){
        System.out.println(name + " eats " + food );
    }
}