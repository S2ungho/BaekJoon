import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int sum = 0;
        int mon = sc.nextInt();

        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = arr.length-1; i > -1; i--){
            if(mon % arr[i] != mon){
                //System.out.print(mon / arr[i] + " ");
                sum += mon / arr[i];
                //System.out.println(mon % arr[i]);
                //System.out.println("전" + mon);
                mon = mon % arr[i];
                //System.out.println("후" + mon);
                //System.out.println(arr[i] + " " +sum);
            }
        }
        System.out.println(sum);
    }
}