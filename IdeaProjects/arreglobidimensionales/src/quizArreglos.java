import java.util.Scanner;

public class quizArreglos {
    public static void main(String[] args) {
        System.out.println("Ingrese el un numero entre un rango de 1  a 40");
        Scanner hol = new Scanner(System.in);
        int holi = hol.nextInt();
        int[] fil = new int[20];
        boolean a = false;
        for (int i = 0; i < fil.length; i++) {
            fil[i] = (int) (Math.random() * 40 + 1);
            System.out.println(fil[i]);
            if (fil[i] == holi) {
                a = true;
            } else {
                a = false;
            }
        }
        if (a) {
            System.out.println(" El numero: " + holi + " Se encuentra en el arreglo");
        }
        if (!a) {
            System.out.println(" El numero " + holi + " no se encuentra en el arreglo");

        }
        while (!a) {
            System.out.println("Ingrese de nuevo un numero entre un rango de 1  a 40");
            holi = hol.nextInt();
            for (int i = 0; i < fil.length; i++) {
                fil[i] = (int) (Math.random() * 40 + 1);
                System.out.println(fil[i]);
                if (fil[i] == holi) {
                    a = true;
                }
            }
            if (a) {
                System.out.println(" El numero: " + holi + " Se encuentra en el arreglo");
            }
            if (!a) {
                System.out.println(" El numero " + holi + " no se encuentra en el arreglo");

            }
        }
    }
}