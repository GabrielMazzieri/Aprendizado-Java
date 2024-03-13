package pacote;
import java.util.Scanner;

public class Condicao2 {
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
        
        if (media >= 6) {
            System.out.println("Aluno Aprovado");
        }
        else{
            System.out.println("Aluno Reprovado");
        }
    }
}
