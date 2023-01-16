import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int king, queen, look, bishop, night, phone;
        king = sc.nextInt();
        queen = sc.nextInt();
        look = sc.nextInt();
        bishop = sc.nextInt();
        night = sc.nextInt();
        phone = sc.nextInt();

        System.out.print((1-king)+" "+(1-queen)+" "+(2-look)+" "+(2-bishop)+" "+(2-night)+" "+(8-phone));

    }
}