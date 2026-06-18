public class Task14 {
    public static void main(String[] args) {

        int n = 84;

        boolean cutdur = n % 2 == 0;
        boolean musbetdir = n > 0;
        boolean uceBolunur = n % 3 == 0;
        boolean yeddiyeBolunur = n % 7 == 0;
        boolean ucVeYeddi = (n % 3 == 0) && (n % 7 == 0);
        boolean ondanBoyukYuzdenKicik = (n > 10) && (n < 100);

        System.out.println("n = 84");
        System.out.println("Cütdür? " + cutdur);
        System.out.println("Müsbətdir? " + musbetdir);
        System.out.println("3-ə bölünür? " + uceBolunur);
        System.out.println("7-yə bölünür? " + yeddiyeBolunur);
        System.out.println("Həm 3-ə, həm 7-yə bölünür? " + ucVeYeddi);
        System.out.println("10-dan böyük, 100-dən kiçik? " + ondanBoyukYuzdenKicik);

        System.out.println();

        n = 105;

        cutdur = n % 2 == 0;
        musbetdir = n > 0;
        uceBolunur = n % 3 == 0;
        yeddiyeBolunur = n % 7 == 0;
        ucVeYeddi = (n % 3 == 0) && (n % 7 == 0);
        ondanBoyukYuzdenKicik = (n > 10) && (n < 100);

        System.out.println("n = 105");
        System.out.println("Cütdür? " + cutdur);
        System.out.println("Müsbətdir? " + musbetdir);
        System.out.println("3-ə bölünür? " + uceBolunur);
        System.out.println("7-yə bölünür? " + yeddiyeBolunur);
        System.out.println("Həm 3-ə, həm 7-yə bölünür? " + ucVeYeddi);
        System.out.println("10-dan böyük, 100-dən kiçik? " + ondanBoyukYuzdenKicik);
    }
}