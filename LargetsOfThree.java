    // LargestOfThree.java
    // XS 8/21/25

    //Reference:
    //Chatgpt's flowchart

    // Description of program
    // This program will input three ints from the user.
    // Processing will be finding the largest of the three numbers with nested if statements.
    // Output will be a understable statement of the largest number.
    // Example: you put the value of 55 for num2 and that was the largest of three.

    // the Scanner class
    import java.util.Scanner;

public class LargetsOfThree {
    public static void main(String[] args) {

        System.out.printf("\n\n Welcome to My Largest of Three Program!");

        // variables for this program
        // initialize num1 to 0
        // 0 is assigned to num1
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int largest = 0;

        // Get input from the user.
        Scanner scanner = new Scanner(System.in);
        //prompt the user for the first int.
        System.out.println("\n Please enter a whole number for num1: ");
        num1 = scanner.nextInt();
        // output  the user's input to make sure my program is working.
        // read about concatenation
        System.out.println("\n the user entered" + num1 + "for num1");

        //prompt the user for the second int.
        System.out.println("\n Please enter a whole number for num2: ");
        num2 = scanner.nextInt();
        // output  the user's input to make sure my program is working.
        // read about concatenation
        System.out.println("\n the user entered" + num2 + "for num2");

        //prompt the user for the third int.
        System.out.println("\n Please enter a whole number for num3: ");
        num3 = scanner.nextInt();
        // output  the user's input to make sure my program is working.
        // read about concatenation
        System.out.println("\n the user entered" + num3 + "for num3");

        // processing
        //Use nested if statements to find the largest.
        if (num1 > num2) {
            if (num1 > num3) {
                //this is the true part
                largest = num1;
            } else {
                // this is the false part
                largest = num3;

            }
        } else {
               if (num1 > num3) {
                    //this is the true part
                    largest = num1;
                } else {
                    // this is the false part
                    largest = num3;
                }

        }
        // output meaningful information to the user.
        System.out.println("\n You entered " + num1 + " for the value of num1.\n");
        System.out.println("\n You entered " + num2 + " for the value of num1.\n");
        System.out.println("\n You entered " + num3 + " for the value of num1.\n");

        System.out.println("\n The largest number is" + largest);

    }

}