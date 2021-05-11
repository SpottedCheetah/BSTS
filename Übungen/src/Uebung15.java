public class Uebung15 {


    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (100 * Math.random());
        }

        int sum = 0;
        for (int i:arr){
            sum += i;
        }

        System.out.println(sum);
        System.out.println((double)sum/arr.length);

    }
}