import java.util.ArrayList;
import java.util.List;

public class ArrayListExam {
    public static void main(String[] args) {
        // Q1
        List<Integer> list = new ArrayList<Integer>();
        list.add(42);
        list.add(24);
        list.add(128);
        list.add(127);

        // Q2
        list.set(1, 22);
        // System.out.println(list.get(1));

        // Q3
        // for (int i = 0; i < list.size(); i++) {
        // System.out.println(list.get(i));
        // }

        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) * 2);
        }

        // for (int i = 0; i < list.size(); i++) {
        // System.out.println(list.get(i));
        // }
        int index = 0;
        for (Integer baisuu : list) {
            System.out.println(baisuu);
            list.set(index, baisuu * 2);
            index++;
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        list.forEach(baisuu -> {
            System.out.println(baisuu);
        });
    }
}
