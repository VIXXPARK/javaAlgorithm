
import java.util.*;

public class ArrayListLinkedListTest2 {
    final static int SIZE = 100000;
    public static void main(String[] args){
        ArrayList ar = new ArrayList(SIZE);
        LinkedList li = new LinkedList<>();
        add(ar);
        add(li);
        System.out.println("= 접근시간테스트 =");
        System.out.println("ArrayList :"+access(ar));
        System.out.println("LinkedList :"+access(li));

    }
    public static void add(List list){
        for (int i = 0; i < SIZE; i++) {
            list.add(i+"");
        }
    }
    public static long access(List list){
        long start = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            list.get(i);
        }
        long end = System.currentTimeMillis();
        return end-start;
    }
}
