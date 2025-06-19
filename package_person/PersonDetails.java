package package_person;

public class PersonDetails {
    // this file will have a main method
    public static void main(String[] args) {

        Person firstPerson;
        Person secondPerson;
// in the process of creating an object from my Person class

        firstPerson = new Person();
        secondPerson = new Person();

        // we will be entering the info, assigning values to our fields

        firstPerson.name= "Solange Knowles";
        firstPerson.gender = 'F';
        firstPerson.age = 32;
        firstPerson.car = "Hyundai";
        firstPerson.carYear = 2020;
        firstPerson.violations = false;
        firstPerson.creditScore = 690;


        secondPerson.name= "Chris Brown";
        secondPerson.gender = 'M';
        secondPerson.age = 25;
        secondPerson.car = "Tesla Model 3";
        secondPerson.carYear = 2023;
        secondPerson.violations = true;
        secondPerson.creditScore = 670;

        double monthlyRate = 0;
        double adjustedRate = 0;


        firstPerson.display();
        System.out.println("Preliminary Rate for " +firstPerson.name+ ": " +firstPerson.getRate(monthlyRate) + " dollars");
        System.out.println("Adjustments: " +firstPerson.assumeGender(adjustedRate));
        System.out.println("Here is " +firstPerson.name+ " 's total monthly premium: ");
        System.out.println(firstPerson.assumeGender(adjustedRate) + firstPerson.getRate(monthlyRate));
        System.out.println();

        secondPerson.display();
        System.out.println("Preliminary Rate for " +secondPerson.name+ ": " +secondPerson.getRate(monthlyRate) + " dollars");
        System.out.println("Adjustments: " +secondPerson.assumeGender(adjustedRate));
        System.out.println("Here is " +secondPerson.name+ " 's total monthly premium: ");
        System.out.println(secondPerson.assumeGender(adjustedRate) + secondPerson.getRate(monthlyRate));

    }
}
