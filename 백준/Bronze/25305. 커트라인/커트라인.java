import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int k = sc.nextInt();
        int x[] = new int[N];

        for (int i = 0; i < N; i++){
            x[i] = sc.nextInt();
        }
        int tmp,max = 0;
        for(int i = 0; i < x.length; i++){
            for(int j = i; j < x.length; j++){
                if(x[i] < x[j]){
                    tmp = x[j];
                    x[j] = x[i];
                    x[i] = tmp;
                }
            }
        }
        //for(int i = 0; i < N; i++){
        System.out.println(x[k-1]); //k-1
        //}
    }
}