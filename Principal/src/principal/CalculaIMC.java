package principal;

 class CalculaIMC {
    public static void calcularIMC(Pessoa[] pessoas) {
        String peso_user = null;
        
        for (int i = 0; i < pessoas.length; i++) {
            float imc_user = pessoas[i].peso / (pessoas[i].altura * pessoas[i].altura);
             
            if (imc_user < 18.5 ) {
                peso_user = "Baixo Peso";
            } else if (imc_user >= 18.5 && imc_user <= 24.9){
                peso_user = "Peso Adequado";
            } else if (imc_user >= 25.0 && imc_user <= 29.9){
                peso_user = "Sobrepeso";
            } else if (imc_user >= 30.0 && imc_user <= 39.9){
                peso_user = "Obesidade";
            } 
            
            System.out.printf("\n%dª Pessoa - IMC: %.2f | Classificação de Peso: %s\n", i+1, imc_user, peso_user);
    }
  }
}
