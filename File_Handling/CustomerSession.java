import java.io.*;
import java.util.UUID;

class Customer implements Serializable {
    private static final long serialVersionUID = 1L;

    int customerId;
    String name;
    transient String securityToken;

    Customer(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
        this.securityToken = generateToken();
    }

    String generateToken() {
        return UUID.randomUUID().toString();
    }

    private void readObject(ObjectInputStream in)
            throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        securityToken = generateToken();
    }
}

public class CustomerSession {
    public static void main(String[] args) throws Exception {
        Customer c1 = new Customer(101, "Ravi");

        ObjectOutputStream out =
            new ObjectOutputStream(new FileOutputStream("customer.dat"));
        out.writeObject(c1);
        out.close();

        System.out.println("Original token: " + c1.securityToken);

        ObjectInputStream in =
            new ObjectInputStream(new FileInputStream("customer.dat"));
        Customer c2 = (Customer) in.readObject();
        in.close();

        System.out.println("Customer ID: " + c2.customerId);
        System.out.println("Name: " + c2.name);
        System.out.println("Fresh token: " + c2.securityToken);
    }
}