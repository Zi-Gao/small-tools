public class inputDetection{
    public static int intType(String Input) {
        int returnInt;
        try {
            Integer.valueOf(Input).intValue();
            returnInt = 0;
        } catch (Exception e) {
            returnInt = 1;
        }
    return returnInt;
    }
    public static int longType(String Input) {
        int returnInt;
        try {
            Long.valueOf(Input).intValue();
            returnInt = 0;
        } catch (Exception e) {
            returnInt = 1;
        }
    return returnInt;
    }
}