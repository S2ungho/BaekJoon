import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[3];
        for (int i = 0; i < 3; i++){
            arr[i] = sc.nextInt();
        }
        int tmp;
        for(int a = 0; a < 3; a++){
            for(int i = 1; i < 3; i++){
                if(arr[i-1] > arr[i]) {
                    tmp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = tmp;
                }
            }
        }
            System.out.println(arr[1]);
    }
}