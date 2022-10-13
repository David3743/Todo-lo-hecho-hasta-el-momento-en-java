import javax.swing.*;

public class quiz2 {
    public static void main (String[] args) {
        String input = JOptionPane.showInputDialog("Ingrese la poblacion de la ciudad");
        int poblacion = Integer.parseInt(input);
        while (poblacion <= 0) {
           poblacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la poblacion de la ciudad (No se pueden numeros negativo o cero)"));
        }

        JOptionPane.showMessageDialog(null, "El numero de la poblacion es: " + poblacion);
    }
    }
