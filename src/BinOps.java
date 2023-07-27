public class BinOps {
    public String sum(String a, String b) { // Перевод чисел из двоичной записи в строках в int, сложение и перевод обратно в двоичную запись
        int i1 = Integer.parseInt(a, 2);
        int i2 = Integer.parseInt(b, 2);
        int result = i1 + i2;
        return Integer.toBinaryString(result);
    }

    public String mult(String a, String b) { // Перевод чисел из двоичной записи в строках в int, перемножение и перевод обратно в двоичную запись
        int i1 = Integer.parseInt(a, 2);
        int i2 = Integer.parseInt(b, 2);
        int result = i1 * i2;
        return Integer.toBinaryString(result);
    }
}
