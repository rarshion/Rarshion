package ThinkingInJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by rarshion on 16/9/3.
 */
public class ListMaker<T> {

    List<T> create() {
        return new ArrayList<>();
    }

    public static void main(String[] args){
        int[] a = new int[27];
        Arrays.fill(a, -1);
    }

}
