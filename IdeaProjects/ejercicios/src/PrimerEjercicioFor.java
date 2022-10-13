import javax.swing.*;

public class PrimerEjercicioFor {
    public static void main (String[] args){
        double A = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero de notas que quiere sacar "));
        double promedio, notaAcumulada = 0.0;
        for ( double i = 1; i <= A;i++ ){
            notaAcumulada+=i;
            JOptionPane.showInputDialog("Ingrese nota #" + i);
        }
         promedio = (notaAcumulada / A);
        JOptionPane.showMessageDialog(null, "Promedio = " + promedio);

    }
}
