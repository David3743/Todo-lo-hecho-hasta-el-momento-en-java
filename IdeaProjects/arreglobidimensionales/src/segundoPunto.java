public class segundoPunto {
    public static void main(String[] args) {
        int[][] fil = new int[20][20];
        for (int i = 0; i < fil.length; i++) {
            for (int j = 0; j < fil.length; j++) {
                for (int k = 20; k < fil.length; k--) {
                    for (int l = 20; l < fil.length; l--) {
                        if (i == j || k == l) {
                            fil[i][j] = 1;
                            fil[k][l] = 1;
                        } else {
                            System.out.print(" ");
                        }
                        System.out.print(fil[i][j] + " ");
                        System.out.print(fil[k][l] + " ");
                    }
                    System.out.println();
                }

            }
        }
    }
}
