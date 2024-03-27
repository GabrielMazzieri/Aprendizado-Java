package acumuludor;

public class Acumuludor {

    public static void main(String[] args) {
        
        int i, soma;
        for (i = 1, soma = 0; i <= 5; ++i){
            System.out.println("O valor agora é: " + i);
            
            soma = soma + i;
        }
        System.out.println("A soma dos números é "+ soma/5);
    }   
}
