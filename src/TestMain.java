public class TestMain {

    public static void main(String[] args) {

        if (Main.add(10, 20) != 30) {
            throw new RuntimeException("Test 1 failed");
        }

        if (Main.add(5, 5) != 10) {
            throw new RuntimeException("Test 2 failed");
        }

        System.out.println("All tests passed!");
    }
}
