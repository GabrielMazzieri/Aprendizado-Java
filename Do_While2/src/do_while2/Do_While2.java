package do_while2;
import java.util.Scanner;

public class Do_While2 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número inteiro: ");
        int num = sc.nextInt();
        
        do{
            if(num == 11)
                break;
            
            System.out.println(num);
            
            num++;
            
        } while (num != 0);  
    }
}
