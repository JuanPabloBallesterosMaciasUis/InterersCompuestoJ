package ejecutable;

import javax.swing.JOptionPane;

public class InteresCompuesto{
    public static void main(String[] args) {
        
        Double c1,c2,c3;
        int m = 0;

        c1 = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de Pedro: "));
        c2 = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de Juan: "));
        c3 = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor total del negocio: "));

        while ((c1 + c2) <= c3){
            c1 = c1 + (c1 * 0.03);
            c2 = c2 + (c2 * 0.04);
            m = m + 1;
        }

        JOptionPane.showMessageDialog(null, "Pedro y Juan necesitan " + m + " meses para alcanzar el negocio que desean");


        System.exit(0);
    }
}
