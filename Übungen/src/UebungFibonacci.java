public class UebungFibonacci {

    public static void main(String[] args) {
        System.out.println(fibo(10));
    }

    public static int fibo(int n){
        if (n <=2 ){
            return n==0 ? 0 : 1;
        }else {
            return fibo(n-1) + fibo(n-2);
        }
    }
}
