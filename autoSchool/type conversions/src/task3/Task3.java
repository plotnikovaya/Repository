package task3;

public class Task3 {
    public static void main(String[] args) {
        double n = 55.5001;
        int x = round(n);
        System.out.println("Result is: " + x);
    }

    private static int round(double input){
        String inputString = String.valueOf(input);
        String[] arr = inputString.split("\\.");
        if (Integer.parseInt(arr[1]) >= 50 ){
            return Integer.parseInt(arr[0])+ 1;
        } else return Integer.parseInt(arr[0]);
    }
}