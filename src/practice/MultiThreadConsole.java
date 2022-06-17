package practice;

public class MultiThreadConsole {
    public static void main(String[] args) {
        Thread aThread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    System.out.println("I'm "+Thread.currentThread().getName());
                }
            }
        });

        Thread bThread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    System.out.println("I'm "+Thread.currentThread().getName());
                }
            }
        });
        aThread.setName("aThread");
        bThread.setName("bThread");
        aThread.start();
        bThread.start();
    }

}
