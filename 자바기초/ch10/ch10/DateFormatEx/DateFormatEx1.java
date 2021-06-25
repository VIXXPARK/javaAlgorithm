package ch10.DateFormatEx;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatEx1 {
    public static void main(String[] args) {
        Date today = new Date();

        SimpleDateFormat[] simple = new SimpleDateFormat[9];
        simple[0] = new SimpleDateFormat("yyyy-MM-dd");
        simple[1] = new SimpleDateFormat("''yy년 MMM dd일 E요일");
        simple[2] = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        simple[3] = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");

        simple[4] = new SimpleDateFormat("오늘은 올 해의 D번째 날입니다.");
        simple[5] = new SimpleDateFormat("오늘은 이 달의 d번째 날입니다.");
        simple[6] = new SimpleDateFormat("오늘은 올 해의 w번째 주입니다.");
        simple[7] = new SimpleDateFormat("오늘은 이 달의 W번째 주입니다.");
        simple[8] = new SimpleDateFormat("오늘은 이 달의 F번째 E요일입니다.");

        System.out.println(simple[0].format(today));
        System.out.println(simple[1].format(today));
        System.out.println(simple[2].format(today));
        System.out.println(simple[3].format(today));
        System.out.println();
        System.out.println(simple[4].format(today));
        System.out.println(simple[5].format(today));
        System.out.println(simple[6].format(today));
        System.out.println(simple[7].format(today));
        System.out.println(simple[8].format(today));

    }
}
