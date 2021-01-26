import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Integer [] array = new Integer[]{10,22,12,13,44,15};
        Integer[] swappedArray = mySwaping(array);
        System.out.println(swappedArray);
        for (int i = 0; i < swappedArray.length; i++) {
            System.out.println(swappedArray[i]);

        }
    }
    public static Integer[] mySwaping(Integer[] array){
        //0-1-2-3-4-5 индекси
        Integer[] result = new Integer[array.length];
        for (int i = 0; i < array.length; i++) {
            if (i%2==0){
                result[i] = array[i+1];// присвоить значение следущего елемента
            }else {
                result[i] = array[i-1];// присвоить предедущего елемента
            }
        }

        return result;
    }
    public static Integer[] mySwappingTwo(Integer[] araay){
        for (int i = 0; i < araay.length; i++) {

        }
        if (i%2==0) {
        }

    return null;
    }
}
