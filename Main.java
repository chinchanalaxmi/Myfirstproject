package codeacademy;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bill baseBill = new Bill();
        Scanner input = new Scanner(System.in);
        int PizzaType = 0;
        int PizzaPrice = 49;

        while (true) {
            System.out.println("1. Mexican Pizza\n2. Corn Pizza\n3. Chicken Pizza\n4. Paneer Pizza");
            System.out.print("Enter your choice: ");

            if (input.hasNextInt()) {
                PizzaType = input.nextInt();

                if (PizzaType >= 1 && PizzaType <= 4) {
                    switch (PizzaType) {
                        case 1:
                            PizzaPrice = 130;
                            break;
                        case 2:
                            PizzaPrice = 100;
                            break;
                        case 3:
                            PizzaPrice = 250;
                            break;
                        case 4:
                            PizzaPrice = 150;
                            break;
                    }
                    break;
                } else {
                    System.out.println("Please enter a valid choice (1 to 4)!");
                }
            } else {
                System.out.println("Invalid input. Please enter a number!");
                input.next();
            }
        }

        input.nextLine();

        baseBill.addExtraCheese();
        baseBill.addExtraToppings();
        baseBill.takeAway();

        baseBill.getBill(PizzaPrice);
        
        input.close();
    }
}
