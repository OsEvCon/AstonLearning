package module4;

import java.util.concurrent.CountDownLatch;

public class LiveLockExample {
    static volatile boolean flagA = false;
    static volatile boolean flagB = false;
    static final CountDownLatch startLatch = new CountDownLatch(2);


    public static void main(String[] args) {
        Thread A = new Thread(() -> {
            String name = Thread.currentThread().getName();
            startLatch.countDown();

            try {
                startLatch.await();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            while (true) {
                    flagA = true;
                System.out.println(name + ": Начинаю работать");
                sleep(100);

                if (flagB) {
                    System.out.println(name + ": Второй поток работает. Останавливаюсь.");
                    flagA = false;
                    sleep(600);
                    continue;
                }

                sleep(400);
                System.out.println(name + ": Заканчиваю работать");
                flagA = false;
                break;

            }
        }, "Thread A");

        Thread B = new Thread(() -> {
            String name = Thread.currentThread().getName();
            startLatch.countDown();

            try {
                startLatch.await();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            while (true) {
                flagB = true;
                System.out.println(name + ": Начинаю работать");
                sleep(100);

                if (flagA) {
                    System.out.println(name + ": Второй поток работает. Останавливаюсь.");
                    flagB = false;
                    sleep(600);
                    continue;
                }

                sleep(400);
                System.out.println(name + ": Заканчиваю работать");
                flagB = false;
                break;
            }
        }, "Thread B");

        A.start();
        B.start();

    }

    public static void sleep(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
