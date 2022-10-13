import java.util.Scanner;

public class ejercicioEnClaseArraylist {
    public static void main(String[] args) {
        // primer punto
        // este arreglo me imprime la siguiente secuencia de numeros 0 2 4 6 8 10 12 14 16 18 ya que el arreglo
        //inicia en 0  i se va multiplicando por dos
        int[] arreglo = new int[10];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = 2 * i;
        }
        for (int i : arreglo) {
            System.out.print(i + " ");
        }
        System.out.println();
        //Segundo Ejercicio
        //Este ejercicio me va  a imprimir la siguientes datos
        //a
        //e
        //i
        //o
        //u
        //esto sucede ya que le estoy diciendo al programa que mientras  index  sea menor a vocal imprimame lo
        //que tengo en el arreglo y haga un salto de linea
        char[] vocal = {'a', 'e', 'i', 'o', 'u'};
        for (int index = 0; index <vocal.length; index++)
            System.out.println(vocal[index]);
        // tecer ejercicio
        //El ejercicio imprime lo siguiente
        // Ola 1 es -7.3
        //Ola 2 es 14.2
        //Esto sucede ya que le esta pidiendo al programa que imprima  el ola + la el numero en la posicion 1
        // y despues imprime el ola pero con el numero que esta en la posicion 2
        double ola[] = {12.2, -7.3, 14.2, 11.3};
        System.out.println("Ola 1 es " + ola[1]);
        System.out.println("Ola 2 es " + ola[2]);
        // EJERCICIO 2
        //El ultimo indice de a es 10 y lenght = 10
        int[] a = new int[10];
        System.out.println(a.length);
        //TERCER EJERCICIO
        //El error en este ejercicio es que al estar multiplicando 5 * i, esta multiplicacion va a hacer que
        //el resultado sea mas grande que el arreglo
        //int[] b = new int[10];
        //for (int i = 1; i <= b.length; i++){
            //b[i] = 5 *  i;
        //EJERCICIO 4
        double [ ] numero = new double[10];
        Scanner In = new Scanner(System.in);
        System.out.println("Ingrese los el numero");
        double n = In.nextDouble();
        for ( double i = 0; i  numero ; i++){

        }

        }

    }


