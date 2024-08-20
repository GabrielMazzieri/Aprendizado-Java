package calculomedia;

import java.util.Scanner;

public class Prcnipal_Media {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe a 1ª nota: ");
        double n1 = entrada.nextDouble();
        System.out.print("Informe a 2ª nota: ");
        double n2 = entrada.nextDouble();
        
        double calc = (n1 + n2)/2;
        
        System.out.println("A média é: " + calc);
        
        if (calc < 2){
            System.out.println("Pessimo");
            }
        else if(calc <= 4) {
            System.out.println("Ruim");
        }
        else if(calc <= 6) {
            System.out.println("Regular");
        }
        else if(calc <= 8) {
            System.out.println("Bom");
        }
        else if(calc <= 9.6) {
            System.out.println("Otimo");
        }
        else if(calc <= 10) {
            System.out.println("Exelente");
        }
        
        }
    }

