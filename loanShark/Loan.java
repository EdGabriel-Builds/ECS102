public class Loan {
    // Declare instance variables at the class level
    private double principal;
    private double rate;
    private double time;
    private int number;


    // Multi-parameter constructor
    public Loan(double p, double r, double t, int n) {
        this.principal = p;
        this.rate = r;
        this.time = t;
        this.number = n;
    }

    public double calculateSimpleInterest() {
        return principal + (principal * rate * time);
    }

    public double calculateTotalRepayment() {
        return principal + (principal * (rate / 100) * time);
    }
}