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


        //        Ingredients cupsOfCoffee = new Ingredients();
        //        int numberOfCoffeeCanMake = cupsOfCoffee.enoughIngredients();
        //
        //        MakeCoffee makeCoffee = new MakeCoffee();
        //        String result = makeCoffee.enoughCoffee(numberOfCoffeeCanMake);
        //        System.out.println(result);
        // END GOOD BIT
        int water = 200;
        int milk = 50;
        int coffeeBeans = 15;

        System.out.println("Write how many ml of water the coffee machine has:");
        int qtyWater = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int qtyMilk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int qtyCoffeeBeans = scanner.nextInt();
        System.out.println("Write how many cups of coffee will you need:");
        int cupsOfCoffeeNeeded = scanner.nextInt();

        // Find minimum number of cups can make according to water, milk, beans
        //        Ingredients cupsOfCoffee = new Ingredients();
//        int numberOfCoffeeCanMake = cupsOfCoffee.enoughIngredients();
//
//        MakeCoffee makeCoffee = new MakeCoffee();
//        String result = makeCoffee.enoughCoffee(numberOfCoffeeCanMake);
//        System.out.println(result);
// END GOOD BIT

//        System.out.println("Starting to make a coffee");
//        System.out.println("Grinding coffee beans");
//        System.out.println("Boiling water");
//        System.out.println("Mixing boiled water with crushed coffee beans");
//        System.out.println("Pouring coffee into the cup");
//        System.out.println("Pouring some milk into the cup");
//        System.out.println("Coffee is ready!");

//System.out.println("How many cups of coffee will you need:");
//System.out.print("> ");
// int cupsOfCoffeeNeeded = scanner.nextInt();int cupsByWater = qtyWater / water;
        int cupsByMilk = qtyMilk / milk;
        int cupsByCoffeeBeans = qtyCoffeeBeans / coffeeBeans;
        int minTemporary = Math.min(cupsByWater, cupsByMilk);
        int numberOfCupsCanMake = Math.min(minTemporary, cupsByCoffeeBeans);

        // print results
        if (cupsOfCoffeeNeeded == numberOfCupsCanMake) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (cupsOfCoffeeNeeded < numberOfCupsCanMake) {
            System.out.println("Yes, I can make that amount of coffee (and even " + (numberOfCupsCanMake - cupsOfCoffeeNeeded) + " more than that)");
        } else{ System.out.println("No, I can make only " + numberOfCupsCanMake + " cups(s) of coffee");
        }
    }
}


//GOOD BIT

