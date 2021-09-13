package interface_segregation.exemplo1;

public class Main {
    public static void main(String[] args) {
        IBank bank = new BankPayment();
        bank.initiatePayments();
        bank.getPayments();
        bank.status();

        ILoan loan = new LoanPayment();
        loan.initiateLoan();
        loan.initiateRePayments();
        loan.getPayments();
        loan.status();
    }
}
