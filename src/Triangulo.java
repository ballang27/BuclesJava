
public class Triangulo {
    public static void main(String[] args) {

        int n = 5;
        for (int i = 0; i <= n; i++) {
            for (int j = 0 ; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        System.out.println("__________________________________________________");
        for (int i = 0; i < n; i++) {  //fila
            for (int j = n-1-i ; j >=0; j--) {  //columna
                System.out.print("* ");
            }
            System.out.println(" ");
        }


    }//main(args)
}//class

