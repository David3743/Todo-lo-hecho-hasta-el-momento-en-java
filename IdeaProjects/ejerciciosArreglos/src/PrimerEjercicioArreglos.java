import java.util.Scanner;
public class PrimerEjercicioArreglos {
    public static void main (String[] args){
        /*
        Dados 4 números por el usuario, almacenar en un arreglo y mostrar el mayor y el menor
         */
        int[] arry = new int[4];
        int maximo = 0;
        int minimo = 0;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arry.length; i++) {
            System.out.println("ingrese 1 valor");
            arry[i] = sc.nextInt();

        }

        for (int j = 0; j < arry.length; j++) {
            if (arry[j] > maximo) {
                maximo = arry[j];
            }
        }
        minimo=maximo;
        for(int i=0; i<arry.length; i++){
            if (arry[i] < minimo) {
                minimo = arry[i];
            }
        }
        System.out.println("En numero mayor es: " + maximo);
        System.out.println("El numero menor es: " + minimo);
    }
}

