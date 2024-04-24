package vetor_nome;
import java.util.Scanner;

public class Principal_Vetor_Nome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos nomes? ");
        int tamanho = sc.nextInt();
        
        String[] nomes = new String[tamanho];
        
        for (int i = 0; i<tamanho; i++) {
            System.out.println("Digite o nome " + (i+1));
            nomes[i] = sc.nextLine();
        }
        
        System.out.println("Os nomes digitados são: ");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
