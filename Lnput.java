public class Lnput{
    public static int CoreLnt(String Input) {
        int Int;
        try {
            Integer.valueOf(Input).intValue();
            Int = 0;
        } catch (Exception e) {
            Int = 1;
        }
    return Int;
    }
    public static int CoreLong(String Input) {
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