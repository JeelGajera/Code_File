//Practical 12.1
public class Practical12 extends Thread{
    public void run(){
        for(int i=1;i<5;i++){
            try{
                Thread.sleep(500);
            }
            catch (InterruptedException e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
    public static void main(String[] args){
        Practical12 t1 = new Practical12();
        Practical12 t2 = new Practical12();

        t1.start();
        t2.start();
    }
}

//Practical 12.2
class MyTask implements Runnable {
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        try {
            System.out.printf("  Start of %s\n",name);
            Thread.sleep(1500);
            System.out.printf("  End of %s\n",name);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Practical12 {
    public static void main(String[] args) throws InterruptedException {
        MyTask task = new MyTask();
        System.out.println("1. Working with multiple threads using thread join:");
        demoThreadJoin(task);
        System.out.println("2. Working with multiple threads WITHOUT thread join:");
        demoWithoutThreadJoin(task);

    }

    private static void demoWithoutThreadJoin(MyTask task) throws InterruptedException {
        Thread thread1 = new Thread(task, "Thread-1 without join");
        Thread thread2 = new Thread(task, "Thread-2 without join");
        Thread thread3 = new Thread(task, "Thread-3 without join");
        Thread thread4 = new Thread(task, "Thread-4 without join");

        //Start thread 1
        thread1.start();

        //Start thread 2
        thread2.start();

        //Start thread 3
        thread3.start();

        //Start thread 4
        thread4.start();
    }

    private static void demoThreadJoin(MyTask task) throws InterruptedException {
        Thread thread1 = new Thread(task, "Thread-1 using join");
        Thread thread2 = new Thread(task, "Thread-2 using join");
        Thread thread3 = new Thread(task, "Thread-3 using join");
        Thread thread4 = new Thread(task, "Thread-4 using join");

        //Start thread 1
        thread1.start();
        thread1.join();

        //start thread 2
        thread2.start();
        thread2.join();

        //Start thread 3
        thread3.start();
        thread3.join();

        //start thread 4
        thread4.start();
        thread4.join();
    }
}

//Practical 12.3
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Practical12 {
    private static Integer sum = 0;
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();

        for (int i = 0; i < 10; i++) {
            executor.execute(new AddOne());
        }

        executor.shutdown();

        while (!executor.isTerminated()) {
        }

        System.out.println("sum = " + sum);
    }

    private static class AddOne implements Runnable {
        public void run() {
            sum++;
        }
    }
}
