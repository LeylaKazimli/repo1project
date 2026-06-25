public class T12 {
    public static void main(String[] args) {

        String tamAd = "nigar əliyeva";

        int bosluqIndeksi = tamAd.indexOf(" ");

        String ad = tamAd.substring(0, bosluqIndeksi);
        String soyad = tamAd.substring(bosluqIndeksi + 1);

        String formatliAd =
                ad.substring(0,1).toUpperCase()
                        + ad.substring(1).toLowerCase();

        String formatliSoyad =
                soyad.substring(0,1).toUpperCase()
                        + soyad.substring(1).toLowerCase();

        System.out.println("Tam ad (formatlanmış): " + formatliAd + " " + formatliSoyad);
        System.out.println("Yalnız ad: " + formatliAd);
        System.out.println("Yalnız soyad: " + formatliSoyad);
        System.out.println("Baş hərflər: "
                + ad.substring(0,1).toUpperCase()
                + "."
                + soyad.substring(0,1).toUpperCase()
                + ".");
        System.out.println("Böyük hərflə: " + tamAd.toUpperCase());
    }
}