package 자바기초.ch9.RegexEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx1 {
    public static void main(String[] args) {
        String[] data = { "bat", "baby", "bonus", "cA", "ca", "co", "c.", "c0", "car", "combat", "count", "date",
                "disc" };
        Pattern P = Pattern.compile("c[a-z]*");
        for (int i = 0; i < data.length; i++) {
            Matcher m = P.matcher(data[i]);
            if (m.matches())
                System.out.print(data[i] + ", ");
        }
    }
}
