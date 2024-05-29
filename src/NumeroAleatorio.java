import java.util.Random;
import java.util.Scanner;

public class NumeroAleatorio {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Random random = new Random();
        boolean encontrado = false;
        int min = Integer.MAX_VALUE;
        int num = 0;

        do {

            num = random.nextInt(41) - 20;
            if (num % 3 == 0){
                System.out.print(num);
                encontrado = true;
            }

        }while (num < 15);

        if (encontrado){
            System.out.println("El número ha sido encontrado");
        }else {
            System.out.println("NINGUNO");
        }

    }

}
