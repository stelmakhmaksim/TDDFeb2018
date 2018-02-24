package home_tasks.factorial;

public class Factorial {

    public int factRecursive(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        if (n < 2) {
            return 1;
        }
        return n * factRecursive(n - 1);
    }

    public int fact(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        if (n < 2) {
            return 1;
        }
        int mult = 0;
        for (int a = 1, b = 2; b <= n; b++) {
            mult = a * b;
            a = mult;
        }
        return mult;
    }
}
