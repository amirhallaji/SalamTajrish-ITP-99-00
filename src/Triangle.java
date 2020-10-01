import java.util.Scanner;

public class Triangle {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int x1 = input.nextInt();
        int y1 = input.nextInt();
        int x2 = input.nextInt();
        int y2 = input.nextInt();
        int x3 = input.nextInt();
        int y3 = input.nextInt();
        double line12 = Math.sqrt((Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2)));
        double line23 = Math.sqrt((Math.pow(x3 - x2, 2)) + (Math.pow(y3 - y2, 2)));
        double line13 = Math.sqrt((Math.pow(x3 - x1, 2)) + (Math.pow(y3 - y1, 2)));
        if (line12 < line13 + line23 && line13 < line12 + line23 && line23 < line12 + line13){
            if (Math.pow(line12,2) == Math.pow(line13,2) + Math.pow(line23,2) || Math.pow(line13,2) == Math.pow(line12,2) + Math.pow(line23,2) ||Math.pow(line23,2) == Math.pow(line13,2) + Math.pow(line12,2)){
                System.out.println("YES");
            }
            else {
                System.out.println("No");
                double area = (Math.sqrt((line12 + line13 + line23) * (line12 + line13 - line23) * (line12 - line13 + line23) * (-line12 + line13 +line23)))/4;
                System.out.printf("%.3f",area);
            }
        }
        else {
            System.out.println("Impossible");
        }
    }
}
