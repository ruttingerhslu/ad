package ch.hslu.sw07.ex01;
import java.math.BigInteger;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class PrimeNumberGenerator {
    private static final int NUM_THREADS = 16;
    private static final int NUM_PRIMES = 100;
    private static final AtomicInteger primeCount = new AtomicInteger();

    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(NUM_THREADS);
        while (primeCount.get() <= NUM_PRIMES) {
            executor.submit(() -> {
                BigInteger bi = new BigInteger(1024, new Random());
                if (bi.isProbablePrime(Integer.MAX_VALUE)) {
                    synchronized (PrimeNumberGenerator.class) {
                        primeCount.getAndIncrement();
                        System.out.println(primeCount.get() + ": " + bi.toString().substring(0, 20) + "...");
                    }
                }
            });
        }
        executor.shutdown();
    }
}