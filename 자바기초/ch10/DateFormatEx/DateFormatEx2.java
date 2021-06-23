package 자바기초.ch10.DateFormatEx;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormatEx2 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(2021, 5, 23);

        Date day = cal.getTime(); // Calendar를 Date로 변환

        SimpleDateFormat[] simple = new SimpleDateFormat[4];
        simple[0] = new SimpleDateFormat("yyyy-MM-dd");
        simple[1] = new SimpleDateFormat("yy-MM-dd E요일");
        simple[2] = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        simple[3] = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");

        System.out.println(simple[0].format(day));
        System.out.println(simple[1].format(day));
        System.out.println(simple[2].format(day));
        System.out.println(simple[3].format(day));
    }
}
