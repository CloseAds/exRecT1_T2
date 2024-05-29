import java.util.Scanner;

public class DistanciaVector {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        double x1, y1, x2, y2;

        System.out.print("> ");
        x1 = s.nextFloat();

        System.out.print("> ");
        y1 = s.nextFloat();

        System.out.print("> ");
        x2 = s.nextFloat();

        System.out.print("> ");
        y2 = s.nextFloat();

        distancia(x1, y1, x2, y2);

    }

    private static void distancia(double x1, double y1, double x2, double y2){

        double cuadrados = Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2);
        double resultado = Math.sqrt(cuadrados);
        System.out.println("La distancia es: " + resultado);

    }

}
