public class T14bonus {
    public static void main(String[] args) {

        // Sabitlər
        final int MIN_YAS = 18;
        final int MIN_PAROL = 8;
        final double MIN_GELIR = 500.0;

        // İstifadəçi məlumatları
        String ad = "leyla";
        int yas = 31;
        double gelir = 7000.5;
        String parol = "Leyla123";
        String email = "leyla@gmail.com";

        // Yoxlamalar
        boolean adYoxla = ad.length() > 0;
        boolean yasYoxla = yas >= MIN_YAS;
        boolean gelirYoxla = gelir > MIN_GELIR;
        boolean parolYoxla = parol.length() >= MIN_PAROL;
        boolean emailYoxla = email.contains("@");

        // Bütün yoxlamalar doğrudursa qeydiyyat uğurludur
        boolean qeydiyyat =
                adYoxla &&
                        yasYoxla &&
                        gelirYoxla &&
                        parolYoxla &&
                        emailYoxla;

        // Adın ilk hərfini böyüt
        String formatliAd =
                ad.substring(0, 1).toUpperCase()
                        + ad.substring(1).toLowerCase();

        // Nəticələr
        System.out.println("===== QEYDİYYAT YOXLAMASI =====");
        System.out.println("Ad: " + formatliAd);
        System.out.println("Yaş: " + yas);
        System.out.println("Gəlir: " + gelir + " AZN");
        System.out.println("Email: " + email);
        System.out.println();

        System.out.println("Ad boş deyil: " + adYoxla);
        System.out.println("Yaş uyğundur: " + yasYoxla);
        System.out.println("Gəlir uyğundur: " + gelirYoxla);
        System.out.println("Parol uyğundur: " + parolYoxla);
        System.out.println("Email düzgündür: " + emailYoxla);
        System.out.println();

        System.out.println("Qeydiyyat uğurludur: " + qeydiyyat);

        // FINAL testi
        System.out.println("\n===== FINAL TESTİ =====");
        System.out.println("Minimum yaş: " + MIN_YAS);
        System.out.println("Minimum parol uzunluğu: " + MIN_PAROL);
        System.out.println("Minimum gəlir: " + MIN_GELIR);

        // Aşağıdakı sətirlərin // işarəsini silsən,
        // proqram compile xətası verəcək.
        // Çünki final dəyişənlər dəyişdirilə bilməz.

        // MIN_YAS = 20;
        // MIN_PAROL = 10;
        // MIN_GELIR = 600.0;
    }
}