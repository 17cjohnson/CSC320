package gradingsystem;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double total = 0;
        double max = 0;
        double min = 0;
        double grade;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter grade #" + i + ": ");
            grade = input.nextDouble();

            if (i == 1) {
                max = grade;
                min = grade;
            } else {
                if (grade > max) {
                    max = grade;
                }
                if (grade < min) {
                    min = grade;
                }
            }

            total = total + grade;
        }

        double average = total / 10;

        System.out.println("Average: " + average);
        System.out.println("Highest: " + max);
        System.out.println("Lowest: " + min);

        input.close();
    }
}

