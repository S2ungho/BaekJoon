import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static int aw(int x){
        int cnt = 0;
        for(int i = 1; i <= x; i++){
            if(i < 100){
                cnt++;
            }
            else if(i < 1000){
                String st = String.valueOf(i);
                int A = st.charAt(0) - st.charAt(1);
                int B = st.charAt(1) - st.charAt(2);
                if(A == B){
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        System.out.println(aw(x));
        br.close();
    }
}
