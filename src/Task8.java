public class Task8 {
    public static void main(String[] args) {

        int c = 0;

        double f1 = c * 9 / 5 + 32;      // 9/5 int bölmədir
        double f2 = c * 9.0 / 5 + 32;    // 9.0/5 double bölmədir

        System.out.println("0°C");
        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);

        System.out.println();

        c = 100;

        f1 = c * 9 / 5 + 32;
        f2 = c * 9.0 / 5 + 32;

        System.out.println("100°C");
        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);

        System.out.println();

        c = 37;

        f1 = c * 9 / 5 + 32;
        f2 = c * 9.0 / 5 + 32;

        System.out.println("37°C");
        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);
    }
}