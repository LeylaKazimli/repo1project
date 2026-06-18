
    public class Task18 {
    public static void main(String[] args) {

        String tamAd = "leyla hüseynova";

        String duzeldilmisAd =
                tamAd.substring(0, 1).toUpperCase()
                        + tamAd.substring(1, 5)
                        + " "
                        + tamAd.substring(6, 7).toUpperCase()
                        + tamAd.substring(7);

        System.out.println("Baş hərflər böyük: " + duzeldilmisAd);

        System.out.println("Ümumi uzunluq: " + tamAd.length());

        System.out.println("Adın ilk 5 hərfi: " + tamAd.substring(0, 5));

        System.out.println("Boşluq varmı? " + tamAd.contains(" "));

        System.out.println("Ad leyla ilə başlayırmı? "
                + tamAd.startsWith("leyla"));

        System.out.println("Böyük hərflə tam ad: "
                + tamAd.toUpperCase());
    }
}