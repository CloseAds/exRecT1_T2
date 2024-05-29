import javax.swing.*;
import java.util.Scanner;

public class Tablero {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        char ASTERISCO = '*';
        char PUNTO = '.';

        System.out.print("> ");
        int n = s.nextInt();

        if (n <= 0 || n % 2 == 1){
            System.out.printf("ERROR");
        }else {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (j % 2 == 0){
                        System.out.print(ASTERISCO);
                    }else{
                        System.out.print(PUNTO);
                    }
                }
                System.out.printf("\n");
            }
        }
    }

}
