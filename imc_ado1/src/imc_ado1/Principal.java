package imc_ado1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
   
        System.out.print("Número de pessoas para calcular: ");
        int numPessoas = sc.nextInt();

        String[] nomes = new String[numPessoas];
        float[] pesos = new float[numPessoas];
        float[] alturas = new float[numPessoas];
        float[] imcs = new float[numPessoas];
        String[] categorias = new String[numPessoas];

        for (int i = 0; i < numPessoas; i++) {
            System.out.printf("\nNome da %dª pessoa: ", (i + 1));
            nomes[i] = sc.next();

            System.out.printf("Peso de %s: ", nomes[i]);
            pesos[i] = sc.nextFloat();

            System.out.printf("Altura de %s: ", nomes[i]);
            alturas[i] = sc.nextFloat();

            imcs[i] = CalculoIMC.calcularIMC(pesos[i], alturas[i]);

            categorias[i] = CalculoIMC.obterCategoriaIMC(imcs[i]);
        }
        System.out.println("\nResultado");
        for (int i = 0; i < numPessoas; i++) {
            System.out.printf("%s: Peso: %.1f kg, Altura: %.2f m, IMC: %.1f, Categoria: %s\n",
                    nomes[i], pesos[i], alturas[i], imcs[i], categorias[i]);
        }
    }
}