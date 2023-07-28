import java.util.Scanner;
public class BuclePart3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese su nombre sin espacios: ");
        String nombre = scanner.nextLine();


        for(int i = 0; i < nombre.length(); i++){
            char c = nombre.charAt(i);
            System.out.println(c);
        }


    }
}
