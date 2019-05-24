import java.util.Arrays;

public class SimpleCalculations {
    /**
     * zad1
     * rozwiazuje ax+b=0
     *
     * @param a liczba 1
     * @param b liczba 2
     * @return wynik
     */
    public static double solveLinearEquation(double a, double b) {
        return -b / a;
    }

    /**
     * zad2
     * zwraca mniejsza liczbe z dwoch
     *
     * @param a liczba 1
     * @param b liczba 2
     * @return mniejsza liczba
     */
    public static double findMin(double a, double b) {
        return (a < b) ? a : b;
    }

    /**
     * zad2
     * zwraca wieksza liczbe z 2
     *
     * @param a liczba 1
     * @param b liczba 2
     * @return wieksza
     */
    public static double findMax(double a, double b) {
        return -findMin(-a, -b);
    }

    /**
     * zad3
     * zwraca mniejsza liczbe z 3
     *
     * @param a liczba
     * @param b liczba
     * @param c liczba
     * @return mniejsza z 3
     */
    public static double findMin(double a, double b, double c) {
        if (a <= b && a <= c) {
            return a;
        } else if (b <= a && b <= c) {
            return b;
        } else {
            return c;
        }
    }

    /**
     * zad3
     * zwraca wieksza liczbe z 3
     *
     * @param a liczba
     * @param b lizcba
     * @param c liczba
     * @return wieksza z 3
     */
    public static double findMax(double a, double b, double c) {

        return -findMin(-a, -b, -c);
    }


    /**
     * zad4/5
     * sortuje tablice w wybrany sposob
     *
     * @param tab       tablica
     * @param sortOrder sposob sortowania
     * @return posortowane
     */
    public static double[] sort3(double[] tab, boolean sortOrder) {
        double[] tab2 = new double[3];
        for (int i = 0; i < 3; i++) {
            tab2[i] = tab[i];
        }
        Arrays.sort(tab2);
        if (!sortOrder) {
            double t = tab2[0];
            tab2[0] = tab2[2];
            tab2[2] = t;
        }
        return tab2;
    }

    /**
     * zad6
     * rowiazuje rownanie f(x)
     *
     * @param x zmienna
     * @return wynik
     */
    public static double fValue(double x) {
        if (x <= 0) {
            return x;
        } else if (x > 2) {
            return x + 3;
        } else if (x <= 2) {
            return x * x - 2;
        } else {
            return 0;
        }
    }

    /**
     * zad7
     * sprawdza czy rok jest przestepny
     *
     * @param year podany rok
     * @return czy przestepny
     */
    public static boolean isLeapYear(int year) {
        return ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
    }

    /**
     * Zad8
     * zapisuje liczbe jako tekst
     *
     * @param number podana liczba
     * @return liczba jako tekst
     */
    public static String asText(int number) {
        String[] tab = {"zero", "jeden", "dwa", "trzy", "cztery", "pięć", "sześć", "siedem", "osiem", "dziewięć"};
        return tab[number];
    }

    /**
     * zad9
     *
     * @param a
     * @param b
     * @param c
     * @param d
     * @param e
     * @param f
     * @return
     */
    public static int linearSystemNumberOfSolutions(double a, double b, double c, double d, double e, double f) {
        double x = (c * e - b * f);
        double y = (a * f - c * d);
        double z = (a * e - b * d);
        int result = 0;
        if (z != 0) {
            result = 1;
        } else if (a == 0 && b == 0 && d == 0 && e == 0) {
            result = (c != 0 || f != 0) ? 0 : -1;
        } else if (x == 0 && y == 0) {
            result = -1;
        } else if (x == 0 && y != 0) {
            result = 0;
        }
        return result;
    }

    /**
     * zad10
     *
     * @param A
     * @param B
     * @param C
     * @return
     */

    public static int[] quadrants(double A, double B, double C) {
        int tab[] = new int[]{};
        if (A > 0) {
            if (C > 0) {
                tab = new int[]{1, 2, 3};
            } else if (C == 0) {
                tab = new int[]{1, 2};
            } else if (C < 0) {
                tab = new int[]{1, 3, 4};
            }
        } else if (A < 0) {
            if (C > 0) {
                tab = new int[]{1, 2, 4};
            } else if (C == 0) {
                tab = new int[]{2, 4};
            } else if (C < 0) {
                tab = new int[]{2, 3, 4};
            }
        } else if (A == 0) {
            if (C > 0) {
                tab = new int[]{1, 2};
            } else if (C < 0) {
                tab = new int[]{3, 4};
            }
        }
        return tab;
    }


    /**
     * zad 11
     * zwraca liczbe rozwiazan rownania
     *
     * @param a ax^2
     * @param b bx
     * @param c stala
     * @return liczba rozwiazan
     */
    public static int quadraticEquationNumberOfSolutions(double a, double b, double c) {
        double delta;
        int solution;
        if (a == 0 && b == 0 & c == 0) {
            solution = -1;
        } else {
            delta = b * b - 4 * a * c;
            if (a != 0 && delta > 0) {
                solution = 2;
            } else if ((a != 0 && delta == 0) || (a == 0 && b != 0)) {
                solution = 1;
            } else {
                solution = 0;
            }
        }
        return solution;
    }

    /**
     * zad12
     * zwraca rozwiazania rownania
     *
     * @param a ax^2
     * @param b bx
     * @param c stala
     * @return rozwiazania w tablicy
     */
    public static double[] solveQuadraticEquation(double a, double b, double c) {
        double delta;
        double[] Array = new double[3];
        delta = b * b - 4 * a * c;
        if (delta > 0) {
            Array[0] = (-b + Math.sqrt(delta)) / 2 * a;
            Array[1] = (-b - Math.sqrt(delta)) / 2 * a;
        } else if (delta == 0) {
            Array[0] = (-b / 2 * a);
        } else if (a == 0 && b == 0 && c == 0) {
            Array[0] = 0;
            Array[1] = 0;
            Array[2] = 0;
        }
        return Array;
    }

    /**
     * zad13
     * zwraca liczbe fibonacciego o numerze n
     *
     * @param number numer
     * @return liczba fibonacciego
     */
    public static long fibonacci(int number) {
        long wynik = 0;
        if (number == 0) {
            wynik = 0;
        } else if (number == 1 || number == 2) {
            wynik = 1;
        } else if (number >= 3 && number < 93) {
            wynik = fibonacci(number - 1) + fibonacci(number - 2);
        }
        return wynik;
    }

    /**
     * zad14
     * zwraca silnie z liczby
     *
     * @param number liczba
     * @return silnia
     */
    public static long factorial(int number) {
        long wynik = 0;
        if (number >= 1 && number < 21) {
            wynik = number * factorial(number - 1);
        } else if (number == 0) {
            wynik = 1;
        }
        return wynik;
    }

    /**
     * zad15
     * oblicza iloczyn kolejnych liczb naturalnych
     *
     * @param start  liczba poczatkowa
     * @param finish liczba koncowa
     * @return iloczyn
     */
    public static long product(int start, int finish) {
        long prod = 1;
        for (int i = start; i <= finish; i++) {
            prod = prod * i;
        }
        return prod;
    }

    /**
     * zad16
     * oblicza sume kolejnych liczb naturalnych
     *
     * @param start  liczba poczatkowa
     * @param finish liczba koncowa
     * @return suma liczb
     */
    public static long sum(int start, int finish) {
        long sum = 0;
        for (int i = start; i <= finish; i++) {
            sum += i;
        }
        return sum;
    }
/*
    public static long sum(int a, int b) {
        long result = 0;
        do {
            result = result + a;
            a++;
        } while (a <= b);

        return result;
    }
    */

    /**
     * zad17
     * oblicza symbol newtona podanych liczb
     *
     * @param up   n
     * @param down k
     * @return wynik
     */
    public static long binomialCoefficient(int up, int down) {
        long newton = 1;
        for (long i = 1; i <= down; i++) {
            newton = newton * (up - i + 1) / i;
        }
        return newton;
    }

    /**
     * zad18
     * wylicza potege
     *
     * @param base  podstawa
     * @param index wykladnik
     * @return potega
     */
    public static double power(double base, int index) {
        double wynik = 1;
        if (base == 0 && index == 0) {
            wynik = Double.NaN;
        } else {
            for (int i = 1; i <= index; i++) {
                wynik *= base;
            }
        }
        return wynik;
    }

    /**
     * zad19
     * zwraca najwiekszy wspolny dzielnik
     *
     * @param numberA liczba 1
     * @param numberB liczba 2
     * @return nwd
     */
    public static double gcd(long numberA, long numberB) {
        while (numberA != numberB) {
            if (numberA > numberB) {
                numberA = numberA - numberB;
            } else {
                numberB = numberB - numberA;
            }
        }
        return numberA;
    }

    /**
     * zad20
     * zwraca liczbe cyfr
     *
     * @param number liczba
     * @return liczba cyfr
     */
    public static double numberOfDigits(long number) {
        String digits = "" + Math.abs(number);
        return digits.length();
    }

    /**
     * zad21
     * oblicza sume cyfr liczby
     *
     * @param number liczba
     * @return suma
     */
    public static long digitsSum(long number) {
        long sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    /**
     * zad22
     * sprawdza czy liczba podzielna przez 3
     *
     * @param number liczba
     * @return tak lub nie
     */
    public static boolean isDivisibleBy3(long number) {
        return (digitsSum(number) % 3 == 0);
    }

    /**
     * zad23
     * sprawdza czy liczba jest pierwsza
     *
     * @param number liczba
     * @return tak lub nie
     */
    public static boolean isPrime(double number) {
        boolean prime;
        int i = 2;
        for (prime = true; prime && (double) i <= Math.sqrt(number); ++i) {
            prime = number % i != 0;
        }
        return prime;
    }

    /**
     * zad24
     * sprawdza jakim dzniem tygodnia jest data
     *
     * @param ddmmyear data dzien miesiac rok
     * @return jaki dzien
     */
    public static int dayOfWeek(String ddmmyear) {
        ddmmyear = ddmmyear.trim();
        String d = ddmmyear.substring(0, 2);
        String m = ddmmyear.substring(2, 4);
        String ye = ddmmyear.substring(4, 6);
        String ar = ddmmyear.substring(6, 8);
        double dd = Integer.parseInt(d);
        double mm = Integer.parseInt(m);
        double r1 = Integer.parseInt(ye);
        double r2 = Integer.parseInt(ar);
        double m12 = 1 + ((mm + 9) % 12);
        double dweek = dd + (2.6 * m12 - 0.2) + r2 + (r2 / 4) + (r1 / 4) - 2 * r1;
        double aa = (int) Math.round(dweek);
        double day = aa % 7;
        if (r1 == 19 && r2 >= 01 || r1 == 20 && r2 <= 99) {
            return (int) day;
        } else {
            return -1;
        }
    }
}

