import java.util.Scanner;

public class Nochevieja {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int NOCHEVIEJA = 365;

        System.out.print("> ");
        int contador = s.nextInt();

        do {

            System.out.print("Introduce el dia: ");
            int dia = s.nextInt();

            System.out.print("Introduce el mes: ");
            int mes = s.nextInt();

            comprobarDiasMeses(dia, mes);



            int diasRestantes = NOCHEVIEJA - (contadoDias(mes, dia)) ;
            System.out.printf("Dias restantes para noche vieja: " + diasRestantes + "\n");

            contador--;

        }while(contador > 0);

    }
    private static void comprobarDiasMeses (int dia, int mes){
        int mesDias = 0;
        switch (mes){
            case 1:
                mesDias = 31;
                if (dia > mesDias){
                    System.out.println("Dia no válido");
                }
                break;
            case 2:
                mesDias = 28;
                if (dia > mesDias){
                    System.out.println("Dia no válido");
                }
                break;
            case 3:
                mesDias = 31;
                if (dia > mesDias){
                    System.out.println("Dia no válido");
                }
                break;
            case 4:
                mesDias = 30;
                if (dia > mesDias){
                    System.out.println("Dia no válido");
                }
                break;
            case 5:
                mesDias = 31;
                if (dia > mesDias){
                    System.out.println("Dia no válido");
                }
                break;
            case 6:
                mesDias = 30;
                if (dia > mesDias){
                    System.out.println("Dia no válido");
                }
                break;
            case 7:
                mesDias = 31;
                if (dia > mesDias){
                    System.out.println("Dia no válido");
                }
                break;
            case 8:
                mesDias = 31;
                if (dia > mesDias){
                    System.out.println("Dia no válido");
                }
                break;
            case 9:
                mesDias = 30;
                if (dia > mesDias){
                    System.out.println("Dia no válido");
                }
                break;
            case 10:
                mesDias = 31;
                if (dia > mesDias){
                    System.out.println("Dia no válido");
                }
                break;
            case 11:
                mesDias = 30;
                if (dia > mesDias){
                    System.out.println("Dia no válido");
                }
                break;
            case 12:
                mesDias = 31;
                if (dia > mesDias){
                    System.out.println("Dia no válido");
                }
                break;
            default:
                System.out.println("Mes introducido no válido");
        }


    }

    private static int contadoDias(int mes, int dia){
        int contadoDias = 0;

        if (mes == 12){
            contadoDias = 31 - dia;
        }
        if (mes == 11){
            contadoDias = 59 - dia;
        }
        if (mes == 10){
            contadoDias = 90 - dia;
        }
        if (mes == 9){
            contadoDias = 120 - dia;
        }
        if (mes == 8){
            contadoDias = 151 - dia;
        }
        if (mes == 7){
            contadoDias = 181 - dia;
        }
        if (mes == 6){
            contadoDias = 212 - dia;
        }
        if (mes == 5){
            contadoDias = 243 - dia;
        }
        if (mes == 4){
            contadoDias = 273 - dia;
        }
        if (mes == 3){
            contadoDias =  304 - dia;
        }
        if (mes == 2){
            contadoDias = 334 - dia;
        }
        if (mes == 12 && dia == 31){
            contadoDias = 0;
        }
        return contadoDias;
    }

}
