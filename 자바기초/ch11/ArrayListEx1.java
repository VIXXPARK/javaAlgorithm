import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx1 {
    public static void main(String[] args){
        ArrayList list1 = new ArrayList<>(10);
        list1.add(5);
        list1.add(4);
        list1.add(2);
        list1.add(0);
        list1.add(1);
        list1.add(3);

        ArrayList list2 = new ArrayList<>(list1.subList(1, 4));
        System.out.println(list1);
        System.out.println(list2);
        System.out.println();

        Collections.sort(list1);
        Collections.sort(list2);
        System.out.println(list1);
        System.out.println(list2);
        System.out.println();

        System.out.println("list1.containsAll(list2):"+list1.containsAll(list2));
        list2.add("B");
        list2.add("C");
        list2.add(3,"A");
        list2.set(3, "AA");
        System.out.println(list1);
        System.out.println(list2);
        System.out.println();

        System.out.println("list1.retainAll(list2):"+list1.retainAll(list2));
        System.out.println(list1);
        System.out.println(list2);
        System.out.println();

        for (int i = list2.size()-1; i >=0; i--) {
            if(list1.contains(list2.get(i))){
                list2.remove(i);
            }
        }
        System.out.println(list1);
        System.out.println(list2);
        System.out.println();
    }
}
