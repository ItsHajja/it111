import java.util.Scanner;

public class dailySpecials {

    public static void main(String[] args) {

        String specials;
        String coffee = "";
        double price = 0;

        Scanner input = new Scanner(System.in);

        boolean isweekend = true;

        while (isweekend) {
            System.out.println("Please enter a day of the week excluding weekends (Monday -  Friday only!):");
            specials = input.next();

            switch (specials) {
                case "Saturday":
                case "Sunday":
                    System.out.println("Please enter a weekday, not a weekend!");
                    break;

                case "Monday":
                    coffee = "Latte";
                    price = 4.95;
                    System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
                    isweekend = false;
                    break;

                case "Tuesday":
                    coffee = "Frappuccino";
                    price = 5.95;
                    System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
                    isweekend = false;
                    break;

                case "Wednesday":
                    coffee = "Cappuccino";
                    price = 4.35;
                    System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
                    isweekend = false;
                    break;

                case "Thursday":
                    coffee = "Regular Joe";
                    price = 2.95;
                    System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
                    isweekend = false;
                    break;

                case "Friday":
                    coffee = "Green Tea Latte";
                    price = 6.95;
                    System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
                    isweekend = false;
                    break;

                default:
                    System.out.println("Invalid day entered");
                    break;

            }
        }
        System.out.println("How many " + coffee + "s would you like to order?");
        int quantity = input.nextInt();

        if (quantity == 0) {
            System.out.println("Looks like you don't like " + coffee + "s! So sad!!!");

        } else if (quantity >= 1 && quantity <= 4) {
            double total = quantity * price;
            System.out.println("You ordered " + quantity + " " + coffee + (quantity > 1 ? "s" : "") + " totaling $" + String.format("%.2f", total));
            System.out.println("Looks like you will be ordering only one " + coffee + " today!");

        } else if(quantity >= 5 && quantity <= 9) {
            double discount = 0.10;
            double total = quantity * price * (1 - discount);
            System.out.println("Looks like you qualify for a 10% group discount!");
            System.out.println(quantity + " " + coffee + "s have been ordered totaling $" + String.format("%.2f", total));

        }  else if(quantity >= 10) {
                double discount = 0.20;
                double total = quantity * price * (1 - discount);
                System.out.println("Awesome! A big group order! You get a 20% discount.");
                System.out.println(quantity + " " + coffee + "s have been ordered totaling $" + String.format("%.2f", total));
        } else {
            System.out.println("Invalid quantity entered.");
        }

        input.close();
    }


    }