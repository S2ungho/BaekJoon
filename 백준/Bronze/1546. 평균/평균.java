import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double score[] = new double[N];

        for(int i = 0; i < N; i++){
            score[i] = sc.nextDouble();
        }
        double M = score[0];
        for(int j = 1; j < score.length; j++){
            if(M < score[j]){
                M = score[j];
            }
        }
        double sum = 0;
        for(int i = 0; i < score.length; i++){
            sum += score[i] / M * 100;
        }
        double avg = sum / score.length;
        System.out.println(avg);
    }
}