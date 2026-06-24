public class T7 {
    public static void main(String[] args) {

        double temp = 36.8;
        boolean temperaturNormaldir = temp > 36 && temp < 37.5;

        int suret = 95;
        int yanacaq = 0;
        boolean hereketEdeBiler = (suret > 0 && suret < 120) || yanacaq > 0;

        boolean aktiv = false;
        double balans = -50.0;
        boolean problemVar = !aktiv || balans < 0;

        String ad = "Anar";
        int yas = 22;
        boolean yetkindir = ad.length() > 0 && yas > 18;

        System.out.println(temperaturNormaldir);
        System.out.println(hereketEdeBiler);
        System.out.println(problemVar);
        System.out.println(yetkindir);
    }
}
