import java.util.Arrays;

public class SCTest {
    public static void main(String[] args) {
        double a = 5.1, b = 9.33, c = 2.89, d = 3.1432, e = 7.31, f = 8;
        long x = 651854248, y = 6525636, z = 3535556;
        int g = 41, h = 9, i = 20, j = 3, k = 7, l = 8;
        double[] tab = new double[]{2.32, 67, 9};
        System.out.println(SimpleCalculations.solveLinearEquation(a, b));
        System.out.println(SimpleCalculations.findMin(a, b));
        System.out.println(SimpleCalculations.findMax(a, b));
        System.out.println(SimpleCalculations.findMin(1,-1,1));
        System.out.println(SimpleCalculations.findMax(1,1,-1));
        System.out.println(Arrays.toString(SimpleCalculations.sort3(tab, false)));
        System.out.println(SimpleCalculations.fValue(f));
        System.out.println(SimpleCalculations.isLeapYear(1998));
        System.out.println(SimpleCalculations.asText(h));
        System.out.println(SimpleCalculations.linearSystemNumberOfSolutions(0,0,5,0,0,0));
        //System.out.println(SimpleCalculations.quadrants(a,b,c));
        System.out.println(SimpleCalculations.quadraticEquationNumberOfSolutions(d, e, f));
        System.out.println(Arrays.toString(SimpleCalculations.solveQuadraticEquation(a, b, c)));
        System.out.println(SimpleCalculations.fibonacci(h));
        System.out.println(SimpleCalculations.factorial(k));
        System.out.println(SimpleCalculations.product(i, l));
        System.out.println(SimpleCalculations.sum(j, k));
        System.out.println(SimpleCalculations.binomialCoefficient(g, i));
        System.out.println(SimpleCalculations.power(d, j));
        System.out.println(SimpleCalculations.gcd(x, y));
        System.out.println(SimpleCalculations.numberOfDigits(z));
        System.out.println(SimpleCalculations.digitsSum(z));
        System.out.println(SimpleCalculations.isDivisibleBy3(x));
        System.out.println(SimpleCalculations.isPrime(b));
        System.out.println(SimpleCalculations.dayOfWeek("08031998"));

    }
}
