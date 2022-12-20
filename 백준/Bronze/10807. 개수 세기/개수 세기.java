import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] arr = new int[T];
        int cnt = 0;
        for(int i = 0; i < T; i++){
            int x = sc.nextInt();
            arr[i] = x;
        }
        int v = sc.nextInt();
        for(int i = 0; i < T; i++){
            if(arr[i] == v){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}