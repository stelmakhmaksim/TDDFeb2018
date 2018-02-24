package home_tasks.fibonacci;

public class Fibonacci {

    public int fibRecursive(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        if (n < 2) {
            return n;
        }
        return fibRecursive(n - 1) + fibRecursive(n - 2);
    }

    public int fib(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        if (n < 2) {
            return n;
        }
        int a, b, i;
        int sum = 0;
        for (a = 0, b = i = 1; i < n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return sum;
    }
}
