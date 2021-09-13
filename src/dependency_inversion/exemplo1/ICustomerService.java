package dependency_inversion.exemplo1;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface ICustomerService {
    List<Customer> findAll();
    Optional<Customer> findByDocument(String document);
    List<Customer> findByBirthday(LocalDate birthday);
}
