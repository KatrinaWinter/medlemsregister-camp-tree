public class Main {
    public static void main(String[] args) {
        String namn1 = "Kim";
        int medlemsnummer1 = 1001;

        String namn2 = "Moa";
        int medlemsnummer2 = 1002;

        // BUGG: Vi råkar para ihop Kims namn med Moas nummer!
        System.out.println(namn1 + " " + medlemsnummer2);
    }
}
