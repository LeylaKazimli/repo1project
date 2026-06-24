public class T8 {
    public static void main(String[] args) {

        int yas = 25;
        double gelir = 1200.0;
        boolean tarix = true;

        // Kredit şərti: yaş 21-65, gəlir 800-dən çox, tarix true olmalıdır

        boolean yasUygun = yas >= 21 && yas <= 65;
        // Yanlış idi: yas > 21 && yas < 65
        // Çünki 21 və 65 yaş da şərtə daxil olmalıdır.

        boolean gelirUygun = gelir > 800;
        // Bu hissə düzgündür.

        boolean uygun = yasUygun && gelirUygun && tarix;
        // Yanlış idi: ||
        // Çünki kredit üçün bütün şərtlər eyni vaxtda ödənilməlidir.

        System.out.println("Yaş uyğun:   " + yasUygun);
        System.out.println("Gəlir uyğun: " + gelirUygun);
        System.out.println("Kredit:      " + uygun);
    }
}