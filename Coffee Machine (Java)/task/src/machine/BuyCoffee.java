package machine;

import java.util.Scanner;

public class BuyCoffee {
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
    public static int getEspressoWater(){ return espressoWater;}
    public static int getEspressoMilk(){ return espressoMilk;}
    public static int getEspressoCoffeeBeans() { return espressoCoffeeBeans;}
    public static int getEspressoCost() { return espressoCost;}
    public static int getLatteWater(){ return latteWater;}
    public static int getLatteMilk(){ return latteMilk;}
    public static int getLatteCoffeeBeans() { return latteCoffeeBeans;}
    public static int getLatteCost() { return latteCost;}
    public static int getCappuccinoWater(){ return cappuccinoWater;}
    public static int getCappuccinoMilk() { return cappuccinoMilk;}
    public static int getCappuccinoCoffeeBeans() { return cappuccinoCoffeeBeans;}
    public static int getCappuccinoCost() { return cappuccinoCost;}

    



    //METHODS

    public static String checkEnoughSupplies(int coffeeType){
        if(coffeeType == 1){
            return enoughIngredients(getEspressoWater(), getEspressoMilk(), getEspressoCoffeeBeans(), getEspressoCost());
            //espresso
        }
        else if(coffeeType == 2){
            return enoughIngredients(getLatteWater(), getLatteMilk(), getLatteCoffeeBeans(), getLatteCost());
            // latte
        }
        else if(coffeeType ==3){
            return enoughIngredients(getCappuccinoWater(), getCappuccinoMilk(), getCappuccinoCoffeeBeans(), getCappuccinoCost());
            //cappuccino
        }
        return "";
    }

    public static String enoughIngredients(int cupOfCoffeeWater, int cupOfCoffeeMilk, int cupOfCoffeeBeans, int cupOfCoffeeCost){
        int cupsByWater = getWater() - cupOfCoffeeWater;
        int cupsByMilk = getMilk() - cupOfCoffeeMilk;
        int cupsByCoffeeBeans = getCoffeeBeans() - cupOfCoffeeBeans;

        if(cupsByWater < 0){
            return "Sorry, not enough water!";
        }
        else if(cupsByMilk < 0){
            return "Sorry, not enough milk!";
        }
        else if(cupsByCoffeeBeans < 0){
            return "Sorry, not enough coffee beans!";
        }

        setCups(getCups() - 1);
        setWater(getWater() - cupOfCoffeeWater);
        setMilk(getMilk() - cupOfCoffeeMilk);
        setCoffeeBeans(getCoffeeBeans() - cupOfCoffeeBeans);
        setCash(getCash() + cupOfCoffeeCost);
        return "I have enough resources, making you a coffee!";
    }

    public static void dispenseCoffee(int coffeeChoice){
        setCups(getCups() - 1);
        if(coffeeChoice == 1){
            //make espresso
            setWater(getWater() - getEspressoWater());
            setMilk(getMilk() - getEspressoMilk());
            setCoffeeBeans(getCoffeeBeans() - getEspressoCoffeeBeans());
            setCash(getCash() + getEspressoCost());
        }
        else if(coffeeChoice == 2){
            //make latte
            setWater(getWater() - getLatteWater());
            setMilk(getMilk() - getLatteMilk());
            setCoffeeBeans(getCoffeeBeans() - getLatteCoffeeBeans());
            setCash(getCash() + getLatteCost());
        }
        else if(coffeeChoice == 3){
            //make cappuccino
            setWater(getWater() - getCappuccinoWater());
            setMilk(getMilk() - getCappuccinoMilk());
            setCoffeeBeans(getCoffeeBeans() - getCappuccinoCoffeeBeans());
            setCash(getCash() + getCappuccinoCost());
        }
    }

    public static void displaySupplies(){
        System.out.println("The coffee machine has:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(coffeeBeans + " g of coffee beans");
        System.out.println(cups + " disposable cups");
        System.out.println("$" + cash + " of money");
    }

    public static void buyLoop(int coffeeChoice){
        System.out.println(checkEnoughSupplies(coffeeChoice));
    }

    public static void fillMachine(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write how many ml of water you want to add:");
        int addWater = scanner.nextInt();
        setWater(getWater() + addWater);
        System.out.println("Write how many ml of milk you want to add:");
        int addMilk = scanner.nextInt();
        setMilk(getMilk() + addMilk);
        System.out.println("Write how many grams of coffee beans you want to add:");
        int addCoffeeBeans = scanner.nextInt();
        setCoffeeBeans(getCoffeeBeans() + addCoffeeBeans);
        System.out.println("Write how many disposable cups you want to add:");
        int addCups = scanner.nextInt();
        setCups(getCups() + addCups);

    }

}
