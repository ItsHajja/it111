import java.util.Arrays;

public class MyArrays {

    public static void main(String[] args) {

//String car = "Ferrari";

        String[] cars = new String[4];
        // in many computer programs, we start counting with zero

        cars[0] = "Ferrari";
        cars[1] = "Mazda";
        cars[2] = "Toyota";
        cars[3] = "Hyundai";

        System.out.println(cars[0].toUpperCase());
        System.out.println(Arrays.toString(cars));

 //       String[] books = {"Behold The Dreamers", "Of Mice and Men", "The Joy Luck Club", "The Twilight Saga", "Percy Jackson"};

        String[] books = new String[5];

        books[0] = "Behold The Dreamers";
        books[1] = "Of Mice and Men";
        books[2] = "The Joy Luck Club";
        books[3] = "The Twilight Saga";
        books[4] = "Harry Potter";

        System.out.println(Arrays.toString(books));

        // we are going to build a for each loop

        for(String book : books) {
            System.out.println(book);

        }

        int[] numbers = new int[3];
        numbers[0] = 20;
        numbers[1] = 30;
        numbers[2] = 50;

        System.out.println(Arrays.toString(numbers));

        for(int number :numbers) {
            System.out.println(number);
        }

        String[] juices = new String[5];
        juices[0] = "Apple";
        juices[1] = "Orange";
        juices[2] = "Grape";
        juices[3] = "Cranberry";
        juices[4] = "Fruit Punch";

        for(String juice : juices) {
            System.out.println(juice);
            System.out.println(juice.length());
        }

        for(String juice : juices) {
            if(juice.equals("Cranberry")) {
                break;

            }

            System.out.println(juice);
        }
    }
}
