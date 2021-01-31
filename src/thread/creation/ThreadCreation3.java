package thread.creation;

public class ThreadCreation3 {
    public static void main(String [] args) {
        Thread thread = new TaskThread();
        thread.start();
    }

    public static class TaskThread extends Thread {
        @Override
        public void run(){
            System.out.println("Hello from new thread");
        }
    }
}
