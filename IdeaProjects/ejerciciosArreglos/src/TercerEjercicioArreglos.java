import java.util.Random;
public class TercerEjercicioArreglos {
    public static void main (String[] args){
        //Llenar aleatoriamente un arreglo de 20 posiciones con 1 y 0 . Mostrar el arreglo y decir cuantos 0 hay
        int contador = 0;
        int [] arreglo = new int[20];
        for(int i:arreglo){
            Random numero = new Random();
            int numero1 = numero.nextInt(2);
            arreglo[i] = numero1;
            System.out.println(arreglo[i]);
            if (arreglo[i] == 0){
                contador++;
            }
        }
        System.out.println("El numero de ceros es: " + contador);
    }
}
