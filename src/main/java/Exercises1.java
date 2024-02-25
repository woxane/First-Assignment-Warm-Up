public class Exercises1 {
    public long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }


    public long fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        } else {
            long a = 1, b = 1, result = 0;
            for (int i = 3; i <= n; i++) {
                result = a + b;
                a = b;
                b = result;
            }
            return result;
        }
    }


    public char[][] generateTriangle(int rows) {
        char[][] triangle = new char[rows][];
        for (int i = 0; i < rows; i++) {
            triangle[i] = new char[i + 1];
            for (int j = 0; j <= i; j++) {
                triangle[i][j] = '*';
            }
        }
        return triangle;
    }


    public static void main(String[] args) {
        Exercises1 exercises = new Exercises1();

        // Test factorial
        System.out.println("Factorial of 5: " + exercises.factorial(5));
        // Test fibonacci
        System.out.println("Fibonacci of 7: " + exercises.fibonacci(7));

        // Test generateTriangle
        char[][] triangle = exercises.generateTriangle(10);
        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                System.out.print(triangle[i][j]);
            }
            System.out.println();
        }

    }

}