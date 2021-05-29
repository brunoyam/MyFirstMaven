import org.apache.commons.lang3.ArrayUtils;

import java.util.*;

public class Main {


    public int[] reverse(int[] in){
        ArrayUtils.reverse(in);
        return in;
    }


    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 100; i++) {
            set.add(1);
        }
        System.out.println(set.size());
     }




}
