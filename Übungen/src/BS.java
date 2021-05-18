public class BS {

    public static int kgv(int a, int b){
        int ta = a;
        int tb = b;

        while( ta != tb){
            if(ta < tb){
                ta += a;
            }else{
                tb += b;
            }
        }
        return ta;
    }
}