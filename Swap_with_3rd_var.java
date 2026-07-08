public class Swap_with_3rd_var {
    public static void main(String[] args) {
        int a = 12;
        int b = 5;

        System.out.println("Before Swapping");
        System.out.printf("The value of a is %d\n",a);
        System.out.printf("The value of b is %d\n",b);

        // swap
        int temp = b;
        b = a;
        a = temp;

        System.out.println("After Swapping");
        System.out.printf("The value of a is %d\n",a);
        System.out.printf("The value of b is %d\n",b);
    }
}
