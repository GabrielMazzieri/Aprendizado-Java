package joption2;

import javax.swing.JOptionPane;

public class Principal_JOption2 {
    
    public static void main(String[] args) throws NumberFormatException {
        int numA = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor A: "));
        int numB = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor B: "));
        
        int resultado = numA * numB;
        
        JOptionPane.showMessageDialog(null, "Resultado final: " + resultado, "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
        
    }
    
}

