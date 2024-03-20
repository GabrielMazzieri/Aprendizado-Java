package pacote;

import java.util.Scanner;

public class PrimeiroMultiplaEscolha1 {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        String produto;
        
        System.out.println("Informe o produto: ");
        produto = tc.nextLine();
        
        switch(produto){
            case "cafe":
                System.out.println("Café saindo a R$ 17,99/500gr.");
                break;
            case "pao":
            case "bisnagas":
                System.out.println("Pão ou Bisnaga sai por R$ 9,25 / Kg.");
                break;
            default:
                System.out.printf("Produto indisponível", produto);
        }
    
    }
    
}
