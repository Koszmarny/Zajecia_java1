public class Excel {
    public static int columnNumber(String letter) {
        int nr = Integer.parseInt(letter, 36);
        return nr - 9;
    }
}
