package imc_ado1;

public class CalculoIMC {
    public static float calcularIMC(float peso, float altura) {
        return peso / (altura * altura);
    }
    public static String obterCategoriaIMC(float imc) {
        if (imc < 18.5) {
            return "Baixo peso";
        } else if (imc >= 18.5 && imc <= 24.9) {
            return "Peso adequado";
        } else if (imc >= 25.0 && imc <= 29.9) {
            return "Sobrepeso";
        } else {
            return "Obesidade";
        }
    }
}
