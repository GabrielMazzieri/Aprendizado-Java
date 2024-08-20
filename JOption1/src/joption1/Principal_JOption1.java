 package joption1;

import javax.swing.JOptionPane;
 
public class Principal_JOption1 {
    
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Nome: ", "Digite seu nome");
        String natural = JOptionPane.showInputDialog("Naturalidade: ", "Digite sua Naturalidade");
        String idade = JOptionPane.showInputDialog("Idade: ", "Digite sua idade");
        String sexo = JOptionPane.showInputDialog("Sexo: ", "(Masculino/Feminino)");
        
        JOptionPane.showMessageDialog(null, "Nome: " + nome + "" 
                            + " - Natural de: " + natural + " - Idade: " + idade + "" 
                                    + " - Sexo: " + sexo, "" 
                                    + "Informação", JOptionPane.INFORMATION_MESSAGE);
    }
}
