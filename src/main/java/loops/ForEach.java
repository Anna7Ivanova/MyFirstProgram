package loops;

public class ForEach {
    public static void main(String[] args) {
        int[] numbers = {4, 5, 34, 567, 234};
        String[] cities = {"Pomorie", "Bansko", "Minsk" };
        for (int number : numbers) {
            System.out.println(number);
        }
        for (String city : cities) {
            System.out.println(city);
        }
        for (int i = 0; i < cities.length; i++) {

            System.out.println(cities[i]);
        }

    }

    }

