public class Test {
    long sum(int[] a) {
        long ans = 0;
        for (int i = 0; i < a.length; i++) {
            ans += a[i];
        }
        return ans;
    }
}
/*    public static void main(String[] args) {
        int[] n = {1, 2, 3, 4, 5, 6};
        System.out.println(sum(n));
    }*/