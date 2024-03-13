package pacote;

public class Principal_Cond1 {
    public static void main(String[] args) {
        double nota1 = 5;
        double nota2 = 5.5;
        double nota3 = 3;
        
        double media = (nota1 + nota2 + nota3)/2;
        System.out.println("A média é: " + media);
        
        if (media >= 6) {
            System.out.println("Aluno Aprovado");
        }
        else{
            System.out.println("Aluno Reprovado");
        }
    }
}
 