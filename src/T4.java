public class T4 {
    public static void main(String[] args) {

        int a = 15;
        int b = 40;

        System.out.println("Əvvəl: a=" + a + ", b=" + b);

        int temp = a; // a-nin dəyərini temp-də saxladıq
        a = b;        // b-nin dəyərini a-ya verdik
        b = temp;     // temp-də saxlanan köhnə a dəyərini b-yə verdik

        System.out.println("Sonra: a=" + a + ", b=" + b);
    }
}