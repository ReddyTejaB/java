public class ExOnForLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("This is Even " + i);
            } else {
                System.out.println("This is Odd " + i);
            }
        }
    }
}
