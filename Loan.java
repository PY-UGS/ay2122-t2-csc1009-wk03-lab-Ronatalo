import java.util.Date;

public class Loan {

    private double monthlyInterestRate;
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private double monthlyPayment;
    private double totalPayment;
    private Date loanDate; 

    public Loan(){
        annualInterestRate = 2.5;
        numberOfYears = 1;
        loanAmount = 1000;
        this.loanDate = new Date();
    }

    public Loan(double annualInterestRate, int numberOfYears, double loanAmount){
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        this.loanDate = new Date();
    }

    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    
    public int getNumberOfYeats(){
        return numberOfYears;
    }

    public double getLoanAmount(){
        return loanAmount;
    }

    public Date getLoanDate(){
        return loanDate;
    }

    public double getMonthlyPayment(){
        monthlyInterestRate = annualInterestRate/12/100;
        monthlyPayment = (loanAmount*monthlyInterestRate)/(1-(1/(Math.pow((1+monthlyInterestRate), (numberOfYears*12)))));
        return monthlyPayment;
    }

    public double getTotalPayment(){
        totalPayment = monthlyPayment * numberOfYears * 12;
        return totalPayment;
    }

    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }

    public void setNumberOfYears(int numberOfYears){
        this.numberOfYears = numberOfYears;
    }

    public void setLoanAmount(double loanAmount){
        this.loanAmount = loanAmount;
    }

}
