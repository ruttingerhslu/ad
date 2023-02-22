package ch.hslu.sw01.ex02;

public class RuntimeExercise {
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        task(21);
        System.out.println("sleep time: " + (System.currentTimeMillis() - start));
    }

    public static void task(final int n) throws InterruptedException {
        int t1 = 0, t2 = 0, t3 = 0;
        task1(); task1(); task1(); task1();
        t1 += 4;
        for (int i = 0; i < n; i++) {
            task2(); task2(); task2();
            t2 += 3;
            for (int j = 0; j < n; j++) {
                task3(); task3();
                t3 += 2;
            }
        }
        System.out.println("task1: " + t1);
        System.out.println("task2: " + t2);
        System.out.println("task3: " + t3);
    }

    public static void task1() throws InterruptedException {
        Thread.sleep(2);
    }
    public static void task2() throws InterruptedException {
        Thread.sleep(5);
    }
    public static void task3() throws InterruptedException {
        Thread.sleep(3);
    }
}
