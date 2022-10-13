import javax.swing.*;
import java.util.Scanner;

public class ejercicios_en_clase {
    public static void main(String[] args) {
        int entrada = 0;
        while (entrada != 5) {

                entrada = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la operacion que quiere realizar, 1-suma, 2-resta, 3-Division, 4-Multiplicacion, 5-Salir "));
                switch (entrada) {
                    case 1:
                        System.out.println("Ingrese el los  numeros a sumar");
                        Scanner no1 = new Scanner(System.in);
                        double no3 = no1.nextDouble();
                        double no4 = no1.nextDouble();
                        double no2 = no3 + no4;
                        System.out.println("El resultado de su suma es: " + no2);
                        break;
                    case 2:
                        System.out.println("Ingrese el los  numeros a restar");
                        Scanner no10 = new Scanner(System.in);
                        double no30 = no10.nextDouble();
                        double no40 = no10.nextDouble();
                        double no20 = no30 - no40;
                        System.out.println("El resultado de su resta es: " + no20);
                        break;
                    case 3:
                        System.out.println("Ingrese el los  numeros a dividir");
                        Scanner no100 = new Scanner(System.in);
                        double no300 = no100.nextDouble();
                        double no400 = no100.nextDouble();
                        double no200 = no300 / no400;
                        System.out.println("El resultado de su division es: " + no200);
                        break;
                    case 4:
                        System.out.println("Ingrese el los  numeros a restar");
                        Scanner no1000 = new Scanner(System.in);
                        double no3000 = no1000.nextDouble();
                        double no4000 = no1000.nextDouble();
                        double no2000 = no3000 / no4000;
                        System.out.println("El resultado de su resta es: " + no2000);
                        break;


                }
            }
        }
    }


