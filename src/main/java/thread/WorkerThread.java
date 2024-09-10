package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class WorkerThread implements Runnable {
    private String message;

    public WorkerThread(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " (Start) Message = " + message);
        processMessage(); // mesajı emal etmək üçün bir funksiya
        System.out.println(Thread.currentThread().getName() + " (End)"); // iş ipi sona çatır
    }

    private void processMessage() {
        try {
            Thread.sleep(2000); // tapşırığı icra edərkən 2 saniyə gecikmə
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class ThreadPoolExample {
    public static void main(String[] args) {
        // 5 iş ipindən ibarət olan bir iş ipi hovuzu yaradırıq
        ExecutorService executor = Executors.newFixedThreadPool(5);

        // 10 tapşırıq icra etmək üçün işləri göndəririk
        for (int i = 0; i < 10; i++) {
            Runnable worker = new WorkerThread("Message " + i);
            executor.submit(worker);
        }

        // Yeni işlərin qəbulunu dayandırır
        executor.shutdown();

        try {
            // Mövcud tapşırıqların bitməsini gözləyir
            if (!executor.awaitTermination(60, TimeUnit.SECONDS)) {
                executor.shutdownNow();
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
        }

        System.out.println("All tasks completed.");
    }


    }



