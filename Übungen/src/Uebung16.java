public class Uebung16 {
    public static void main(String[] args) {
        int [][] einmaleins = new int[100][100];

        //initialiesierien
        for (int i = 0; i<einmaleins.length;i++){
            for (int j = 0;j<einmaleins[1].length;) {
                einmaleins[i][j] = (i+1) * ++j;
            }
        }

        //ausgeben
        for (int i = 0; i<einmaleins.length;i++){
            for (int j = 0;j<einmaleins[1].length;j++) {
                System.out.print(einmaleins[i][j]+" ");
            }
            System.out.println();
        }
    }
}
