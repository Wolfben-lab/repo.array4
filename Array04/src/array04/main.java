package array04;

import javax.swing.JOptionPane;

public class main {
    public static void main(String[] args) {
        int[] numeros = new int[100]; 
        int quantidade = 0; 
     
        int num = 0;


        while (num != 99 && quantidade < 100) {
            String input = JOptionPane.showInputDialog("Digite um número (ou 99 para parar):");
            num = Integer.parseInt(input);

            if (num != 99) {
                numeros[quantidade] = num;
                quantidade++; 
            }
        }

      
        String lista = "";
        for (int i = 0; i < quantidade; i++) {
            lista += numeros[i] + "\n";
        }

       
        JOptionPane.showMessageDialog(null, "Números digitados:\n" + lista);
    }
}