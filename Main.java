import java.util.Scanner;

public class Main {
    public static void main(String args[]){

        Loan loan1 = new Loan();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter annual interest rate:");
        loan1.setAnnualInterestRate(input.nextDouble());

        System.out.println("Enter number of years as an integer:");
        loan1.setNumberOfYears(input.nextInt());

        System.out.println("Enter loan amount:");
        loan1.setLoanAmount(input.nextDouble());

        input.close();
        
        System.out.println("The loan was created on " + loan1.getLoanDate());
        System.out.printf("The monthly payment is %.2f\n", loan1.getMonthlyPayment());
        System.out.printf("The total payment is %.2f\n", loan1.getTotalPayment());
    }
}
