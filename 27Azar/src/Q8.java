import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int buildingCount = scan.nextInt();
        int withinSun = 1;
        int firstHeight = scan.nextInt();
        for (int i = 0; i < buildingCount-1; i++) {
            int otherHeights = scan.nextInt();
            if(otherHeights > firstHeight){
                withinSun++;
                firstHeight = otherHeights;
            }
        }
        System.out.println(withinSun);
    }
}
