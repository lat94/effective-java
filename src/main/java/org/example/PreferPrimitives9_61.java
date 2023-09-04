package org.example;

public class PreferPrimitives9_61 {
    public static void main(String[] args) {
        long start1 = System.currentTimeMillis();
        Long sum = 0L;
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        long end1 = System.currentTimeMillis();
        System.out.println("sum1: " + sum);

        long duration1 = (end1 - start1);
        System.out.println("sum1: Elapsed Time in milli seconds: " + duration1);

        long start2 = System.currentTimeMillis();
        long sum2 = 0L;
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum2 += i;
        }
        long end2 = System.currentTimeMillis();
        System.out.println("sum2: " + sum2);

        long duration2 = (end2 - start2);
        System.out.println("sum2: Elapsed Time in milli seconds: " + duration2);

        System.out.println("difference: " + duration1 / duration2);

    }
}
