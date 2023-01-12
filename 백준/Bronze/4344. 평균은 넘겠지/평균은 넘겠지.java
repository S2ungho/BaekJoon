import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 0; i < N; i++){
            int S = sc.nextInt();
            int[] arr = new int[S];
            double cnt = 0;
            int avg = 0, sum = 0;
            for(int j = 0; j < S; j++){
                arr[j] = sc.nextInt();
                sum += arr[j];
            }
            avg = sum / S;
            for(int k = 0; k < S; k++){
                if (arr[k] > avg){
                    cnt++;
                }
            }
            System.out.printf("%.3f%%\n", 100.0 * cnt / S);
        }
    }
}