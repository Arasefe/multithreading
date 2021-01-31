package thread.creation;

public class ThreadCreation1 {
    public static void main(String[] args) {
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("I am now in thread: "+Thread.currentThread().getName());
            }
        });

        System.out.println("This is the Thread "+Thread.currentThread().getName()+" before staring a new Thread");
        thread.start();
        thread.setName("Aras");
    }
}
