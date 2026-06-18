    public class Bonus {
    public static void main(String[] args) {

        String ad = "Leyla";
        int yas = 31;
        double ayliqGelir = 7000;

        double kreditMeblegi = 10000;
        int muddet = 24;
        double faiz = 12;

        boolean tarix = true;

        double umumiFaiz = kreditMeblegi * faiz / 100;

        double ayliqOdenis =
                (kreditMeblegi + umumiFaiz) / muddet;

        double gelirNisbeti =
                (ayliqOdenis / ayliqGelir) * 100;

        boolean yasSerti =
                yas >= 21 && yas <= 65;

        boolean gelirSerti =
                ayliqGelir > 800;

        boolean meblegSerti =
                kreditMeblegi >= 300
                        && kreditMeblegi <= 50000;

        boolean tehlukesizHedd =
                gelirNisbeti < 40;

        boolean tesdiqlenir =
                yasSerti
                        && gelirSerti
                        && meblegSerti
                        && tehlukesizHedd
                        && tarix;

        System.out.println("Müştəri adı: " + ad);
        System.out.println("Yaş: " + yas);
        System.out.println("Aylıq gəlir: " + ayliqGelir);
        System.out.println("Kredit məbləği: " + kreditMeblegi);
        System.out.println("Müddət (ay): " + muddet);
        System.out.println("İllik faiz: " + faiz);
        System.out.println("Kredit tarixi: " + tarix);

        System.out.println();

        System.out.println("Ümumi faiz: " + umumiFaiz);
        System.out.println("Aylıq ödəniş: " + ayliqOdenis);
        System.out.println("Gəlirə nisbət: " + gelirNisbeti + "%");

        System.out.println();

        System.out.println("Yaş şərti: " + yasSerti);
        System.out.println("Gəlir şərti: " + gelirSerti);
        System.out.println("Məbləğ şərti: " + meblegSerti);
        System.out.println("40%-dən azdırmı? " + tehlukesizHedd);

        System.out.println();

        System.out.println("Kredit TƏSDİQLƏNİR? "
                + tesdiqlenir);
    }
}
