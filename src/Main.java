public class Main {
    public static void main(String[] args) {
        int[][] a ={ {1,2,3}, {4,5,6} };
        int[][] d = new int[3][2];

        System.out.println("Matris : ");
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();

        }
        System.out.println();

        System.out.println("Transpoze : ");


        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 2; j++){
                d[i][j] = a[j][i];
                System.out.print(d[i][j] + " ");

            }
            System.out.println();

        }

    }
}