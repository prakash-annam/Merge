// Importing required packages
import java.util.Scanner;  // For reading user input
import java.util.ArrayList;  // For using ArrayList
import java.util.Collections;  // For sorting the ArrayList
import java.time.LocalDate;  // For handling dates
import java.time.format.DateTimeFormatter;  // For formatting dates

public class ExampleProgram {

    public static void main(String[] args) {
        // Creating a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Creating an ArrayList to store user inputs
        ArrayList<String> inputs = new ArrayList<>();

        // Asking the user for input
        System.out.println("Enter some strings (type 'exit' to finish):");

        // Reading user input until 'exit' is typed
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            inputs.add(input);
        }

        // Closing the scanner
        scanner.close();

        // Sorting the ArrayList
        Collections.sort(inputs);

        // Printing the sorted inputs
        System.out.println("Sorted inputs:");
        for (String input : inputs) {
            System.out.println(input);
        }

        // Getting the current date
        LocalDate currentDate = LocalDate.now();

        // Formatting the date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = currentDate.format(formatter);

        // Printing the formatted date
        System.out.println("Current date: " + formattedDate);
    }
}

