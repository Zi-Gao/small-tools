public class InputDetection{
    public static int intType(String Input) {
        int Int;
        try {
            Integer.valueOf(Input).intValue();
            Int = 0;
        } catch (Exception e) {
            Int = 1;
        }
    return Int;
    }
    public static int longType(String Input) {
        int Int;
        try {
            Long.valueOf(Input).intValue();
            Int = 0;
        } catch (Exception e) {
            Int = 1;
        }
    return Int;
    }
}