package machine;

import java.util.Scanner;

public class BuyCoffee {
    Scanner scanner = new Scanner(System.in);
    private int water = 400;
    private int milk = 540;
    private int coffeeBeans = 120;
    private int cups = 9;
    private int cash = 550;

    private int espressoWater = 250;
    private int espressoMilk = 0;
    private int espressoCoffeeBeans = 16;
    private int espressoCost = 4;

    private int latteWater = 350;
    private int latteMilk = 75;
    private int latteCoffeeBeans = 20;
    private int latteCost = 7;

    private int cappuccinoWater = 200;
    private int cappuccinoMilk = 100;
    private int cappuccinoCoffeeBeans = 12;
    private int cappuccinoCost = 6;

    //GETTERS and SETTERS
    public int getWater(){
        return this.water;
    }
    public int getMilk(){
        return this.milk;
    }
    public int getCoffeeBeans(){
        return this.coffeeBeans;
    }
    public int getCups(){
        return this.cups;
    }
    public int getCash(){
        return this.cash;
    }
    public void setWater(int water){
        this.water = water;
    }
    public void setMilk(int milk){
        this.milk = milk;
    }
    public void setCoffeeBeans(int coffeeBeans){
        this.coffeeBeans = coffeeBeans;
    }
    public void setCups(int cups){
        this.cups = cups;
    }
    public void setCash(int cash){
        this.cash = cash;
    }



    //METHODS

    public int selectDrink(){
        System.out.println("Coffee Menu\n=========");
        System.out.println("1 - Espresso");
        System.out.println("2 - Latte");
        System.out.println("3 - Cappuccino");
        System.out.println("\nWhich coffee option would you like? ");
        return scanner.nextInt();
    }

    public void dispenseCoffee(int coffeeChoice){
        setCups(this.cups--);
        if(coffeeChoice == 1){
            //make espresso
            setWater(this.water - espressoWater);
            setMilk(this.milk - espressoMilk);
            setCoffeeBeans(this.milk - espressoCoffeeBeans);
            setCash(this.cash + espressoCost);
        }
        else if(coffeeChoice == 2){
            //make latte
            setWater(this.water - latteWater);
            setMilk(this.milk - latteMilk);
            setCoffeeBeans(this.coffeeBeans - latteCoffeeBeans);
            setCash(this.cash + latteCost);
        }
        else if(coffeeChoice == 3){
            //make cappuccino
            setWater(this.water - cappuccinoWater);
            setMilk(this.milk - cappuccinoMilk);
            setCoffeeBeans(this.coffeeBeans - cappuccinoCoffeeBeans);
            setCash(this.cash + cappuccinoCost);
        }
    }

    public void displaySupplies(){
        System.out.println("\nWater left: " + water);
        System.out.println("Milk left: " + milk);
        System.out.println("Coffee beans left: " + coffeeBeans);
        System.out.println("Cups left: " + cups);
        System.out.println("Cash balance: " + cash + "\n");
    }



}
