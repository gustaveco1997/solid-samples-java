package interface_segregation.exemplo1;

import java.util.List;

public interface IPayment {
    Object status();
    List<Object> getPayments();
}
