import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyClass implements MyInterface{

    @Override
    public void name() {

    }
    @Override
    public void sayHello() {

        // 数组遍历
        extracte();
        // int数组转list
        int[] anArray = getInts();


        List<int[]> list2 = Arrays.asList(anArray);
    }

    private int[] getInts() {
        //数组转List
        int[] anArray = new int[]{1,2,3,4,5};
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
