import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String S = in.nextLine();
        //in.close();

        //st에 공백을 기준으로 나눈 토큰들을 st에 저장
        StringTokenizer st = new StringTokenizer(S," ");

        //countTokens()는 토큰의 개수를 반환
        System.out.println(st.countTokens());

    }

}