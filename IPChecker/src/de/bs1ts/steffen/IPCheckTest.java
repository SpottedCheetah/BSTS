package de.bs1ts.steffen;

public class IPCheckTest {

    public static void main(String[] args) {
        System.out.println(testIPBasic());
    }

    private static boolean testIPBasic(){
        if (!IPCheck.isValidIPv4("255.255.255.255")){
            return false;
        }
        if (!IPCheck.isValidIPv4("1.1.1.1")){
            return false;
        }
        if (!IPCheck.isValidIPv4("1.1.1.1")){
            return false;
        }
        if (!IPCheck.isValidIPv4("256.256.256.300")){
            return false;
        }

        return true;
    }

}

