public class BankingApplication {
    static class BankingTask implements Runnable {
        private String activity;
        private int delay;

        BankingTask(String activity, int delay) {
            this.activity = activity;
            this.delay = delay;
        }

        public void run() {
            for (int i = 1; i <= 3; i++) {
                System.out.println(Thread.currentThread().getName() + " - " + activity + " - execution " + i);
                try {
                    Thread.sleep(delay);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new BankingTask("Transaction processing", 500), "Transaction Thread");
        Thread t2 = new Thread(new BankingTask("Balance updating", 700), "Balance Thread");
        Thread t3 = new Thread(new BankingTask("SMS notification", 900), "SMS Thread");

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();
    }
}
