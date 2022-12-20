import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] arr = new int[T];

        for(int i = 0; i < T; i++){
            int x = sc.nextInt();
            arr[i] = x;
        }
        int min = arr[0], max = arr[0];
        for(int i = 1; i < T; i++){
            if(arr[i] > max){
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min + " " + max);
    }
}