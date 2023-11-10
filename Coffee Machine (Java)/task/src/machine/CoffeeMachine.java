package machine;
import java.util.Scanner;

public class CoffeeMachine {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Options\n=======");
        System.out.println("buy");
        System.out.println("fill");
        System.out.println("take");
        System.out.print("Type in your option: ");
        String choice = scanner.nextLine();

        boolean cafe = true;

        while(cafe) {
            switch (choice) {
                case "buy":
                    BuyCoffee buyCoffee = new BuyCoffee();
                    int coffeeChoice = buyCoffee.selectDrink();

                    //code
                case "fill":
                    //test
                    //code
                case "take": //case
                    //ddd
                default:
                    System.out.println("Please select a valid option");
            }
        }


        Ingredients cupsOfCoffee = new Ingredients();
        int numberOfCoffeeCanMake = cupsOfCoffee.enoughIngredients();


        MakeCoffee makeCoffee = new MakeCoffee();
        makeCoffee.enoughCoffee(numberOfCoffeeCanMake);


    }
}