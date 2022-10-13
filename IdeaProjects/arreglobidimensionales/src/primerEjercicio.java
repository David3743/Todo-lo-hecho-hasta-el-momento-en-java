public class primerEjercicio {
    public static void main(String[] args) {
        int[][] fil = new int[5][5];
        for (int i = 0; i < fil.length; i++) {
            for (int j = 0; j < fil.length; j++) {
                fil[i][j] = i * j;
                System.out.print(fil[i][j] + " ");
            }
            System.out.println();
        }

    }
}
