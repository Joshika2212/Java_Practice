public class StackOverFlowDemo {

    static void display() {
        System.out.println("Hello Java");
        display(); // Recursive call without a stopping condition
    }

    public static void main(String[] args) {
        display();
    }
}