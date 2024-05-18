//Integrantes: Gabriel Mazzieri e Lorenzzo Rodrigues
package principalcadastro;
import java.util.Scanner;

public class PrincipalCadastro {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc_num = new Scanner(System.in);
        
        while (true) {
            System.out.print("Quantidade de Pessoas: ");
            int numPessoa = sc_num.nextInt();
            
            Pessoa[] listaPessoas = new Pessoa[numPessoa];
            
            for (int i = 0; i < numPessoa; i++) {
                Pessoa pessoa = new Pessoa();
                System.out.printf("%dª Pessoa:", i+1);
                
                System.out.print("\n\tNome: ");
                pessoa.nome = sc.nextLine();
                
                System.out.print("\tEndereço: ");
                pessoa.endereco = sc.nextLine();
                
                System.out.print("\tTelefone: ");
                pessoa.telefone = sc.nextLine();
                
                System.out.print("\tCidade: ");
                pessoa.cidade = sc.nextLine();
                
                System.out.print("\tEstado: ");
                pessoa.estado = sc.nextLine();
                
                System.out.print("\tCEP: ");
                pessoa.cep = sc.nextLine();
                
                System.out.print("\tIdade: ");
                pessoa.idade = sc_num.nextInt();
                
                System.out.print("\tRG: ");
                pessoa.rg = sc.nextLine();
                
                System.out.print("\tCPF: ");
                pessoa.cpf = sc.nextLine();
                
                listaPessoas[i] = pessoa;
            }
            System.out.println("\nDados dos Usuários:");
            
            for(Pessoa pes : listaPessoas) {
                System.out.println("\nNome: " + pes.nome);
                System.out.println("Endereço: " + pes.endereco);
                System.out.println("Telefone: " + pes.telefone);
                System.out.println("Cidade: " + pes.cidade);
                System.out.println("Estado: " + pes.estado);
                System.out.println("CEP: " + pes.cep);
                System.out.println("Idade: " + pes.idade);
                System.out.println("RG: " + pes.rg);
                System.out.println("CPF: " + pes.cpf);
            }
            
            System.out.println("Continuar seu Cadastro? Digite s/n ");
            String resposta = sc.nextLine();
            if (!resposta.equalsIgnoreCase("s")) {
                break;
            }
        }
    }
}
        