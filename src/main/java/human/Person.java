package human;

import animals.Mammal;

public class Person extends Mammal {

    public Person(String name, String food) {
        super(name, food);
    }

    @Override
    protected void eatFood() {
        super.eatFood();
    }
}
