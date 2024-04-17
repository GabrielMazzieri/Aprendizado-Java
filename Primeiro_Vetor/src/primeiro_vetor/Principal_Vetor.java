package primeiro_vetor;
import java.util.Scanner;

public class Principal_Vetor {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o tamanho do vetor: ");
        int tam = ler.nextInt();
        int vetor[] = new int[tam ];
        
        for (int i = 0; i < vetor.length; i++){
            System.out.printf("Informe o %d°: ", i+1);
            vetor[i] = ler.nextInt();
        }
        
        //mostrar valor
        for (int i = 0; i < vetor.length; i++){
            System.out.printf("%dº Valor: %d\n", i+1, vetor[i]);
        }
        
        //soma
        for (int i = 0; i < vetor.length; i++){
            System.out.printf("%dº Soma é: %d\n", i+1, vetor[i] + 100);
        }   
    }
}
