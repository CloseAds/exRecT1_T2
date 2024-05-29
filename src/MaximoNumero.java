import java.util.Scanner;

public class MaximoNumero {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float n1, n2,n3;

        System.out.print("> ");
        n1 = sc.nextFloat();

        System.out.print("> ");
        n2 = sc.nextFloat();

        System.out.print("> ");
        n3 = sc.nextFloat();

        maximo3(n1, n2, n3);

    }

    private static void maximo3 (float n1, float n2, float n3){

        boolean mayor1 = n1 > n2 && n1 > n3;
        boolean mayor2 = n2 > n1 && n2 > n3;
        boolean mayor3 = n3 > n2 && n3 > n1;

        System.out.println("El numero 1 es mas grande: " + mayor1);
        System.out.println("El numero 2 es mas grande: " + mayor2);
        System.out.println("El numero 3 es mas grande: " + mayor3);

    }


}
