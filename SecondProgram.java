// Importing required packages
import java.util.Scanner;  // For reading user input
import java.util.ArrayList;  // For using ArrayList

public class LoopAndConditionExample {

    public static void main(String[] args) {
        // Creating a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Creating an ArrayList to store numbers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Asking the user for input
        System.out.println("Enter numbers (type a non-numeric value to finish):");

        // Reading user input until a non-numeric value is entered
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            numbers.add(number);
        }

        // Closing the scanner
        scanner.close();

        // Using a for loop to iterate over the numbers and check if each is even or odd
        System.out.println("Checking even or odd using for loop:");
        for (int i = 0; i < numbers.size(); i++) {
            int number = numbers.get(i);
            if (number % 2 == 0) {
                System.out.println(number + " is even");
            } else {
                System.out.println(number + " is odd");
            }
        }

        // Using a while loop to calculate the sum of the numbers
        System.out.println("Calculating sum using while loop:");
        int sum = 0;
        int index = 0;
        while (index < numbers.size()) {
            sum += numbers.get(index);
            index++;
        }
        System.out.println("Sum of numbers: " + sum);

        // Using a do-while loop to print numbers in reverse order
        System.out.println("Printing numbers in reverse order using do-while loop:");
        int reverseIndex = numbers.size() - 1;
        do {
            if (reverseIndex >= 0) {
                System.out.println(numbers.get(reverseIndex));
                reverseIndex--;
            }
        } while (reverseIndex >= 0);

        // Using a switch statement to categorize the sum
        System.out.println("Categorizing the sum using switch statement:");
        String category;
        switch (sum) {
            case 0:
                category = "Zero";
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                category = "Small";
                break;
            default:
                if (sum > 5 && sum <= 10) {
                    category = "Medium";
                } else if (sum > 10 && sum <= 20) {
                    category = "Large";
                } else {
                    category = "Extra Large";
                }
                break;
        }
        System.out.println("The sum is categorized as: " + category);
    }
}

