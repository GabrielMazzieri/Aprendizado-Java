package array_tipado_ado1;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pessoas listaPessoas[] = new Pessoas[5];
   
        for (int i = 0; i < listaPessoas.length; i++) {
            listaPessoas[i] = new Pessoas();
            
            System.out.printf("Dados da %dª pessoa: \n", (i + 1));
            
            System.out.print("Nome: ");
            listaPessoas[i].nome = scanner.nextLine();
            
            System.out.print("Endereço: ");
            listaPessoas[i].endereco = scanner.nextLine();
            
            System.out.print("Telefone: ");
            listaPessoas[i].telefone = scanner.nextLine();
            
            System.out.print("Cidade: ");
            listaPessoas[i].cidade = scanner.nextLine();
            
            System.out.print("Estado: ");
            listaPessoas[i].estado = scanner.nextLine();
            
            System.out.print("CEP: ");
            listaPessoas[i].cep = scanner.nextLine();
            
            System.out.print("RG: ");
            listaPessoas[i].rg = scanner.nextLine();
            
            System.out.print("CPF: ");
            listaPessoas[i].cpf = scanner.nextLine();
            
            System.out.print("Idade: ");
            listaPessoas[i].idade = scanner.nextInt();
            scanner.nextLine(); 
       }

        System.out.println("\nDados:");
        for (int i = 0; i < listaPessoas.length; i++) {
            System.out.println("Pessoa " + (i + 1) + ":");
            System.out.println("Nome: " + listaPessoas[i].nome);
            System.out.println("Endereço: " + listaPessoas[i].endereco);
            System.out.println("Telefone: " + listaPessoas[i].telefone);
            System.out.println("Cidade: " + listaPessoas[i].cidade);
            System.out.println("Estado: " + listaPessoas[i].estado);
            System.out.println("CEP: " + listaPessoas[i].cep);
            System.out.println("RG: " + listaPessoas[i].rg);
            System.out.println("CPF: " + listaPessoas[i].cpf);
            System.out.println("Idade: " + listaPessoas[i].idade);
            System.out.println("___________________________");
      }
   }
}
