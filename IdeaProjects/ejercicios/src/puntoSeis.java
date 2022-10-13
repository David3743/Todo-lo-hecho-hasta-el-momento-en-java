import javax.swing.*;

public class puntoSeis {
    public static void main (String[] args){
        int numeroFilas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del filas que desea imprimir"));
        //Punto A
        for(  int i = numeroFilas; i>=1; i--){
            for ( int j = 1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
        // Punto B
        for (int i = 0; i <= numeroFilas*2; i+=2 ){
            for(int j = 0; j <= i - 1; j+=2){
                System.out.print(i-2);
            }
            System.out.println();
            }
        // punto c
        int n = 1;
        for (int i = 1; i <=numeroFilas; i++){
            for (int j = 0; j <=i-1; j++){
                if (i % 2 == 0) {
                    n = 2;
                }
                else {
                    n=1;
                }
                System.out.print(n);

                }
            System.out.println();
            }

        }

        }


