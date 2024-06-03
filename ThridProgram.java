// Importing required packages
import java.util.Scanner;  // For reading user input
import java.util.ArrayList;  // For using ArrayList

class Student {
    String name;
    int score;

    Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

public class StudentManagementSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        int choice;

        do {
            // Display the menu
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Find Average Score");
            System.out.println("4. Find Highest and Lowest Scores");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline

            switch (choice) {
                case 1:
                    // Add a student
                    System.out.print("Enter student's name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter student's score: ");
                    int score = scanner.nextInt();
                    students.add(new Student(name, score));
                    System.out.println("Student added successfully.\n");
                    break;
                case 2:
                    // Display all students
                    if (students.isEmpty()) {
                        System.out.println("No students to display.\n");
                    } else {
                        System.out.println("List of Students:");
                        for (Student student : students) {
                            System.out.println("Name: " + student.name + ", Score: " + student.score);
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    // Find average score
                    if (students.isEmpty()) {
                        System.out.println("No students to calculate the average score.\n");
                    } else {
                        int totalScore = 0;
                        for (Student student : students) {
                            totalScore += student.score;
                        }
                        double averageScore = (double) totalScore / students.size();
                        System.out.println("Average Score: " + averageScore + "\n");
                    }
                    break;
                case 4:
                    // Find highest and lowest scores
                    if (students.isEmpty()) {
                        System.out.println("No students to find scores.\n");
                    } else {
                        int highestScore = Integer.MIN_VALUE;
                        int lowestScore = Integer.MAX_VALUE;
                        for (Student student : students) {
                            if (student.score > highestScore) {
                                highestScore = student.score;
                            }
                            if (student.score < lowestScore) {
                                lowestScore = student.score;
                            }
                        }
                        System.out.println("Highest Score: " + highestScore);
                        System.out.println("Lowest Score: " + lowestScore + "\n");
                    }
                    break;
                case 5:
                    // Exit the program
                    System.out.println("Exiting the program.");
                    break;
                default:
                    // Invalid choice
                    System.out.println("Invalid choice. Please try again.\n");
            }
        } while (choice != 5);

        // Closing the scanner
        scanner.close();
    }
}

