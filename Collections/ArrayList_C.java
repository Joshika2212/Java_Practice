package Collections;
import java.util.List;
import java.util.ArrayList;

public class ArrayList_C {
    public static void main(String[] args){
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("White");
        colors.add("Black");
        System.out.println(colors);
        for (String item : colors) {
            System.out.println(item);
        }
    }
}
