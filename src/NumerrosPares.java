public class NumerrosPares {

    public static void main(String[] args) {

        int longitud = 20;

        System.out.println("Primeros diez numeros pares naturales");

        for (int i = longitud; i >= 0; i--) {
            if (i % 2 == 0){
                System.out.println(i);
            }
        }

    }

}
