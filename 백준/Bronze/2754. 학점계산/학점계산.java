import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine();
        if(N.equals("A+")){
            System.out.println("4.3");
        }
        else if(N.equals("A0")){
            System.out.println("4.0");
        }
        else if(N.equals("A-")){
            System.out.println("3.7");
        }
        else if(N.equals("B+")){
            System.out.println("3.3");
        }
        else if(N.equals("B0")){
            System.out.println("3.0");
        }
        else if(N.equals("B-")){
            System.out.println("2.7");
        }
        else if(N.equals("C+")){
            System.out.println("2.3");
        }
        else if(N.equals("C0")){
            System.out.println("2.0");
        }
        else if(N.equals("C-")){
            System.out.println("1.7");
        }
        else if(N.equals("D+")){
            System.out.println("1.3");
        }
        else if(N.equals("D0")){
            System.out.println("1.0");
        }
        else if(N.equals("D-")){
            System.out.println("0.7");
        }
        else if(N.equals("F")){
            System.out.println("0.0");
        }
        else{
            System.out.println("error");
        }
    }
}
/*
A+: 4.3, A0: 4.0, A-: 3.7

B+: 3.3, B0: 3.0, B-: 2.7

C+: 2.3, C0: 2.0, C-: 1.7

D+: 1.3, D0: 1.0, D-: 0.7

F: 0.0
 */