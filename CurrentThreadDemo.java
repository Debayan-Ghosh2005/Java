
class CurrentThreadDemo {
    public static void main(String args[]) {
        Thread t = Thread.currentThread();
        System.out.println("Current thread: " + t);
        t.setName("My Thread");
        System.out.println("After name change: " + t);
        NewThread t1 = new NewThread("Thread-1");
        NewThread t2 = new NewThread("Thread-2");
        NewThread t3 = new NewThread("Thread-3");
        t1.t.start();
        t2.t.start();
        t3.t.start();
        try {
            for(int n = 5; n > 0; n--)
 {
                System.out.println(n);
                Thread.sleep(1000);            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");        }
        System.out.println("Main thread exiting.");
    }}
class NewThread implements Runnable {
    Thread t;
    String name;
    NewThread(String threadName) {
        name = threadName;
        t = new Thread(this, name);
        System.out.println("Child thread: " + t);    }
    public void run() {
        try {
            for(int i = 1; i <= 10; i++) {
                System.out.println(t.getName() + ": " + i);
                Thread.sleep(500);            }        } 
catch (InterruptedException e) {
            System.out.println(t.getName() + " interrupted.");        }
        System.out.println("Exiting " + t.getName());
    }}
