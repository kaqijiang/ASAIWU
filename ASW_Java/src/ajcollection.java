import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ajcollection {
    public static void main(String[] args) {
        ajcollection ajcoll = new ajcollection();

        //遍历
        ajcoll.extracte();

        //数组转list for
        ajcoll.getInts();

        //int数组 包装后转List
        arrIntToInterList();
    }

    private static void arrIntToInterList() {
        int[] anArray = new int[]{1, 2, 3, 4};
        Integer[] interArray = Arrays.stream(anArray).boxed().toArray(Integer[]::new);
        for (Integer integer : interArray) {
            System.out.println(interArray[integer]);
        }
    }

    private int[] getInts() {
        //数组转List
        int[] anArray = new int[]{1, 2, 3, 4, 5};
        Integer[] interArray = Arrays.stream(anArray).boxed().toArray(Integer[]::new);//
        List<Integer> list = new ArrayList<>();

        for (int i : anArray) {
            list.add(anArray[i]);
        }
        return anArray;
    }

    private void extracte() {
        int[] anArray = new int[]{1, 2, 3, 4, 5};

        for (int i = 0; i < anArray.length; i++) {
            System.out.println(anArray[i]);
        }
        for (int i : anArray) {
            System.out.println(anArray[i]);
        }
    }
}
