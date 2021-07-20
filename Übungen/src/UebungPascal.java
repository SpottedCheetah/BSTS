import java.util.Arrays;

public class UebungPascal {

    
    public static void main(String[] args) {
        print2DArr(generate(10));
    }

    public static int[][] generate(int x){
        int[][] r = new int[x][];
        for (int i = 0; i < x;i++) {
            r[i] = new int[i+1];
        }
        for (int i = 0; i < x; i++){
            for (int j = 0; j <= i;j++){
                if(j == 0 || j == i){
                    r[i][j] = 1;
                } else {
                    r[i][j] = r[i-1][j-1] + r[i-1][j];
                }
            }
        }
        return r;
    }

    public static void print2DArr(int[][] array){
        for (int[] a : array){
            for (int x : a){
                System.out.print(x + "\t");
            }
            System.out.println();
        }
    }
}
