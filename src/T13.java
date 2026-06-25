    public class T13 {
    public static void main(String[] args) {

        String metn = " Java proqramlaşdırma dili çox güclüdür! ";

        System.out.println("Trim-dən əvvəl uzunluq: " + metn.length());
        System.out.println("Trim-dən sonra uzunluq: " + metn.trim().length());
        System.out.println("Fərq: " + (metn.length() - metn.trim().length()));

        System.out.println("Java sözü varmı? " + metn.contains("Java"));

        System.out.println("Böyük hərflə yazanda da varmı? "
                + metn.toUpperCase().contains("JAVA"));

        System.out.println("Əvəz edilmiş mətn: "
                + metn.replace("proqramlaşdırma", "programming"));

        System.out.println("İlk 4 hərf: "
                + metn.trim().substring(0,4));

        System.out.println("! işarəsi varmı? "
                + metn.contains("!"));

        System.out.println("Kiçik hərflə və trim edilmiş: "
                + metn.trim().toLowerCase());
    }
}
