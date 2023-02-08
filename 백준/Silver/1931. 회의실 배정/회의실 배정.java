import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][] arr = new int[N][2];

        for(int i = 0; i < N; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        //다시보기
        Arrays.sort(arr, new Comparator<int[]>() {

            @Override
            public int compare(int[] o1, int[] o2) {

                // 종료시간이 같을 경우 시작시간이 빠른순으로 정렬해야한다.
                if(o1[1] == o2[1]) {
                    return o1[0] - o2[0];
                }

                return o1[1] - o2[1];
            }

        });

        int cnt = 0;
        int pre_time = 0;

        for(int i = 0; i < N; i++){
            if(pre_time <= arr[i][0]){
                pre_time = arr[i][1];
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}