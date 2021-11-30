package task4;

public class Task4 {
    public static void main(String[] args) {
        int temp1;
        int temp2;
        int a = 0;
        int b = 2;
        int c = 5;
        temp1 = c - a;
        temp2= a + b + c;
        a = a + b;
        System.out.println("a= " + a);
        b = c - a;
        System.out.println("b= " + temp1);
        c = a + b + c;
        System.out.println("c= " + temp2);
    }


}
