package gr.aueb.cf.ch8;

import java.util.Scanner;

    public class MenuExample {

        public static void main(String[] args) {
            try {
                int choice = getChoice();
                printChoice(choice);
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }

        public static int getChoice() {
            Scanner scanner = new Scanner(System.in);

            // Display menu
            System.out.println("Menu:");
            System.out.println("1. Option 1");
            System.out.println("2. Option 2");
            System.out.println("3. Option 3");
            System.out.println("4. Option 4");
            System.out.println("5. Exit");

            System.out.print("Enter your choice (1-5): ");

            while (true) {
                try {
                    // Check if the next input is an int
                    if (scanner.hasNextInt()) {
                        int choice = scanner.nextInt();

                        // Check if the choice is between 1 and 5
                        if (choice >= 1 && choice <= 5) {
                            return choice;
                        } else {
                            throw new IllegalArgumentException("Invalid choice. Please enter a number between 1 and 5.");
                        }
                    } else {
                        throw new IllegalArgumentException("Invalid input. Please enter a valid integer.");
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                    scanner.nextLine(); // Consume the invalid input
                    System.out.print("Enter your choice (1-5): ");
                }
            }
        }

        public static void printChoice(int choice) {
            System.out.println("You chose: " + choice);
        }
    }


