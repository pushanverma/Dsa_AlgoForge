import java.util.*;

class Pizza {

    // Attributes----------------------
    boolean isVeg;
    boolean isToppingAdded;
    boolean isCheeseAdded;
    boolean isBagAdded;
    private int basePriceVegPizza = 300;
    private int basePriceNonVegPizza = 400;
    int totalBillAmount = 0;

    // Constructor----------------------
    public Pizza(boolean isVeg) {
        System.out.println("Pizza constructor called");
        this.isVeg = isVeg;
        if (this.isVeg == true) {
            // veg
            totalBillAmount = totalBillAmount + basePriceVegPizza;
        } else {
            // nonveg
            totalBillAmount = totalBillAmount + basePriceNonVegPizza;
        }
    }

    // Methods----------------------------
    public void addExtraToppings() {
        if (isToppingAdded == false) {
            // then you will add toppings and check for veg and non-veg
            if (this.isVeg == true) {
                totalBillAmount += 70;
            } else {
                totalBillAmount += 100;
            }
            isToppingAdded = true;
        }
    }

    public void addExtraCheese() {

        if (isCheeseAdded == false) {
            // then you will add cheese, no check for veg and non-veg required since equal
            // rate
            totalBillAmount += 80;
            isCheeseAdded = true;
        }

    }

    public void takeAway() {

        if (isBagAdded == false) {
            // then you will add bag, no check for veg and non-veg required since equal
            // rate
            totalBillAmount += 20;
            isBagAdded = true;
        }

    }

    public void getBill() {
        System.out.println("Your total bill amount is ->" + totalBillAmount);
    }

}

class DeluxePizza extends Pizza {

    public DeluxePizza(boolean isVeg) {
        super(isVeg);
        super.addExtraToppings();
        super.addExtraCheese();
    }

}

class DominosPizza {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        // Step 1
        System.out.println("Choose \n 1.Regular Pizza  \n 2.Deluxe Pizza");
        int pizzaType = scn.nextInt();

        if (pizzaType == 1) {
            // topic: REGULAR PIZZA
            System.out.println("You have selected ->Regular pizza");
            Pizza p = new Pizza(true);

            while (true) {
                System.out.println(" DO YOU WANT TO \n\n1.Add Topings\n2.Add Cheese\n3.Add Bags\n4.Get Bill");
                int option = scn.nextInt();

                switch (option) {
                    case 1:
                        System.out.println("Adding toppings to your pizza");
                        p.addExtraToppings();
                        p.getBill();
                        break;
                    case 2:
                        System.out.println("Adding cheese to your pizza");
                        p.addExtraCheese();
                        p.getBill();
                        break;
                    case 3:
                        System.out.println("Adding bag ");
                        p.takeAway();
                        p.getBill();
                        break;
                    case 4:
                        System.out.println("Getting Bill ");
                        p.getBill();
                        return;

                    default:
                        System.out.println("Invalid Choice");
                        return;
                }

            }

        } else {
            // topic: DELUXE PIZZA
            System.out.println("You have selected ->Deluxe pizza");

            DeluxePizza dp = new DeluxePizza(false);

            while (true) {
                System.out.println(" DO YOU WANT TO \n1.Add Bags\n2.Get Bill");
                int option = scn.nextInt();

                switch (option) {
                    case 1:
                        System.out.println("Adding bag ");
                        dp.takeAway();
                        dp.getBill();
                        break;
                    case 2:
                        System.out.println("Getting Bill ");
                        dp.getBill();
                        return;

                    default:
                        System.out.println("Invalid Choice");
                        return;
                }

            }

        }

    }

}