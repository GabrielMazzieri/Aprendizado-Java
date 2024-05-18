//Integrantes: Gabriel Mazzieri e Lorenzzo Rodrigues
package principal;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantidade de pessoas: ");
        int numPessoa = sc.nextInt();
        Pessoa[] pessoas = new Pessoa[numPessoa];
        
        for (int i = 0; i < numPessoa; i++){
          
            System.out.printf("\n\tPeso da %dª Pessoa (ex: 60): ", i+1);
            float peso = sc.nextFloat();
            
            System.out.printf("\tAltura da %dª Pessoa (ex: 1,70): ", i+1);
            float altura = sc.nextFloat();
            
            pessoas[i] = new Pessoa(peso, altura);
        }
        
        CalculaIMC.calcularIMC(pessoas);
    }
}
