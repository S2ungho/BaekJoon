import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int tmp, sum = 0;
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        for(int i = 0; i < arr.length; i++){
            for(int j = 1; j < arr.length; j++){
                if(arr[j-1] > arr[j]){
                    tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                }
            }
        }
        int avg = sum / arr.length;
        int median = arr[arr.length/2];
        System.out.println(avg);
        System.out.println(median);
    }
}