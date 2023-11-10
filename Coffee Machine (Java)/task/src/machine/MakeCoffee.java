package machine;

import java.util.Scanner;

public class MakeCoffee {
    Scanner scanner = new Scanner(System.in);

    // part 3
    public String enoughCoffee(int numberOfCoffeeCanMake) {
        System.out.println("How many cups of coffee will you need?");
        int numberOfCoffeeNeeded = scanner.nextInt();

        if (numberOfCoffeeNeeded == numberOfCoffeeCanMake) {
            return "Yes, I can make that amount of coffee";
        } else if (numberOfCoffeeNeeded > numberOfCoffeeCanMake) {
            return "No, I can make only " + numberOfCoffeeCanMake + " cups(s) of coffee";
        } else {
            return "Yes, I can make that amount of coffee (and even " + (numberOfCoffeeCanMake - numberOfCoffeeNeeded) + " more than that)";
        }
    }

}
