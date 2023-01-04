public class Matriz {
    static int [][] matriz = new int[3][3];
        public static void runMatriz() {
            for (int i = 0; i < matriz.length; i++) {
                for (int ite = 0; ite < matriz[i].length; ite++) {
                    matriz[i][ite] = ((ite + 2) * 5) * (i + 1);
                }
            }

            for (int[] iteration : matriz
            ) {
                for (int number : iteration
                ) {
                    System.out.print(number + " ");
                }
                System.out.println("\n");

            }
        }
}
