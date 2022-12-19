import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int king = sc.nextInt();
        int queen = sc.nextInt();
        int look = sc.nextInt();
        int bishop = sc.nextInt();
        int night = sc.nextInt();
        int phone = sc.nextInt();

        System.out.println((1-king)+" "+(1-queen)+" "+(2-look)+" "+(2-bishop)+" "+(2-night)+" "+(8-phone));

    }
}