package Lesson7;

public class TestTime2 {
    public static void main(String[] args) {
        Time2 t1 = new Time2(1, 2, 3);
        System.out.println(t1);

        Time2 t2 = new Time2(60,59, 12);

        try {
            Time2 t3 = new Time2(60, 59, 12);
            System.out.println("This line will be skipped, if exception occurs");
        }catch (IllegalArgumentException ex){
            ex.printStackTrace();
        }
        System.out.println("Contimue affter exception!");
    }
}
