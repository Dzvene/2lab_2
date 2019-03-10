

public class Main {
    private static SumProgress sumProgress = new SumProgress();

    public static void main(String[] args) {
        long N = 1_000_000;
        long n = 11;
        sumProgress(N, n);
        sumFormulProgress(N, n);
        sumFormulProgress1(N, n);
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

    public static void sumFormulProgress1(long N, long n){
        new Thread(sumProgress).start();
        long value = sumProgress.getValue(N, n);  // Передаешь параметры и получаешь значения

        System.out.println(value);
    }

}
