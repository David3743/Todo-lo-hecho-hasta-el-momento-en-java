public class TercerEjercicioFor {
    public static void main (String[] args){
        int contador = 0;
        int A = 0;
        for( int i = 2; i <= 100; i +=2){
            contador++;
            A +=i;
        }
        System.out.println("El numero de numeros pares de 1 hasta 100 es de: " + contador);
        System.out.print(A);
    }
}
