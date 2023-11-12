package machine;
import java.util.Scanner;

public class CoffeeMachine {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while(true){
            System.out.println("");
            String choice = mainMenu();
            if(choice.equals("exit")){
                System.exit(0);
            }
            System.out.println("");

            switch (choice) {
                case "remaining":
                    BuyCoffee.displaySupplies();
                    break;

                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                    String coffeeChoice = scanner.nextLine();

                    if (!coffeeChoice.equals("back")) {
                        BuyCoffee.buyLoop(Integer.parseInt(coffeeChoice));
                    }
                    break;

                case "fill":
                    BuyCoffee.fillMachine();
                    break;

                case "take":
                    System.out.println("I gave you $" + BuyCoffee.getCash());
                    BuyCoffee.setCash(0);
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