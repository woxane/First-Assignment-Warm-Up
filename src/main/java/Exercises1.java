public class Exercises1 {
    public long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }


    /*
    implement a function that return nth number of fibonacci series
    the series -> 1, 1, 2, 3, 5, 8, ...
    */
    public long fibonacci(int n) {
        // TODO
        return 0;
    }


    /*
    implement a function that returns a triangle for example:
    row = 5

    *
    **
    ***
    ****
    *****

     */
    public char[][] generateTriangle(int rows) {
        // TODO
        return null;
    }


    public static void main(String[] args) {
        Exercises1 exercises = new Exercises1();

        // Test factorial
        System.out.println("Factorial of 5: " + exercises.factorial(5));

    }

}