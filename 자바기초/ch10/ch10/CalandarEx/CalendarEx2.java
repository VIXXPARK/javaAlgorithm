package ch10.CalandarEx;

import java.util.Calendar;

public class CalendarEx2 {
    public static void main(String[] args) {
        final String[] DAY_OF_WEEK = { "", "일", "월", "화", "수", "목", "금", "토" };

        Calendar date1 = Calendar.getInstance();
        Calendar date2 = Calendar.getInstance();

        date1.set(2021, 5, 23);
        date2.set(2021, 8, 1);
        System.out.println("date1은 " + toString(date1) + DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)] + "요일이고,");
        System.out.println("(2학기)date2은 " + toString(date2) + DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)] + "요일입니다.");
        long difference = (date2.getTimeInMillis() - date1.getTimeInMillis()) / 1000;
        System.out.println("date1로부터 date2까지" + difference + "초가 남았습니다.");
        System.out.println("일(day)로 계산하면 " + difference / (24 * 60 * 60) + "일 입니다.");
    }

    public static String toString(Calendar date) {
        return date.get(Calendar.YEAR) + "년" + (date.get(Calendar.MONTH) + 1) + "월" + date.get(Calendar.DATE) + "일 ";
    }
}
