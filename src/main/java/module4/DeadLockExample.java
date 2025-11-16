package module4;

public class DeadLockExample {
    private Object lock1 = new Object();
    private Object lock2 = new Object();

    public void method1(){
        synchronized (lock1){
                System.out.println("Поток " + Thread.currentThread().getName() + " захватил lock1");

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            synchronized (lock2){
                System.out.println("Поток " + Thread.currentThread().getName() + " захватил lock2");
            }
        }
    }

    public void method2(){
        synchronized (lock2){
            System.out.println("Поток " + Thread.currentThread().getName() + " захватил lock2");

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            synchronized (lock1){
                System.out.println("Поток " + Thread.currentThread().getName() + " захватил lock1");
            }
        }
    }

    public static void main(String[] args) {
        DeadLockExample deadLockExample = new DeadLockExample();

        Thread thread0 = new Thread(() -> {
            deadLockExample.method1();
        });

        Thread thread1 = new Thread(() -> {
            deadLockExample.method2();
        });

        thread0.start();
        thread1.start();
    }
}
