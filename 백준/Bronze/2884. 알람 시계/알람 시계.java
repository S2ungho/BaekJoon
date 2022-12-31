import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();

        M -= 45;
        if(M < 0){
            M = 60 + M;
            H -= 1;
            if(H < 0){
                H = 24 + H;
            }
        }

        System.out.print(H+" "+M);

    }
}