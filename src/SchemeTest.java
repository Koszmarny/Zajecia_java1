public class SchemeTest {
    public static void main(String[] args) {
        double tab[] = new double[]{-7, 1, -3, 0, 5};
        double tab2[] = new double[]{4, 3, 7, 2};
        Polynomial po = new Polynomial(tab);
        Polynomial po2 = new Polynomial(tab2);
//        System.out.println(po.valueAt(0));
//        System.out.println(po.valueAt(1));
//        System.out.println(po.valueAt(-1));
//        System.out.println(po.valueAt(2));

        System.out.println(po);
        System.out.println(po2);
        System.out.println(po.add(po2));
        System.out.println(po2.subtract(po));
        System.out.println(po.multiply(po2));
        System.out.println(po.getDerivative());
    }
}
