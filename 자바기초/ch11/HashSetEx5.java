import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx5 {
    public static void main(String[] args){
        HashSet A = new HashSet<>();
        HashSet B = new HashSet<>();
        HashSet AorB = new HashSet<>();
        HashSet AandB = new HashSet<>();
        HashSet AminusB = new HashSet<>();
        A.add("1");A.add("2");A.add("3");A.add("4");A.add("5");
        System.out.println("A = "+A);
        B.add("4");B.add("5");B.add("6");B.add("7");B.add("8");
        System.out.println("B = "+B);
        Iterator it = B.iterator();
        while (it.hasNext()) {
            Object tmp = it.next();
            if(A.contains(tmp)){
                AandB.add(tmp);
            }
        }
        it = A.iterator();
        while (it.hasNext()) {
            Object tmp = it.next();
            if(!B.contains(tmp)){
                AminusB.add(tmp);
            }
        }
        it = A.iterator();
        while (it.hasNext()) {
            AorB.add(it.next());
        }
        it = B.iterator();
        while (it.hasNext()) {
            AorB.add(it.next());
        }

        System.out.println("A ∩ B = "+AandB);
        System.out.println("A ∪ B = "+AorB);
        System.out.println("A - B = "+AminusB);
    }
}
