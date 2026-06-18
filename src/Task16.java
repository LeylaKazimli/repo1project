public class Task16 {
    public static void main(String[] args) {

        String metn = " Salam, ABB Bank! ";

        System.out.println("Uzunluğu: " + metn.length());

        System.out.println("trim() sonra uzunluğu: " + metn.trim().length());

        System.out.println("Böyük hərflə: " + metn.toUpperCase());

        System.out.println("Kiçik hərflə: " + metn.toLowerCase());

        System.out.println("\"ABB\" var mı? " + metn.contains("ABB"));

        System.out.println("\"bank\" var mı? " + metn.contains("bank"));

        System.out.println("Bank -> Kredit: " +
                metn.replace("Bank", "Kredit"));

        System.out.println("Salam ilə başlayır mı? " +
                metn.trim().startsWith("Salam"));
    }
}