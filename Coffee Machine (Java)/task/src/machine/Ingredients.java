package machine;

import java.util.Scanner;

public class Ingredients {
    Scanner scanner = new Scanner(System.in);

    private int water = 200;
    private int milk = 50;
    private int coffeeBeans = 15;

    //Getters and Setters
    public int getWater(){
        return this.water;
    }
    public int getMilk(){
        return this.milk;
    }
    public int getCoffeeBeans(){
        return this.coffeeBeans;
    }


    // METHODS
    public void howManyCupsCanMake(int cupsOfCoffeeNeeded) {
        System.out.println("For " + cupsOfCoffeeNeeded + " cups of coffee you will need:");
        System.out.println(cupsOfCoffeeNeeded * this.water + " ml of water");
        System.out.println(cupsOfCoffeeNeeded * this.milk + " ml of milk");
        System.out.println(cupsOfCoffeeNeeded * this.coffeeBeans + " g of coffee beans");
    }

    public int enoughIngredients(){
        System.out.println("Write how many ml of water the coffee machine has:");
        int qtyWater = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int qtyMilk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int qtyCoffeeBeans = scanner.nextInt();

        int cupsByWater = qtyWater / water;
        int cupsByMilk = qtyMilk / milk;
        int cupsByCoffeeBeans = qtyCoffeeBeans / coffeeBeans;
        int minTemporary = Math.min(cupsByWater, cupsByMilk);
        return Math.min(minTemporary, cupsByCoffeeBeans);
    }
}
