package utils;

public class TempConverter {
    public static double fToC(double tempInF){
        return ((double) 5 /9) * (tempInF - 32);
    }

    public static double cToF(double tempInC){
        return ((double)9 / 5) * tempInC + 32;
    }

    public static double kToC(double tempInK){
        return tempInK - 273;
    }
    public static double cToK(double tempInK){
        return tempInK + 273;
    }
    public static double fToK(double tempInF){
        return cToK(fToC(tempInF));
    }
    public static double kToF(double tempInK){
        return cToF(kToC(tempInK));
    }
}
