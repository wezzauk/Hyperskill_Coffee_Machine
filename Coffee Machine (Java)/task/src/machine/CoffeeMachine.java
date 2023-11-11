package machine;
import java.util.Scanner;

public class CoffeeMachine {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        BuyCoffee buyCoffee = new BuyCoffee();
        String userChoice = "";

        while(true){
            String choice = mainMenu();

            switch (choice) {
                case "exit":
                    System.exit(0);

                case "remaining":
                    BuyCoffee.displaySupplies();
                    break;

                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                    String coffeeChoice = scanner.nextLine();

                    if(coffeeChoice.equals("back")){
                        break;
                    } else {
                        BuyCoffee.buyLoop(Integer.parseInt(coffeeChoice));   //HERE
                        buyCoffee.dispenseCoffee(coffeeChoice);
                        break;
                    }

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



        }

    }

    //METHODS

    public static String mainMenu(){
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        String choice = scanner.nextLine();
        return choice;


    }


}