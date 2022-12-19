import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        int cook = sc.nextInt();

        if((M + cook) > 59){
            int c = (M + cook) / 60;
            M = (M + cook) % 60;
            H += c;
            if(H > 23){
                H = H % 24;
            }
        }else{
            M += cook;
        }

        System.out.println(H+" "+M);

    }
}