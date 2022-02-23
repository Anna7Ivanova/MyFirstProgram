package human;

import animals.Mammal;

public class Person extends Mammal {
    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getFood() {
        return super.getFood();
    }

    @Override
    public void setFood(String food) {
        super.setFood(food);
    }

    public Person(String name, String food) {
        super(name, food);
    }

    @Override
    protected void eatFood() {
        super.eatFood();
    }
}
