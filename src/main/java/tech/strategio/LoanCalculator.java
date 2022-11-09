package tech.strategio;

import java.util.Scanner;

public class LoanCalculator {

    /**
     * Get the remaining money to pay after 3 months from the starting amount
     * 
     * @param amount the total amount of money due
     * @return the amount of money due to pay after 3 months
     */
    static int getRemainingAmountIn3Months(int amount) {
        int remainingAmount = amount;

        for (int i = 0; i < 3; i++) {
            remainingAmount = removeTenPercent(remainingAmount);
        }

        return remainingAmount;
    }

    public static int removeTenPercent(double amount) {
        int duePayment = (int)(amount * 10 / 100);
        int remainingPayment = (int)(amount - duePayment);

        return remainingPayment;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int amount = scanner.nextInt();
            System.out.println(getRemainingAmountIn3Months(amount));
        }
    }
}
