import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int X = sc.nextInt();
        int[] arr = new int[T];
        for(int i = 0; i < T; i++){
            int x = sc.nextInt();
            arr[i] = x;
        }
        for(int i = 0; i < T; i++){
            if(arr[i] < X){
                System.out.print(arr[i]+" ");
            }
        }
    }
}