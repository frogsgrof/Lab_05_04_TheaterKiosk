public class Main {
    public static void main(String[] args) {

        // Directions:
        /*
        As people pass through an entry kiosk at the theater, they are prompted to enter their age.
        If they are 21 or older, they get a paper wristband.  Code a logic program that asks the user to
        enter their age and then if they are 21 or over displays a message that they get a wristband.
        (Note that the program does nothing if they are not 21 or over…)

        Test runs:   (insert the output widow copies here for the 2 test runs)
         */

        // Pseudocode:
        /*
        num DRINKING_AGE = 21
        num age

        output "Enter your age:"
        input age

        if age >= DRINKING_AGE then
            output "Here's your wristband, have fun! :)"
        endIf
         */

        // Real code starts here

        int DRINKING_AGE = 21; // constant for drinking age
        int age; // stores user input

        System.out.println("Enter your age:");

        // beginning of test run code
        System.out.println("[Imagine the user inputs an age]");
        age = 50000000; // this is the pretend "input"
        System.out.println("You entered: " + age);
        // end test run code

        if (age >= DRINKING_AGE) { // if age is bigger than 21, print the message
            System.out.println("Here's your wristband, have fun! :)");
        }

    }
}