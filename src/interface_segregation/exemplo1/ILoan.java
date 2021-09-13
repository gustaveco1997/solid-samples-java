package interface_segregation.exemplo1;

public interface ILoan extends IPayment {
    void initiateLoan();
    void initiateRePayments();

}
