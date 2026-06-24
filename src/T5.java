public class T5 {
    public static void main(String[] args) {

        int bal1 = 78;
        int bal2 = 91;
        int bal3 = 84;

        // Yanlis yol:
        // (bal1 + bal2 + bal3) / 3 int / int oldugu ucun netice tam eded olur.

        double orta = (bal1 + bal2 + bal3) / 3.0;

        System.out.println("Orta bal: " + orta);
    }
}