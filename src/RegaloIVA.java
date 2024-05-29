import java.util.Scanner;

public class RegaloIVA {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Precio del regalo: ");
        double precio = sc.nextDouble();

        if (precio < 0) {
            System.out.println("El precio no puede ser negativo");
        }else {
            System.out.print("Introduce el IVA: ");
            double iva = sc.nextDouble();
            if (iva > 100 || iva < 0){
                System.out.println("Iva introducido no válido");
            }else {
                System.out.println("Una vez sumado el IVA el precio final es de: " + precioIVA(precio, iva) + "€");

                System.out.print("Número de amigos que van a participar en el regalo: ");
                int amigos = sc.nextInt();

                System.out.println("Cada amigo tiene que aportar: " + precioTotalAmigos(precioIVA(precio, iva), amigos) + "€");
            }

        }
    }

    private static double precioIVA (double precio, double iva){

        double resultado = precio + (iva / 100 * precio);
        return resultado;
    }

    private static double precioTotalAmigos (double precioIVA, int amigos){
        return precioIVA / amigos;
    }

}
