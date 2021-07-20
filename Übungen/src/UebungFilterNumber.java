import jdk.dynalink.beans.StaticClass;

import java.util.Scanner;

public class UebungFilterNumber {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(filterNumber(s.next()));
    }

    public static String filterNumber(String input){
        StringBuilder output = new StringBuilder();
        boolean firstComma = true;
        for(char c: input.toCharArray()){
            if( c>='0' && c<= '9' || c=='-'){
                output.append(c);
            }else if(firstComma && c==','){
                firstComma = false;
                output.append(c);
            }
        }
        return stripZeros(output).toString();
    }

    public static StringBuilder stripZeros(StringBuilder sb){
        boolean lZ = false;
        int leadingZero = -1;
        int trailingZero = -1;

        if (sb.length()==0){
            return sb;
        }

        for (int i = 0 ; i < sb.length(); i++){

            if (!lZ && sb.charAt(i)=='0'){
                leadingZero = i;
            }else if (!lZ){
                lZ = true;
            }

            if((sb.charAt(i)=='0' || sb.charAt(i) == ',')&& trailingZero == -1){
                trailingZero = i;
            }else if(sb.charAt(i) != '0' && sb.charAt(i) != ','){
                trailingZero = -1;
            }


        }



        if (trailingZero != -1){
            sb.delete(trailingZero,sb.length());
        }
        if (leadingZero > 0) {
            sb.delete(0, leadingZero+1);
        }
        if(sb.charAt(0)==','){
            sb.insert(0,'0');
        }
        if(sb.length()==0){
            sb.append('0');
        }

        for (int i = 1 ; i < sb.length() ; i++){
            sb.replace(i,i+1, "");
        }

        return sb;
    }

}
