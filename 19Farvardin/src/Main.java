import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String input = scan.nextLine();
        int spaceCounter = 0;
        for(int i = 0 ; i < input.length(); i++){
            if(input.charAt(i) == ' '){
                spaceCounter++;
            }
        }
        int [] spaceIndexes = new int[spaceCounter];

        for(int i = 0; i < spaceIndexes.length; i++) {
            if (input.charAt(i) == ' ') {
                spaceIndexes[i] = i;
            }
        }

        String [] result = new String[spaceCounter+1];

        int beginIndex = 0;
        for (int i = 0; i < result.length; i++) {
            result[i] = input.substring(beginIndex,spaceIndexes[i]);
            beginIndex = spaceIndexes[i];
        }

        for(int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }
    }
}
