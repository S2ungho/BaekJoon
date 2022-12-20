import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];

        for(int i = 0; i < arr.length; i++){
            int x = sc.nextInt();
            arr[i] = x;
        }
        int m = 0, max = 0;
        for(int j = 0; j < arr.length; j++) {
            if (arr[j] > max) {
                max = arr[j];
                m = j+1;
            }
        }
        System.out.println(max);
        System.out.print(m);
    }
}