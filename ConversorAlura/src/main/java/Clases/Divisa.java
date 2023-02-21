
package Clases;

import javax.swing.JOptionPane;

public class Divisa {
    public static void main(String[] args) {
        String [] opPrincipal = {"Conversor de Divisa", "Conversor de Temperatura", "Conversor de Kilometraje", "Conversor de Peso"};
        String [] opDivisa = {"De Soles a Dólares", "De Soles a Euros", "De Soles a Libras Esterlinas", "De Soles a Yen", "De Soles a Won Coreano",
        "De Dólares a Soles", "De Euros a Soles", "De Libras Esterlinas a Soles", "De Yen a Soles", "De Won Coreano a Soles"};
        
        Object menu = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menú", JOptionPane.PLAIN_MESSAGE, null, opPrincipal, opPrincipal[0]);
        Object menuDivisa = JOptionPane.showInputDialog(null, "Elija una opción a convertir", "Divisa", JOptionPane.PLAIN_MESSAGE, null, opDivisa, opDivisa[0]);
        
        if(menu.toString().equalsIgnoreCase("Conversor de Divisa")){
            String input = JOptionPane.showInputDialog(menuDivisa);
            double divisa = Integer.parseInt(input);
        }
    }
}
