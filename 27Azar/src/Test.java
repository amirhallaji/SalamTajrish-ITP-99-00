import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Date date = new Date();
        date = java.util.Calendar.getInstance().getTime();
        System.out.println(date);
    }
}
