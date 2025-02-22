package utils;

public class ValidNumberCheck {
    public static boolean isValidDouble(String numString){
        try{
            Double.parseDouble(numString);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
