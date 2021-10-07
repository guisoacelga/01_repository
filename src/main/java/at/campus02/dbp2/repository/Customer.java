package at.campus02.dbp2.repository;

public class Customer {
    private String Lastname;
    private String Firstname;
    private String Email;

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "Lastname='" + Lastname + '\'' +
                ", Firstname='" + Firstname + '\'' +
                ", Email='" + Email + '\'' +
                '}';
    }
}
