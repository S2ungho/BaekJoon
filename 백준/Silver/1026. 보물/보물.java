import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr1 = new int[N];
        int[] arr2 = new int[N];

        for(int i = 0; i < N; i++){
            arr1[i] = sc.nextInt();
        }
        for(int i = 0; i < N; i++){
            arr2[i] = sc.nextInt();
        }

        Arrays.sort(arr1);
        int max = 0;
        int sum = 0;
        int s = 0;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(max < arr2[j]){
                    max = arr2[j];
                    s = j;
                }
            }
            sum += arr1[i] * arr2[s];
            arr2[s] = 0;
            max = 0;
        }
        System.out.println(sum);
    }
}