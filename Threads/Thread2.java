class MyTask implements Runnable{
    public void run(){
        System.out.println("Thread is running");
    }
}

public class Thread2 {
    public static void main(String[] args){
        MyTask task = new MyTask();
        Thread t = new Thread(task);
        t.start();
    }
}
