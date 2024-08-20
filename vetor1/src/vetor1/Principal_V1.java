
package vetor1;

import java.util.Scanner;

public class Principal_V1 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        String nomes[] = new String[5];
        
        for (int i = 0; i < nomes.length; i++) {
           
            System.out.printf("informe o %dº nome: ", i+1);
            nomes[i] = entrada.nextLine();
            
        }
        
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("nome: " + nomes[i]);
        }
        
        entrada.close();
    
    }
}
