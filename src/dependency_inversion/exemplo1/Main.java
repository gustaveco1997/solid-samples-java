package dependency_inversion.exemplo1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        ICustomerService customerMemoryService = new CustomerService(new MemoryCustomerDao());
        System.out.println(customerMemoryService.findAll());
        System.out.println(customerMemoryService.findByDocument("123.456.789-09"));
        System.out.println(customerMemoryService.findByBirthday(LocalDate.now()));

        ICustomerService customerSqlService = new CustomerService(new MySqlCustormerDao());
        System.out.println(customerSqlService.findAll());
        System.out.println(customerSqlService.findByDocument("123.456.789-09"));
        System.out.println(customerSqlService.findByBirthday(LocalDate.now()));

    }
}
