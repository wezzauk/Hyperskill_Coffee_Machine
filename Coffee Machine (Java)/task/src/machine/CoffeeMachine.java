package machine;
import java.util.Scanner;

public class CoffeeMachine {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        BuyCoffee buyCoffee = new BuyCoffee();
        buyCoffee.displaySupplies();
        boolean cafe = true;

        while(cafe) {
            displayOptions();
            String choice = scanner.nextLine();

            switch (choice) {
                case "buy":
                    buyCoffee.displaySupplies();
                    int coffeeChoice = buyCoffee.selectDrink();
                    buyCoffee.dispenseCoffee(coffeeChoice);
                    System.out.println("Coffee has been served");
                    buyCoffee.displaySupplies();
                    break;
                case "fill":
                    System.out.println("How much water would you like to add? ");
                    int addWater = scanner.nextInt();
                    System.out.println("How much milk would you like to add? ");
                    int addMilk = scanner.nextInt();
                    System.out.println("How much coffee beans would you like to add? ");
                    int addCoffeeBeans = scanner.nextInt();
                    System.out.println("How many cups would you like to add? ");
                    int addCups = scanner.nextInt();
                    buyCoffee.displaySupplies();
                    break;
                case "take": //case
                    System.out.println(buyCoffee.getCash());
                    break;
                default:
                    System.out.println("Please select a valid option");
                    break;
            }
        }


        Ingredients cupsOfCoffee = new Ingredients();
        int numberOfCoffeeCanMake = cupsOfCoffee.enoughIngredients();


        MakeCoffee makeCoffee = new MakeCoffee();
        makeCoffee.enoughCoffee(numberOfCoffeeCanMake);


    }

    public static void displayOptions(){
        System.out.println("Options\n=======");
        System.out.println("buy");
        System.out.println("fill");
        System.out.println("take");
        System.out.print("Type in your option: ");
        String choice = scanner.nextLine();
    }
}