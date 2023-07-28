import java.util.Scanner;
public class WhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.print("Ingrese un numero positivo: ");
        num = scanner.nextInt();
        int i = 1;
        while (i <= 10) {
            int res = num * i;
            i++;
            System.out.println(num + "*" + (i-1) + "=" + res);
        }

    }
}
