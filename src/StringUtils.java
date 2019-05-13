import java.util.StringTokenizer;

public class StringUtils {

    /**
     * zad 18/1
     *
     * @param text tekst
     * @return liczba cyfr
     */
    public static int countDigits(String text) {
        int result = 0;
        for (int i = 0; i < text.length(); i++) {
            if (Character.isDigit(text.charAt(i))) {
                result++;
            }
        }
        return result;
    }

    /**
     * zad 18/2
     *
     * @param text jakis tekst
     * @return liczba malych liter
     */
    public static int countSmallLetters(String text) {
        int result = 0;
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i))) {
                if (Character.isLowerCase(text.charAt(i))) {
                    result++;
                }
            }
        }
        return result;
    }

    /**
     * zad 18/3
     *
     * @param text tekst z duzymi literami
     * @return liczba duzych liter
     */
    public static int countCapitalLetters(String text) {
        int result = 0;
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i))) {
                if (Character.isUpperCase(text.charAt(i))) {
                    result++;
                }
            }
        }
        return result;
    }

    /**
     * zad 18/4
     *
     * @param text ciag znakow
     * @return liczba ani liter ani cyfr
     */
    public static int countNonLettersAndNonDigits(String text) {
        int result = 0;
        for (int i = 0; i < text.length(); i++) {
            if (!Character.isLetterOrDigit(text.charAt(i))) {
                result++;
            }
        }
        return result;
    }

    /**
     * zad 18/5
     *
     * @param text      tekst
     * @param character szukany znak
     * @return liczba wystapien znaku
     */
    public static int countCharacters(String text, char character) {
        int result = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == character) {
                result++;
            }
        }
        return result;
    }

    /**
     * zad 18/6
     *
     * @param text zdanie
     * @return ciag pierwszych liter
     */
    public static String abbreviation(String text) {
        text = text.trim();
        String result;
        if(text.isEmpty()){
            result = "";
        }else {
            result = String.valueOf(text.charAt(0));
            for (int i = 1; i < text.length() - 1; i++) {
                if (Character.isSpaceChar(text.charAt(i))) {
                    if (!Character.isSpaceChar(text.charAt(i + 1))) {
                        result += text.charAt(i + 1);
                    }
                }
            }
        }
        return result.toUpperCase();
    }

    /**
     * zad 18/7
     *
     * @param text podany tekst
     * @return tekst od tylu
     */
    public static String reverseString(String text) {
        String result = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            result += text.charAt(i);
        }
        return result;
    }

    /**
     * zad 18/8
     * sprawdza czy zdanie jest palindromem
     *
     * @param text zdanie
     * @return palindrom lub nie
     */
    public static boolean isPalindrome(String text) {
        int end = text.length() - 1;
        int front = 0;
        while (front < end) {
            if (text.charAt(front) != text.charAt(end)) {
                return false;
            }
            front++;
            end--;
        }
        return true;
    }

    /**
     * zad 18/9
     *
     * @param text ciag znakow
     * @param index indeks
     * @return znak pod indeksem
     */
    public static char reverseIndexOf(String text, int index) {
        return text.charAt(text.length() - index - 1);
    }

    /**
     * zad 18/10
     *
     * @param text jakis tekst
     * @param parity parzyste czy nie
     * @param start poczatek
     * @return parzyste lub nie
     */
    public static String filterByEvenOrOdd(String text, boolean parity, int start) {
        String result = "";
        int p;
        if (parity) {
            p = 0;
        } else p = 1;
        for (int i = start; i < text.length(); i++) {
            if (i % 2 == p) {
                result += text.charAt(i);
            }
        }
        return result;
    }

    /**
     * zad 18/11
     *
     * @param text tekst
     * @param text2 tekst ze wspolnymi znakami
     * @return liczba wspolnych znakow
     */
    public static int countCommonCharactersFromBeginning(String text, String text2) {
        int common = 0;
        int min = Math.min(text.length(),text2.length());
        for (int i = 0; i < min; i++) {
            if (text2.charAt(i) == text.charAt(i)) {
                common += 1;
            }
        }
        return common;
    }

    /**
     * zad 18/12
     *
     * @param Text tekst
     * @param anotherText drugi tekst
     * @return sprawdza czy tekst zawiera drugi tekst
     */
    public static boolean isTrimmableTo(String Text, String anotherText) {
        return Text.contains(anotherText);
    }

    /**
     * zad 18/13
     *
     * @param Text tekst
     * @param anotherText drugi tekst
     * @return liczy wystapienia drugiego tekstu w tekscie
     */
    public static int countOccurrences(String Text, String anotherText) {
        int occurences = 0;
        String[] tab = Text.split(" ");
        for(int i = 0; i < tab.length; i++){
            if(anotherText.equals(tab[i])){
                occurences++;
            }
        }
        return occurences;
    }

    /**
     * zad 18/14
     *
     * @param text      tekst poczatkowy
     * @param toReplace slowo do zastepowania
     * @return tekst z zastąpionym slowem
     */
    public static String censorByReplacing(String text, String toReplace) {
        String text2 = text.replaceAll(toReplace, "<censored>");
        return text2;
    }

    /**
     * zad 18/15
     *
     * @param text   tekst poczatkowy
     * @param remove slowo do usuniecia
     * @return tekst bez slow do usuniecia
     */
    public static String censorByRemoving(String text, String remove) {
        String text2 = text.replaceAll(remove + " ", "");
        return text2;
    }

    /**
     * zad 18/16
     *
     * @param text tekst
     * @return tekst odwrocony
     */
    public static String reverseWords(String text) {
        String[] tab = text.split(" ");
        String word;
        for (int w = 0; w < tab.length / 2; w++) {
            word = tab[w];
            tab[w] = tab[tab.length - 1 - w];
            tab[tab.length - 1 - w] = word;
        }
        return String.join(" ", tab);
    }


    /**
     * zad 18/17
     *
     * @param number liczba typu long
     * @return liczba cyfr liczby number
     */
    public static int numberOfDigits(long number) {
        return String.valueOf(number).length();
    }

    /**
     * zad 18/18
     *
     * @param text ciag typu string
     * @return zwraca czy podany ciag jest typu int
     */
    public static boolean isDecInteger(String text) {
        return text.matches("[-]?([1-9][0-9]{0,8}|[0])[lL]?");
    }

    /**
     * zad 18/19
     *
     * @param text ciag znakow
     * @return sprawdza czy ciag jest zapisem int
     */
    public static boolean isHexInteger(String text) {
        return text.matches("[-]?[0][xX][0-9a-fA-F]{0,8}[Ll]?");
    }

    /**
     * zad 18/20
     *
     * @param text
     * @return
     */
    public static boolean isNumber(String text) {

        return text.matches("[-]?[0-9][,][0-9]{0,8}");
    }
//ZADANIE 19

    /**
     * zad 19/1
     *
     * @param text tekst
     * @return tekst bez niepotrzebnych spacji
     */
    public static StringBuilder removeUnwantedSpaces(StringBuilder text) {
        // wycinamy spacje z poczatku
        while (text.charAt(0) == ' ') {
            text.deleteCharAt(0);
        }
        // wycinamy spacje z konca
        while (text.charAt(text.length() - 1) == ' ') {
            text.deleteCharAt(text.length() - 1);
        }
        // wycinamy spacje miedzy wyrazami
        int i = 0;
        while (i < text.length()) {
            if (Character.isSpaceChar(text.charAt(i)) && Character.isSpaceChar(text.charAt(i + 1))) {
                text.deleteCharAt(i);
            } else {
                i++;
            }
        }
        return text;
    }

    /**
     * zad 19/2
     *
     * @param text tekst stringbuilder
     * @return tekst rozdzielony spacjami
     */
    public static StringBuilder distribute(StringBuilder text) {
        for (int i = text.length() - 1; i > 0; i--) {
            text.insert(i, " ");
        }
        return text;
    }

    /**
     * zad 19/3
     *
     * @param text tekst typu stringbuilder
     * @return tekst bez komentarza
     */
    public static StringBuilder removeComment(StringBuilder text) {
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '/' && text.charAt(i + 1) == '/') {
                text.delete(i, text.length());
            }
        }
        return text;
    }

    /**
     * zad 19/4
     *
     * @param text    tekst stringbuilder
     * @param comment komentarz stringbuilder
     * @return tekst z dodanym na koncu komentarzem
     */
    public static StringBuilder addComment(StringBuilder text, StringBuilder comment) {
        removeUnwantedSpaces(text);
        text.append(" // ");
        text.insert(text.length(), comment);
        return text;
    }

    /**
     * zad 19/5
     *
     * @param text tekst stringbulider
     * @return sprawdza czy text jest palindromem
     */
    public static boolean isPalindrome(StringBuilder text) {
        removeUnwantedSpaces(text);
        return (text == text.reverse());
    }

    /**
     * zad 19/6
     *
     * @param text
     * @return
     */
    public static StringBuilder Polynomials(StringBuilder text) {

        return text;
    }
//ZADANIE 20

    /**
     * zad 20/1
     *
     * @param text
     * @return
     */
    public static String distribute(String text) {
        return text;
    }

    /**
     * zad 20/2
     *
     * @param text
     * @return
     */
    public static String removeComment(String text) {
        return text;
    }

    //ZADANIE 21

    /**
     * zad 21/1
     *
     * @param text tekst
     * @return skrot tekstu
     */
    public static String abbreviationA(String text) {
        StringBuilder wynik = new StringBuilder();
        StringTokenizer wyrazy = new StringTokenizer(text);
        while (wyrazy.hasMoreTokens()) {
            wynik.append(wyrazy.nextToken().charAt(0));
        }
        return (wynik.toString()).toUpperCase();
    }

    /**
     * zad 21/2
     *
     * @param text
     * @param znak
     * @return
     */
    public static int countWordsWithAChar(String text, char znak) {
        int result = 0;
        StringTokenizer wyrazy = new StringTokenizer(text, " ");
        String znakJakoString = String.valueOf(znak);
        while (wyrazy.hasMoreTokens()) {
            if (wyrazy.nextToken().contains(znakJakoString)) {
                result++;
            }
        }
        return result;
    }

    /**
     * zad 21/3
     *
     * @param text
     * @return
     */
    public static String reverseWordsA(String text) {
        StringBuilder result = new StringBuilder();
        StringTokenizer wyrazy = new StringTokenizer(text, " ");
        String text2 = "";
        if (!text.isEmpty()) {
            while (wyrazy.hasMoreTokens()) {
                result.insert(0, wyrazy.nextToken() + " ");
            }
            text2 = result.toString().substring(0, result.length() - 1);
        }
        return text2;
    }

    /**
     * zad 21/4
     *
     * @param text   tekst
     * @param remove slowo do usuniecia
     * @return tekst bez slowa
     */
    public static StringBuilder censorByRemovingA(String text, String remove) {
        StringBuilder result = new StringBuilder();
        StringTokenizer wyrazy = new StringTokenizer(text, " ");
        while(wyrazy.hasMoreTokens()){
            String next = wyrazy.nextToken();
            if(next.equals(remove)){
            }else {
                result.insert(result.length(),next + " ");
            }
        }
        return removeUnwantedSpaces(result);
    }

    /**
     * zad 21/5
     *
     * @param text lancuch do sprawdzenia
     * @return
     */
    public static boolean isTraditionalDecInteger(String text) {
        return true;
    }

    /**
     * zad 21/6
     * zmienia male na duze litery i odwrotnie
     *
     * @param text tekst
     * @return wynik
     */
    public static StringBuilder changeCase(String text) {
        StringBuilder result = new StringBuilder();
        StringTokenizer litery = new StringTokenizer(text, "");
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLowerCase(text.charAt(i))) {
                result.append(Character.toUpperCase(text.charAt(i)));
            } else {
                result.append(Character.toLowerCase(text.charAt(i)));
            }
        }
        return result;
    }
}
