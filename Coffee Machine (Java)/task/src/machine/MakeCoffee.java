package machine;

import java.util.Scanner;

public class MakeCoffee {
    Scanner scanner = new Scanner(System.in);

    // part 3
    public void enoughCoffee(int numberOfCoffeeCanMake) {
        System.out.println("Write how many cups of coffee will you need:");
        int cupsOfCoffeeNeeded = scanner.nextInt();

        if (cupsOfCoffeeNeeded == numberOfCoffeeCanMake) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (cupsOfCoffeeNeeded > numberOfCoffeeCanMake) {
            System.out.println("No, I can make only " + numberOfCoffeeCanMake + " cups(s) of coffee");
        } else {
            System.out.println("Yes, I can make that amount of coffee (and even " + (numberOfCoffeeCanMake - cupsOfCoffeeNeeded) + " more than that)");
        }
    }

}
