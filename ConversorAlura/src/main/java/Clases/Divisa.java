
package Clases;

import javax.swing.JOptionPane;

public class Divisa {
    public static void main(String[] args) {
        String [] opPrincipal = {"Conversor de Divisa", "Conversor de Temperatura", "Conversor de Metros", "Conversor de Peso"};
        String [] opDivisa = {"De Soles a Dólares", "De Soles a Euros", "De Soles a Libras Esterlinas", "De Soles a Yen", "De Soles a Won Coreano",
        "De Dólares a Soles", "De Euros a Soles", "De Libras Esterlinas a Soles", "De Yen a Soles", "De Won Coreano a Soles"};
        String [] opTemperatura = {};
        String [] opMetros = {};
        String [] opPesos = {};
        
        Boolean band = true;
        while(band == true){
        Object menu = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menú",
                JOptionPane.PLAIN_MESSAGE, null, opPrincipal, opPrincipal[0]);
        
        if(menu.toString() == opPrincipal[0]){       
            String input = JOptionPane.showInputDialog(JOptionPane.showInputDialog(null, "Elija una opción a convertir", "Divisa",
                JOptionPane.PLAIN_MESSAGE, null, opDivisa, opDivisa[0]));         
            double divisa = Integer.parseInt(input);
            JOptionPane.showMessageDialog(null, "" + divisa);
        }
        
        int regresar = JOptionPane.showOptionDialog(null, "Desea continuar", "Opción", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, new Object[]{"SI", "NO"}, 0);
        
        if(JOptionPane.NO_OPTION == regresar){
            band = false;
        }
        }
 
        Object menuTemp = JOptionPane.showInputDialog(null, "Elija una opción a convertir", "Divisa",
                JOptionPane.PLAIN_MESSAGE, null, opTemperatura, opTemperatura[0]);
        Object menuMetros = JOptionPane.showInputDialog(null, "Elija una opción a convertir", "Divisa",
                JOptionPane.PLAIN_MESSAGE, null, opMetros, opMetros[0]);
        Object menuPesos = JOptionPane.showInputDialog(null, "Elija una opción a convertir", "Divisa",
                JOptionPane.PLAIN_MESSAGE, null, opPesos, opPesos[0]);
    }
    
}
