package machine;
import java.util.Scanner;

public class CoffeeMachine {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        //        System.out.println("Starting to make a coffee");
        //        System.out.println("Grinding coffee beans");
        //        System.out.println("Boiling water");
        //        System.out.println("Mixing boiled water with crushed coffee beans");
        //        System.out.println("Pouring coffee into the cup");
        //        System.out.println("Pouring some milk into the cup");
        //        System.out.println("Coffee is ready!");
        //System.out.println("How many cups of coffee will you need:");
        //System.out.print("> ");
        // int cupsOfCoffeeNeeded = scanner.nextInt();


        Ingredients cupsOfCoffee = new Ingredients();
        int numberOfCoffeeCanMake = cupsOfCoffee.enoughIngredients();


        MakeCoffee makeCoffee = new MakeCoffee();
        makeCoffee.enoughCoffee(numberOfCoffeeCanMake);


    }
}