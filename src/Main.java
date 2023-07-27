public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        System.out.println(bins.sum("111", "1010")); // 7 + 10=17  -> 111 + 1010 = 10001
        System.out.println(bins.mult("101", "100")); // 5 * 4 = 20 -> 101 + 100 = 10100
    }
}
