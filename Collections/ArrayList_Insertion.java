package Collections;
import java.util.List;
import java.util.ArrayList;

public class ArrayList_Insertion {
    public static void main(String[] args){
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("White");
        colors.add("Black");
        System.out.println(colors);
        colors.add(0,"Pink");
        colors.add(5,"Grey");
        System.out.println(colors);
    }
}
