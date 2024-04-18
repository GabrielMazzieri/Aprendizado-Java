package visualizar_imc;

public class PrincipalVisualizacaoImc {
    public static void ver_imc(float imc){
        
        //Apresenta o IMC calculado formatado.
        String imc_formatado = String.format("%.1f", imc);
        System.out.println("\nSeu IMC é: " + imc_formatado);
      
    }
}
