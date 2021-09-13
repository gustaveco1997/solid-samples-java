package interface_segregation.exemplo1;

import java.util.ArrayList;
import java.util.List;

public class LoanPayment implements ILoan{
    @Override
    public Object status() {
        return new Object();
    }

    @Override
    public List<Object> getPayments() {
        return new ArrayList<>();
    }

    @Override
    public void initiateLoan() {
        //do something
    }

    @Override
    public void initiateRePayments() {
//do something
    }
}
