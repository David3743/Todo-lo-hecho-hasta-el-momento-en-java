import.java.util.Scanner;
public class switchcase_1 {
    public static void main(String[] args) {
        Scanner obj = new  Scanner (System.in);
        int val1,val2,resultado,respuesta;
        System.out.println("Ingrese el primer numero");
        val1 = obj.nextInt();
        System.out.println("Ingrese el segundo numero");
        val2 = obj.nextInt();
        System.out.println("¿Que desea hacer con estos valores?");
        System.out.println( "Teclee la opcion correspondiente a la operacion que desea hacer");
        System.out.println("1._Suma, 2._Resta, 3._Multiplicacion, 4._Division ");
        respuesta = obj.nextInt();
        switch(respuesta){
            case 1:
                resultado = val1 + val2;
                System.out.println("La suma es igual a: " + resultado);
                break;
            case 2:
                resultado = val1 - val2;
                System.out.println("La resta es igual a: " + resultado);
                break;
            case 3:
                resultado = val1 * val2;
                System.out.println("La multiplicacion es igual a: " + resultado);
                break;
            case 4:
                resultado = val1 / val2;
                System.out.println("La division es igual a: " + resultado);
                break;
        }

    }
}


