/*
Given a positive integer, print each prefix of its digits on a separate line. Do not convert the number to a String.
int number = 5831;
5
58
583
5831
*/
public class NumberSeparator {
    /*public static void main(String[] args){
        int number = 5831;
        int[] arr =  new int[4];
        int i=0;
        while(number!=0){
            arr[i] = number;
            number /= 10;
            i++;
        }
        for(int j=arr.length-1;j>=0;j--){
            System.out.println(arr[j]);
        }
    }*/
    public static void main(String[] args) {
        int n = 58321; // n/10 = 5832
        int divisor = 1;
        while (divisor <= n / 10) {
    divisor *= 10;
    System.out.println(divisor);
    }
    for (int d = divisor; d > 0; d /= 10) {
    System.out.print(n / d + " ");
    n %= d;
    }
    }
}

/*
public class Main {

}
*/