import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int sum = 0;
        int x = B % 10;
        System.out.println(A * x);
        sum += A*x;
        x = (B-x) % 100;
        System.out.println(A * x / 10);
        sum += A * x;
        x = (B-x-B % 10) % 1000;
        System.out.println(A * x / 100);
        sum += A * x;
        System.out.println(sum);
    }
}