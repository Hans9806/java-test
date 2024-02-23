package test.test8;

public class MathUtility {
    private MathUtility (){}

    public static int max(int a, int b) {
        if(a >b) {
            return a;
        }else {
            return b;
        }
    }

    public static int min(int a, int b) {
        return a < b ? b : a;
    }
    public static int sum(int a, int b) {
        return a + b;
    }
    public static int factorial(int n) {
        int result = 1;
        for (int i = n; i >= 1; i--) {
            result *= i;
        }
        return result;
    }
}
