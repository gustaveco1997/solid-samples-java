package dependency_inversion.exemplo1;

import java.util.List;
import java.util.Optional;

public class MySqlCustormerDao implements ICustomerDao{
    @Override
    public List<Customer> findAll() {
        String sql = "SELEC * FROM Customer";
        //need return result
        return null;
    }

    @Override
    public Optional<Customer> findByDocument(String document) {
        String sql = String.format("SELEC * FROM Customer where document like '%s'", document);
        //need return result
        return Optional.empty();
    }
}
