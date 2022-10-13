public class primerEjercicio {
    public static void main(String[] args) {
        int[][] fil = new int[11][11];
        int [][] guardar = new int[11][11];
        for (int i = 1; i<fil.length;i++){
            for(int j = 1; j< fil.length;j++ ){
                guardar[i][j]= i*j;
                System.out.println(i + " x " + j + " = " + guardar[i][j]);
            }
            System.out.println();
        }
    }
}
