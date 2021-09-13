package interface_segregation.exemplo1;

import java.util.ArrayList;
import java.util.List;

public class BankPayment implements IBank{
    @Override
    public Object status() {
        return new Object();
    }

    @Override
    public List<Object> getPayments() {
        return new ArrayList<>();
    }

    @Override
    public void initiatePayments() {
        //do something
    }
}
