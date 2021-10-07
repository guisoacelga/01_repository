package at.campus02.dbp2.repository;

public class Application {

    public static void log(String msg) {
        System.out.println("Application:  --> " + msg);
    }

    public static void main(String[] args) {
        log("application started");

        CustomerRepository repository = new JdbcRepository("jdbc:derby:database;create=true");
        Customer customer = new Customer();
        customer.setEmail("customer1@customers.com");
        customer.setFirstname("Carlo");
        customer.setLastname("Customer");

        // 1) Create
        repository.create(customer);
        log("Customer created: " + customer.toString());

        // 2) Read
        Customer fromRepository = repository.read(customer.getEmail());

        //3) Update
        fromRepository.setFirstname("Conrad");
        repository.update(fromRepository); //to update in DB
        Customer updated = repository.read(fromRepository.getEmail()); //read again from DB to be sure
        log("Customer updated " + updated);

        //4) Delete
        repository.delete(updated);
        Customer deleted = repository.read(updated.getEmail());
        log("Customer deleted: " + deleted);


    }


}
