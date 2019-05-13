import java.util.Scanner;

public class TemperatureCalculator {
    /**
     * oblicza fahrenheita z celsjusza
     *
     * @param celsjusz podana temperatura
     * @return wynik w fahrenheicie
     */
    public static double toFahrenheitScale(double celsjusz) {
        return ((celsjusz * 9) / 5) + 32;
    }

    /**
     * oblicza celsjusza z fahrenheita
     *
     * @param fahrenheit podana wartosc
     * @return wynik w st. celsjusza
     */
    public static double toCelsiusScale(double fahrenheit) {
        return ((fahrenheit - 32) * 5) / 9;
    }

    /**
     * oblicza cecjusza na kelwina
     * @param celsjusz
     * @return wynik w kelwinach
     */
    public static double celsiustoKelwin(double celsjusz){
        return celsjusz-273.15;
    }

    /**
     * oblicza kelwina na celsjusza
     * @param kelwin
     * @return wynik w st. celsjusza
     */
    public static double kelwintoCelsius(double kelwin){
        return kelwin+273.15;
    }

    public static void main(String[] args) {
        System.out.println(toFahrenheitScale(32));
        System.out.println(toCelsiusScale(23));
        System.out.println(celsiustoKelwin(80));
        System.out.println(kelwintoCelsius(-80));
    }

}
