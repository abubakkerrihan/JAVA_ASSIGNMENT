package twoA;

public class PerformanceTest {
    public static void main(String[] args) {

        int iterations = 10000;

        // StringBuffer Test
        StringBuffer sbf = new StringBuffer();
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < iterations; i++) {
            sbf.append("AIET");
        }

        long endTime = System.currentTimeMillis();
        System.out.println("StringBuffer Time: " + (endTime - startTime) + " ms");

        // StringBuilder Test
        StringBuilder sbd = new StringBuilder();
        startTime = System.currentTimeMillis();

        for (int i = 0; i < iterations; i++) {
            sbd.append("AIET");
        }

        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder Time: " + (endTime - startTime) + " ms");
    }
}