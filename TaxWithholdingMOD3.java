package taxwitholdingMOD3;

import java.util.Scanner;

public class TaxWithholdingMOD3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your weekly income: ");
        int income = input.nextInt();

        int taxRate; 

        if (income < 500) {
            taxRate = 10;
        } else if (income < 1500) {
            taxRate = 15;
        } else if (income < 2500) {
            taxRate = 20;
        } else {
            taxRate = 30;
        }

        int taxWitholding = (income * taxRate) / 100;

        System.out.println("Weekly Income: $" + income);
        System.out.println("Tax Rate: " + taxRate + "%");
        System.out.println("Tax Witholding: $" + taxWitholding);

        input.close();
    }
}