import runnable.RunnableCountEven;
import thread.CountThread;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        CountThread countThread = new CountThread();
//        countThread.start();

        Thread threadCountEven = new Thread(new RunnableCountEven());
//        threadCountEven.start();

        // Sử dụng runnable tối ưu hơn

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 10 ; i++) {
                    if (i % 2 != 0){
                        System.out.println(i);
                    }
                }
            }
        });
        thread3.start();
        thread3.join();
        threadCountEven.start();
        threadCountEven.join();
        countThread.start();
//        Thread threadCountMinute = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 1; i <= 60 ; i++) {
//                    System.out.println(i);
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//            }
//        });
//        threadCountMinute.start();
    }
}