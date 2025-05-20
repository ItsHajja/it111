import java.util.Scanner;

public class dailySpecials {

    public static void main(String[] args) {

        String specials;
        String coffee = "";
        double price = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a day of the week excluding weekends (Monday -  Friday only!");

specials = input.next();

// in the world of coffee, I need a name of a coffee beverage and a price

boolean saturday = specials.equals("Saturday");
        boolean sunday = specials.equals("Sunday");

        if(saturday || sunday) {
            System.out.println("Please enter a weekday, not weekend!");
            specials = input.next();
        }

        switch (specials) {

        // my cases will be the day of the week
            case "Monday" -> {
                coffee = "Latte";
                price = 4.95;
                System.out.println(specials+"'s coffee of the day is a " +coffee+ " and the price will be $" +price);
            }
            case "Tuesday" -> {
                coffee = "Frappuccino";
                price = 5.95;
                System.out.println(specials+"'s coffee of the day is a " +coffee+ " and the price will be $" +price);
            }
            case "Wednesday" -> {
                coffee = "Cappuccino";
                price = 4.35;
                System.out.println(specials+"'s coffee of the day is a " +coffee+ " and the price will be $" +price);
            }
            case "Thursday" -> {
                coffee = "Regular Joe";
                price = 2.95;
                System.out.println(specials+"'s coffee of the day is a " +coffee+ " and the price will be $" +price);
            }
            case "Friday" -> {
                coffee = "Green Tea Latte";
                price = 6.95;
                System.out.println(specials+"'s coffee of the day is a " +coffee+ " and the price will be $" +price);
            }
            default -> {
                System.out.println("Invalid weekday entered");
                System.exit(0);
            }
        }
        System.out.println("How many " +coffee+ "s would you like to order?");
        int quantity = input.nextInt();

        if(quantity == 0) {
            System.out.println("Looks like you don't like " +coffee+ "s! So sad!!!");
        }else if(quantity == 1) {
            System.out.println("Looks like you will be ordering only one " +coffee+ " today!");
        } else {
            double total = quantity * price;
            System.out.println(quantity + " " + coffee + "'s have been ordered totaling $" +String.format("%.2f", total));
        }

        input.close();
        }



    }