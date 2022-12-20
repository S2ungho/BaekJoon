import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = (N % 10) * 10 + (((N - (N % 10)) / 10 + (N % 10)) % 10);;
        int cnt = 1;
        while(N != A){
            A = (A % 10) * 10 + (((A - (A % 10)) / 10 + (A % 10)) % 10);
            cnt++;
        }
        System.out.println(cnt);
    }
}