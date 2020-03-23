package Lesson7;

public class TestDate {
    public static void main(String[] args) {
        Date d1 = new Date(2020, 3, 21);
        System.out.println(d1);

        d1.setYear(2001);
        d1.setMonth(9);
        d1.setDay(9);
        System.out.println(d1);
        System.out.println("Year is: " + d1.getYear());
        System.out.println("Month is: " + d1.getMonth());
        System.out.println("Day is: " + d1.getDay());

        d1.setDate(2988, 2, 1);
        System.out.println(d1);
    }
}
