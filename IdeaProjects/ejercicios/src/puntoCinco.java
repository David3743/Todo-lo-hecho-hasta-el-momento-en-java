import java.util.Scanner;
public class puntoCinco{
    public static void main(String[] args) {
        int player1= 0, player2=0, player3=0;
        Scanner in= new Scanner(System.in);
        for(int i=1; i<=3; i++) {
            for(int j=1; j<=5; j++) {
                switch (i) {
                    case 1-> {
                        System.out.println("Jugador #"+i+" :"
                                + "¿Cúantos bolos derribó en el turno #"+j+"?");
                        player1+= in.nextInt();}
                    case 2-> {
                        System.out.println("Jugador #"+i+" :"
                                + "¿Cúantos bolos derribó en el turno #"+j+"?");
                        player2+= in.nextInt();
                    }
                    case 3-> {
                        System.out.println("Jugador #"+i+" :"
                                + "¿Cúantos bolos derribó en el turno #"+j+"?");
                        player3+= in.nextInt();}
                }
            }
        }
        System.out.println("Puntuación final : "+"\nJugador #1 : "+player1+" puntos"
                +"\nJugador #2 : "+player2+" puntos"
                +"\nJugador #3 : "+player3+" puntos");
    }
}
