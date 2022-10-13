import javax.swing.*;

public class tercerPunto {
    public static void main (String[]args){
        int a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese  el numero hasta donde quiere ir"));
        for(int i = 1; i< a; i+=2){
            System.out.println(i);
        }
    }
}
