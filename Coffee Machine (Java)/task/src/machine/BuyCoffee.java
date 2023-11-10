package machine;

import java.util.Scanner;

public class BuyCoffee {
    Scanner scanner = new Scanner(System.in);
    public int water = 400;
    public int milk = 540;
    public int coffeeBeans = 120;
    public int cups = 9;
    public int cash = 550;

    public int espressoWater = 250;
    public int espressoMilk = 0;
    public int espressoCoffeeBeans = 16;
    public int espressoCost = 4;

    public int latteWater = 350;
    public int latteMilk = 75;
    public int latteCoffeeBeans = 20;
    public int latteCost = 7;

    public int cappuccinoWater = 200;
    public int cappuccinoMilk = 100;
    public int cappuccinoCoffeeBeans = 12;
    public int cappuccinoCost = 6;

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
        int coffeeOption = scanner.nextInt();
        return coffeeOption;
    }

    public void dispenseCoffee(int coffeeChoice){
        if(coffeeChoice == 1){  //make espresso
            setWater(this.water - espressoWater);
            setMilk(this.milk - espressoMilk);
            setCoffeeBeans(this.milk - espressoCoffeeBeans);
            setCups(this.cups--);
            setCash(this.cash - espressoCost);

        }
        else if(coffeeChoice == 2){
            //make latte
        }
        else if(coffeeChoice == 3){
            //make cappuccino
        }
    }



}
