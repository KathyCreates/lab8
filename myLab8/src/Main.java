public class Main {
    public static void main(String[] args) {
        System.out.println("Performing 8 laboratory work!");

        int sum = addNumbers(5, 7);
        System.out.println("5 + 7 = " + sum);

        int square = squareNumber(6);
        System.out.println("Square of 6  = " + square);
    }

    public static int addNumbers(int a, int b) {
        return a + b;
    }

    public static int squareNumber(int a) { return a * a; }
}
