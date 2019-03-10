public class SumProgress implements Runnable {
    @Override
    public void run() {

    }

    public long getValue(long N, long n) {
        long sum = 0;

        for (int i = 1; i <= N; i++){
            sum += i * n;
        }

        return sum;
    }
}
