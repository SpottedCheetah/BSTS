package de.bs1ts.steffen;

public class IPCheck {


    public static boolean isValidIPv4(String IP) {
        return IP == null ? false : IP.trim().matches("((1?[0-9]?[0-9])|(2[0-5][0-5]))\\.((1?[0-9]?[0-9])|(2[0-5][0-5]))\\.((1?[0-9]?[0-9])|(2[0-5][0-5]))\\.((1?[0-9]?[0-9])|(2[0-5][0-5]))");
    }

    //172.16.0.0/12
    public static boolean isPrivate172(String IP) {
        return IP == null ? false : IP.trim().matches("172\\.(1[6-9]|2[0-9]|3[0-1])\\.((1?[0-9]?[0-9])|(2[0-5][0-5]))\\.((1?[0-9]?[0-9])|(2[0-5][0-5]))");
    }

    //192.168.0.0/16
    public static boolean isPrivate192(String IP) {
        return IP == null ? false : IP.trim().matches("192\\.168\\.((1?[0-9]?[0-9])|(2[0-5][0-5]))\\.((1?[0-9]?[0-9])|(2[0-5][0-5]))");
    }

    //10.0.0.0/8
    public static boolean isPrivate10(String IP) {
        return IP == null ? false : IP.trim().matches("10\\.((1?[0-9]?[0-9])|(2[0-5][0-5]))\\.((1?[0-9]?[0-9])|(2[0-5][0-5]))\\.((1?[0-9]?[0-9])|(2[0-5][0-5]))");
    }

    //127.0.0.0/8
    public static boolean isLoopback(String IP) {
        return IP == null ? false : IP.trim().matches("127\\.((1?[0-9]?[0-9])|(2[0-5][0-5]))\\.((1?[0-9]?[0-9])|(2[0-5][0-5]))\\.((1?[0-9]?[0-9])|(2[0-5][0-5]))");
    }

    public static boolean isGlobalUnicast(String IP) {
        return isValidIPv4(IP) && !(isPrivate10(IP) || isPrivate172(IP) || isPrivate192(IP) || isLinkLocal(IP) || isMulticast(IP) || isLoopback(IP));
    }

    //69.254.X.X
    public static boolean isLinkLocal(String IP) {
        return IP == null ? false : IP.trim().matches("169\\.254\\.((1?[0-9]?[0-9])|(2[0-5][0-5]))\\.((1?[0-9]?[0-9])|(2[0-5][0-5]))");
    }

    //224.X.X.X - 239.X.X.X
    public static boolean isMulticast(String IP) {
        return IP == null ? false : IP.trim().matches("2(2[4-9]|3[0-9])\\.((1?[0-9]?[0-9])|(2[0-5][0-5]))\\.((1?[0-9]?[0-9])|(2[0-5][0-5]))\\.((1?[0-9]?[0-9])|(2[0-5][0-5]))");

    }
}
