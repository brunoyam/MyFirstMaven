import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {
            List<Integer> list1 = new ArrayList<>();
            List<Integer> list2 = new LinkedList<>();
            for (int i = 0; i < 100000000; i++) {
                list1.add(1);
                list2.add(1);
            }
            long start = System.currentTimeMillis();
            for (int i = 0; i < 10000; i++) {
                list2.remove(500009);
            }
            long finish = System.currentTimeMillis();
            System.out.println(finish - start);
    }
}