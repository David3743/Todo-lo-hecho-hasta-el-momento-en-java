import javax.swing.*;

public class quintoPunto {
    public static void main (String[]args){
        String a = JOptionPane.showInputDialog("Ingrese cualquier texto, nada de numeros, sin espacios ");
        System.out.println(a.length());
        System.out.println("Si ha ingresado espacios estos tambien se contaran");
    }
}
