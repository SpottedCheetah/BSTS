public class BS {

    public static int kgv(int a, int b) {
        int ta = a;
        int tb = b;

        while (ta != tb) {
            if (ta < tb) {
                ta += a;
            } else {
                tb += b;
            }
        }
        return ta;
    }

    public static void FizzBuzz(int l) {
        for ( int i = 1; i<l;i++){

            if (i%3 == 0){
                System.out.print("Fizz");
            }

            if (i%5 == 0){
                System.out.print("Buzz");
            }

            if(i%3 != 0 && i%5 != 0){
                System.out.print(i);
            }

            System.out.println();
        }
    }
}