package impressao_formatada;


public class Impressao_Formatada {

    public static void main(String[] args) {
        String nome = "Gabriel Mazzieri";
        double altura = 1.73;
        int idade = 17;
        
        System.out.printf("Olá!"
                + "Meu nome é: %s \n"
                + "Minha altura é: %.2f \n"
                + "Minha idade é: %d \n", nome, altura, idade);
                
        System.out.println("Minha idade é: " + idade + "anos");
        
        System.out.println("Olá! \n"
                + "Meu nome é: " + nome + "\n"
                + "Minha altura é: " + altura + "\n"
                + "Minha idade é: " + idade +"\n\n");
    }
    
}
