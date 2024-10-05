package codeacademy;

class Bill {
    private int price;
    private Boolean veg;
    private int extraCheesePrice = 100;
    private int extraToppingsPrice = 150;
    private int backPackPrice = 20;
    private int basePizzaPrice;
    private Boolean isExtraCheeseAdded = false;
    private Boolean isExtraToppingsAdded = false;
    private Boolean isOptedForTakeAway = false;

    public Bill(Boolean veg) {
        this.veg = veg;
        if (this.veg) {
            this.price = 300;
        } else {
            this.price = 400;
        }
        basePizzaPrice = this.price;
    }

    public void addExtraCheese() {
        isExtraCheeseAdded = true;
        System.out.println("Extra cheese added");
        this.price += extraCheesePrice;
    }

    public void addExtraToppings() {
        isExtraToppingsAdded = true;
        System.out.println("Extra Toppings added");
        this.price += extraToppingsPrice;
    }

    public void takeAway() {
        isOptedForTakeAway = true;
        System.out.println("Take away opted");
        this.price += backPackPrice;
    }

    public void getBill() {
        String bill = "";
        bill += "Base Pizza Price: " + basePizzaPrice + "\n";
        if (isExtraCheeseAdded) {
            bill += "Extra cheese added: " + extraCheesePrice + "\n";
        }
        if (isExtraToppingsAdded) {
            bill += "Extra Toppings added: " + extraToppingsPrice + "\n";
        }
        if (isOptedForTakeAway) {
            bill += "Take away: " + backPackPrice + "\n";
        }
        bill += "Total Bill: " + this.price + "\n";
        System.out.println(bill);
    }
}