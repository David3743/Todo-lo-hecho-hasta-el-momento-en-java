import javax.swing.*;

class primerejercico{
    public static void main(String[] args){
        String dato = JOptionPane.showInputDialog("Ingrese los grados que quiere convertir");
         double dato2 = Double.parseDouble(dato);
         dato2 = dato2*180/Math.PI;
         JOptionPane.showMessageDialog(null, "El resultado en radianes es: " + dato2);


    }
}