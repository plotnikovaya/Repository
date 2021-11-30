package task1;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        String[] strArray = str.split(" ");
        System.out.println(strArray[findLongestWord(strArray)]);
    }

    public static int findLongestWord(String[] strArray) {
        int maxLong = strArray[0].length();
        int in = 0;

        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i].length() > maxLong) {
                maxLong = strArray[i].length();
                in = i;
            }
        }

        return in;
    }
}