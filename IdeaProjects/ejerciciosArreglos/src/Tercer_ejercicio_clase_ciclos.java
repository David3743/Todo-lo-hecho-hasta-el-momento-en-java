import javax.swing.*;

public class Tercer_ejercicio_clase_ciclos {
    public static void main(String[]args){
        int rango= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero maximo que va a tener su rango"));
        for( int i=0;i<=rango;i++){
            if(i%2==0){
                System.out.println(i);
            }

        }
    }
}
