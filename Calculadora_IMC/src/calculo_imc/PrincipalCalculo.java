package calculo_imc;
import java.util.Scanner;

public class PrincipalCalculo {
    public static float calculo() {
        Scanner sc_peso = new Scanner(System.in);
        Scanner sc_altura = new Scanner(System.in);
        
        System.out.print("Digite seu peso: ");
        float peso_user = sc_peso.nextFloat();
        
        System.out.print("Digite sua altura: ");
        float altura_user = sc_altura.nextFloat();
        
        float calc_imc = peso_user/(altura_user*altura_user);
        return calc_imc;
    }
}
 
