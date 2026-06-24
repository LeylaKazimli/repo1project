public class T10 {
    public static void main(String[] args) {

        int mebleg = 5000;
        int faiz = 15;

        // Yanlış yol:
        // int * int / int hesablandığı üçün bütün aralıq nəticələr int olur.

        double faizMeblegi = mebleg * faiz / 100.0;

        System.out.println("Faiz məbləği: " + faizMeblegi);
    }
}
