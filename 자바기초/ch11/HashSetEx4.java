import java.util.HashSet;

public class HashSetEx4 {
    public static void main(String[] args){
        HashSet set = new HashSet<>();
        set.add("abc");
        set.add("abc");
        set.add(new Person2("David", 10));
        set.add(new Person2("David", 10));
        System.out.println(set);
    }
}
