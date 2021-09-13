package dependency_inversion.exemplo1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MemoryCustomerDao implements ICustomerDao{
    private final List<Customer> customers = new ArrayList<>();
    @Override
    public List<Customer> findAll() {
        return customers;
    }

    @Override
    public Optional<Customer> findByDocument(String document) {
        return customers.stream()
                .filter(customer -> document.equals(customer.getDocument()))
                .findFirst();
    }
}
