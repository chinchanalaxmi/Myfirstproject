package codeacademy;
import java.util.Scanner;

class Bill {
    private int extraCheesePrice = 100;
    private int extraToppingsPrice = 150;
    private int backPackPrice = 20;

    String add = "";
    String toppings = "";
    String take = "";
    Scanner scanner = new Scanner(System.in);  
    public void addExtraCheese() {
        while (true) {  
            System.out.println("Do you want extra cheese? (Yes/No)");
            String Cheese = scanner.nextLine().trim().toLowerCase();  
            
            if (Cheese.equals("yes")) {
                add = "Added";
                System.out.println("Extra cheese: Added");
                break;  
            } else if (Cheese.equals("no")) {
                add = "Not Added";
                System.out.println("Extra cheese: Not Added");
                break;  
            } else {
                System.out.println("Invalid choice, please try again.");
            }
        }
    }

    
    public void addExtraToppings() {
        while (true) {  
            System.out.println("Do you want extra toppings? (Yes/No)");
            String Toppings = scanner.nextLine().trim().toLowerCase();  
            if (Toppings.equals("yes")) {
                toppings = "Added";
                System.out.println("Extra toppings: Added");
                break; 
            } else if (Toppings.equals("no")) {
                toppings = "Not Added";
                System.out.println("Extra toppings: Not Added");
                break;  
            } else {
                System.out.println("Invalid choice, please try again.");
            }
        }
    }

    public void takeAway() {
        while (true) {  
            System.out.println("Do you want take-away? (Yes/No)");
            String Take = scanner.nextLine().trim().toLowerCase();  

            if (Take.equals("yes")) {
                take = "Take Away";
                System.out.println("Take away: Yes");
                break;  
            } else if (Take.equals("no")) {
                take = "Not Required";
                System.out.println("Take away: No");
                break;  
            } else {
                System.out.println("Invalid choice, please try again.");
            }
            
        }
    }
    
    public void getBill(int PizzaPrice) {
        if (!add.equals("Added") && !toppings.equals("Added") && !take.equals("Take Away")) {
            System.out.println("Your Total Bill: " + PizzaPrice + " Rs");
        } else {
            if (add.equals("Added")) {
                PizzaPrice += extraCheesePrice;
            }
            if (toppings.equals("Added")) {
                PizzaPrice += extraToppingsPrice;
            }
            if (take.equals("Take Away")) {
                PizzaPrice += backPackPrice;
            }
            System.out.println("Your Total Bill: " + PizzaPrice + " Rs");
        }
    }
}
