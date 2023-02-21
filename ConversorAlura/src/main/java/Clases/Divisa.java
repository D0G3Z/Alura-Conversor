
package Clases;

import javax.swing.JOptionPane;

public class Divisa {
    public static void main(String[] args) {
        String [] opciones = {"Conversor de Divisa", "Conversor de Temperatura", "Conversor de Kilometraje", "Conversor de Peso"};
        JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menú", JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
    }
}
