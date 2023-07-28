public class Fibonacci {
    public static void main(String[] args) {
        int i = 0, a = 0, b = 1;

        do {
            System.out.print(i + " ");
            System.out.println(a );
            int sum = a + b;
            a = b;
            b = sum;
            i++;
        }while (i <= 10);
    }
}
