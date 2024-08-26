class MyThread extends Thread {
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName());
            System.out.println("Child Thread");
        }
    }
}

public class ThreadM {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName());
            System.out.println("Main Thread");
        }
    }
}