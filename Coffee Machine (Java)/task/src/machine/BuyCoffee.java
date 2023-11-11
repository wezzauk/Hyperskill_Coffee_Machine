package machine;

import java.util.Scanner;

public class BuyCoffee {
    Scanner scanner = new Scanner(System.in);
    private static int water = 400;
    private static int milk = 540;
    private static int coffeeBeans = 120;
    private static int cups = 9;
    private static int cash = 550;

    private static int espressoWater = 250;
    private static int espressoMilk = 0;
    private static int espressoCoffeeBeans = 16;
    private static int espressoCost = 4;

    private static int latteWater = 350;
    private static int latteMilk = 75;
    private static int latteCoffeeBeans = 20;
    private static int latteCost = 7;

    private static int cappuccinoWater = 200;
    private static int cappuccinoMilk = 100;
    private static int cappuccinoCoffeeBeans = 12;
    private static int cappuccinoCost = 6;

    //GETTERS and SETTERS
    public static int getWater(){
        return water;
    }
    public static int getMilk(){
        return milk;
    }
    public static int getCoffeeBeans(){
        return coffeeBeans;
    }
    public static int getCups(){
        return cups;
    }
    public static int getCash(){
        return cash;
    }
    public static void setWater(int moreWater){
        water = moreWater;
    }
    public static void setMilk(int moreMilk){
        milk = moreMilk;
    }
    public static void setCoffeeBeans(int moreCoffeeBeans){
        coffeeBeans = moreCoffeeBeans;
    }
    public static void setCups(int moreCups){
        cups = moreCups;
    }
    public static void setCash(int moreCash){
        cash = moreCash;
    }



    //METHODS


    public static void dispenseCoffee(int coffeeChoice){
        setCups(cups - 1);
        if(coffeeChoice == 1){
            //make espresso
            setWater(water - espressoWater);
            setMilk(milk - espressoMilk);
            setCoffeeBeans(coffeeBeans - espressoCoffeeBeans);
            setCash(cash + espressoCost);
        }
        else if(coffeeChoice == 2){
            //make latte
            setWater(water - latteWater);
            setMilk(milk - latteMilk);
            setCoffeeBeans(coffeeBeans - latteCoffeeBeans);
            setCash(cash + latteCost);
        }
        else if(coffeeChoice == 3){
            //make cappuccino
            setWater(water - cappuccinoWater);
            setMilk(milk - cappuccinoMilk);
            setCoffeeBeans(coffeeBeans - cappuccinoCoffeeBeans);
            setCash(cash + cappuccinoCost);
        }
    }

    public static void displaySupplies(){
        System.out.println("The coffee machine has:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(coffeeBeans + " g of coffee beans");
        System.out.println(cups + " disposable cups");
        System.out.println("$" + cash + " of money");
        System.out.println("");
    }

    public static void buyLoop(int coffeeChoice){
        BuyCoffee.displaySupplies();

        switch (choice) {
            case "back":
                break;
            case "buy":
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
                int coffeeChoice = scanner.nextInt();
                buyCoffee.dispenseCoffee(coffeeChoice);
                break;
            case "fill":
                System.out.println("Write how many ml of water you want to add:");
                int addWater = scanner.nextInt();
                buyCoffee.setWater(buyCoffee.getWater() + addWater);
                System.out.println("Write how many ml of milk you want to add:");
                int addMilk = scanner.nextInt();
                buyCoffee.setMilk(buyCoffee.getMilk() + addMilk);
                System.out.println("Write how many grams of coffee beans you want to add:");
                int addCoffeeBeans = scanner.nextInt();
                buyCoffee.setCoffeeBeans(buyCoffee.getCoffeeBeans() + addCoffeeBeans);
                System.out.println("Write how many disposable cups you want to add:");
                int addCups = scanner.nextInt();
                buyCoffee.setCups(buyCoffee.getCups() + addCups);
                break;
            case "take":
                System.out.println("I gave you $" + buyCoffee.getCash() + "\n");
                buyCoffee.setCash(0);
                break;
        }
        buyCoffee.displaySupplies();
    }


}
