import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListLinkedListTest {
    final static int ADD_STEP =1;
    final static int ADD_RANDOM = 2;
    final static int REMOVE_STEP = 3;
    final static int REMOVE_RANDOM= 4;
    public static void main(String[] args){
        ArrayList ar = new ArrayList<>(200000);
        LinkedList li = new LinkedList<>();
        print("= 순차적으로 추가하기 = ",ar,li,ADD_STEP);
        print("= 중간에 추가하기 = ",ar,li,ADD_RANDOM);
        print("= 중간에서 삭제하기 = ",ar,li,REMOVE_RANDOM);
        print("= 순차적으로 삭제하기 = ",ar,li,REMOVE_STEP);
    }
    public static void print(String s,ArrayList ar,LinkedList li,int method){
        System.out.println(s);
        System.out.println("ArrayList :"+func(method,ar));
        System.out.println("LinkedList :"+func(method,li));
        System.out.println();
    }
    public static long func(int method,List list){
        long result=0L;
        switch (method) {
            case ADD_STEP:
                long start = System.currentTimeMillis();
                for (int i = 0; i < 10000; i++) {
                    list.add(i+"");
                }
                long end = System.currentTimeMillis();
                result= end-start;
                break;
            case ADD_RANDOM:
                start = System.currentTimeMillis();
                for (int i = 0; i < 10000; i++) {
                    list.add(500,"X");
                }
                end = System.currentTimeMillis();
                result= end-start;
                break;
            case REMOVE_STEP:
                start = System.currentTimeMillis();
                for (int i = list.size()-1; i >=0; i--) {
                    list.remove(i);
                }
                end=System.currentTimeMillis();
                result= end-start;
                break;
            case REMOVE_RANDOM:
                start = System.currentTimeMillis();
                for (int i = 0; i <10000; i++) {
                    list.remove(i);
                }
                end=System.currentTimeMillis();
                result= end-start;
                break;
            default:
                break;
        }
        return result;
    }
}
