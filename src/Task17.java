public class Task17 {
    public static void main(String[] args) {

        String s1 = "test";
        String s2 = "test";
        String s3 = "TEST";

        System.out.println(s1.equals(s2));                // true - ikisinin də içində "test" yazılıb
        System.out.println(s1.equals(s3));                // false - "test" və "TEST" fərqlidir
        System.out.println(s1.equalsIgnoreCase(s3));      // true - böyük və kiçik hərfə baxmır
        System.out.println(s1.equals("  test  ".trim())); // true - trim() boşluqları silir

        String s4 = new String("test");

        System.out.println(s1 == s2); // true - nəticə true çıxdı
        System.out.println(s1 == s4); // false - buna görə String müqayisəsində equals() istifadə etmək lazımdır

    }
}