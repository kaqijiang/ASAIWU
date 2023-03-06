import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        List<String> list = new ArrayList<>();

        list.add("2");
        list.add("2");
        list.add("2");
        list.add("2");
        for (String item : list) {
            System.out.println(item);
        }


    }



}