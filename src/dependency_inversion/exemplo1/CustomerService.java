package dependency_inversion.exemplo1;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CustomerService implements ICustomerService {
    private final ICustomerDao customerDao;

    public CustomerService(ICustomerDao customerDao){
        this.customerDao=customerDao;
    }

    @Override
    public List<Customer> findAll() {
        return customerDao.findAll();
    }

    @Override
    public Optional<Customer> findByDocument(String document) {
        return customerDao.findByDocument(document);
    }

    @Override
    public List<Customer> findByBirthday(LocalDate birthday) {
        return findAll().stream()
                .filter(customer -> birthday.equals(customer.getBirthday()))
                .collect(Collectors.toList());
    }
}
