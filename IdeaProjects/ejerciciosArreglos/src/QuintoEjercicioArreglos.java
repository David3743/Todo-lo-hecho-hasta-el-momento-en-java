
import javax.swing.*;
import java.util.Scanner;
/*
Cree una aplicación para una tienda de dulces, en un arreglo de Strings coloque los nombres de los productos y en un arreglo int los precios. Las opciones del menú serán: ​
Mostrar los productos y sus precios. ​
Vender un producto ​
Mostrar el total de ingresos. ​
Cambiar Precio.
 */
public class QuintoEjercicioArreglos {
    public static void main(String[] args) {
        String[] dulces = {"Chocolate", "Vainilla", "Chicles", "Quipitos", "Traident"};
        int[] precio = {1800, 2000, 3800, 800, 1200};
        int ingresos = 0;
        int menu = 0;
        while (menu != 5) {
            menu = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opcion que quiere: 1_Mostrar los productos y sus precios, 2_Vender un producto, 3_Mostrar el total de ingresos, 4_cambiar precio, 5_Salir "));
            switch (menu) {
                case 1:
                    for (int i = 0; i < dulces.length; i++) {
                        System.out.println(dulces[i] + " " + precio[i]);
                    }
                    break;
                case 2:
                    int menu1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dulce a comprar, 1-Chocolate, 2-Vainilla, 3-Chicles, 4-Quipitos, 5-traident "));
                    switch (menu1) {
                        case 1:
                            System.out.println("Ingrese el numero de chocolates a llevar");
                            Scanner inn = new Scanner(System.in);
                            int numero = inn.nextInt();
                            numero = precio[0] * numero;
                            System.out.println(numero);
                            ingresos += numero;
                            break;
                        case 2:
                            System.out.println("Ingrese el numero de Vainilla   que va a llevar");
                            Scanner in = new Scanner(System.in);
                            int numer = in.nextInt();
                            numer = precio[1] * numer;
                            System.out.println(numer);
                            ingresos += numer;
                            break;
                        case 3:
                            System.out.println("Ingrese el numero de chicles que va a llevar");
                            Scanner ino = new Scanner(System.in);
                            int nume = ino.nextInt();
                            nume = precio[2] * nume;
                            System.out.println(nume);
                            ingresos += nume;
                            break;
                        case 4:
                            System.out.println("Ingrese el numero de quipitos que va a llevar");
                            Scanner inon = new Scanner(System.in);
                            int numee = inon.nextInt();
                            numee = precio[3] * numee;
                            System.out.println(numee);
                            ingresos += numee;
                            break;
                        case 5:
                            System.out.println("Ingrese el numero de traident que va a llevar");
                            Scanner inov = new Scanner(System.in);
                            int numev = inov.nextInt();
                            numev = precio[4] * numev;
                            System.out.println(numev);
                            ingresos += numev;
                            break;

                    }
                case 3:
                    System.out.println( "El total de ingresos es de: " + ingresos);
                    break;
                case 4:
                    int menu2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dulce al cual le quiere cambiar el precio, 1-Chocolate, 2-Vainilla, 3-Chicles, 4-Quipitos, 5-traident "));
                    switch (menu2) {
                        case 1:
                            System.out.println("Ingrese el valor del chocolate");
                            Scanner inno = new Scanner(System.in);
                            int numero10 = inno.nextInt();
                            precio[0] = numero10;
                            System.out.println("El valor del chocolate ahora es de: " + numero10);
                            break;
                        case 2:
                            System.out.println("Ingrese el valor de la Vainilla");
                            Scanner innno = new Scanner(System.in);
                            int numero20 = innno.nextInt();
                            precio[1] = numero20;
                            System.out.println("El valor de la Vainilla  ahora es de: " + numero20);
                            break;
                        case 3:
                            System.out.println("Ingrese el valor de los chicles");
                            Scanner inono = new Scanner(System.in);
                            int numero30 = inono.nextInt();
                            precio[2] = numero30;
                            System.out.println("El valor de los chicles  ahora es de: " + numero30);
                            break;
                        case 4:
                            System.out.println("Ingrese el valor de los quipitos");
                            Scanner ivno = new Scanner(System.in);
                            int numero40 = ivno.nextInt();
                            precio[3] = numero40;
                            System.out.println("El valor de los quipitos  ahora es de: " + numero40);
                            break;
                        case 5:
                            System.out.println("Ingrese el valor de los Traident");
                            Scanner ivvno = new Scanner(System.in);
                            int numero50 = ivvno.nextInt();
                            precio[4] = numero50;
                            System.out.println("El valor de los traident  ahora es de: " + numero50);
                            break;


                    }

            }


        }

    }
}


