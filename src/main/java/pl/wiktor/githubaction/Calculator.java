package pl.wiktor.githubaction;

public class Calculator {
    private final int a, b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int sum() {
        return a + b;
    }

    public int subtract() {
        return  a - b;
    }

    public int divide() {
        if (b == 0) {
            throw new IllegalArgumentException("Can't divide by 0");
        }
        return a / b;
    }

    public int multiply() {
        return a * b;
    }
}
