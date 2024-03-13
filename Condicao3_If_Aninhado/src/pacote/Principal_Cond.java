package pacote;
import java.util.Scanner;

public class Principal_Cond {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        /*Valor da primeira nota*/
        System.out.print("Informe a primeira nota: ");
        double nota1 = ler.nextDouble();
        /*Valor da segunda nota*/
        System.out.print("Informe a segunda nota: ");
        double nota2 = ler.nextDouble();
       /*Valor da terceira nota*/
       System.out.print("Informe a terceira nota: ");
        double nota3 = ler.nextDouble();
      
        /*Calculo da média*/
        double media = (nota1 + nota2 + nota3)/2;  
        /*Resultado da média*/
        System.out.println("A média é: " + media);
    
       /*Avaliação da Nota*/
        if(media < 0){
            System.out.println("A média não pode menor que zero");  
                }
        else if (media <2 ) {
            System.out.println("Péssimo");
        }
        else if (media <4){
            System.out.println("Ruim");
        }
        else if (media <6){
            System.out.println("Regular");
        }
        else if (media <8){
            System.out.println("Bom");
        }
        else if (media < 9.5){
            System.out.println("Ótimo");
        }
           
        else if (media < 10){
            System.out.println("Exelente");
        }
        else{
            System.out.println("A média não pode passar de 10");
        }
    }
}
