/*
A reporting service reuses an accumulator for two branches. The second branch's total must include only its own transactions.
int[] branchA = {100, 200};
        int[] branchB = {50, 50};
        Branch A: 300; Branch B: 100.
*/
class Calculator{
    int total = 0;
    void add(int num){
        total+=num;
    }
    int total(){
        return total;
    }
    void reset(){
        total = 0;
    }
}

public class Accumulator {
    public static void main(String[] args){
        Calculator c = new Calculator();
        int[] branchA = {100, 200};
        int[] branchB = {50, 50};
        for(int i : branchA){
            c.add(i);
        }
        System.out.println("Branch A: "+c.total());
        c.reset();
        for(int i : branchB){
            c.add(i);
        }
        System.out.println("Branch B: "+c.total());
        c.reset();
    }
}
