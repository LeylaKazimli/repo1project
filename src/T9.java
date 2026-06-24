public class T9 {
    public static void main(String[] args) {

        String kod = "  abb-2024  ";

        System.out.println(kod.length());                     // 12
        // Gözlənilən 8 deyil.
        // Çünki əvvəl və sonda olan boşluqlar da sayılır.

        System.out.println(kod.contains("ABB"));             // false
        // contains() case-sensitive-dir.
        // "abb" və "ABB" fərqli sayılır.

        System.out.println(kod.trim() == "abb-2024");        // false
        // String müqayisəsi üçün == istifadə edilmir.
        // equals() istifadə olunmalıdır.

        System.out.println(kod.toUpperCase().contains("ABB")); // true
        // Bu hissə düzgündür.

        // Düzgün variantlar:

        System.out.println(kod.trim().length());             // 8
        System.out.println(kod.toUpperCase().contains("ABB")); // true
        System.out.println(kod.trim().equals("abb-2024"));  // true
    }
}