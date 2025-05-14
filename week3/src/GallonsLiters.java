public class GallonsLiters {

    public static void main(String[] args) {
        int counter = 0;

        for(int gallons = 1; gallons <= 100; gallons += 4) {
            double liters = gallons * 3.79;

            System.out.printf("%.2f liters is %.1f gallons%n", liters, (double) gallons);

            counter++;
            if(counter % 5 == 0) {

                System.out.println();
            }
        }
    }
}