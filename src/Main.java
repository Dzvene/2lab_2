

public class Main {

    public static void main(String[] args) {
        long N = 1_000_000;
        long n = 11;
        sumProgress(N, n);
        sumFormulProgress(N, n);
    }

    public static void sumProgress(long N, long n){
        long sum = 0;
        for (int i = 1; i<=N; i++){
            sum += i*n;
        }
        System.out.println(sum);
    }

    public static void sumFormulProgress(long N, long n){
        long sum;
        sum = ((n+n*N)*N)/2;
        System.out.println(sum);
    }


}
