import java.util.Arrays;
import java.util.Random;
public class CuartaEjercicioArreglos {
    public static void main(String[] args) {
        int[] lista = new int[9];
        for( int i=0; i<lista.length;i++){
            Random numero=new Random();
            int numero1 = numero.nextInt(9)+1;
            lista[i] = numero1;
            System.out.println(lista[i]);
        }
        Arrays.sort(lista);
        System.out.println(Arrays.toString(lista));
    }
}
