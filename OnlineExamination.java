class RemainingTime implements Runnable {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + " - Remaining time: " + (30 - i * 5) + " minutes");
            try { Thread.sleep(1000); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        } 
    }
}

class AutoSave implements Runnable {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + " - Auto-saving answers");
            try { Thread.sleep(1500); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        }
    }
}

class NetworkCheck implements Runnable {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + " - Checking network connection");
            try { Thread.sleep(2000); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
        }
    }
}

public class OnlineExamination {
    public static void main(String[] args) {
        Thread timeThread = new Thread(new RemainingTime());
        Thread saveThread = new Thread(new AutoSave());
        Thread networkThread = new Thread(new NetworkCheck());

        timeThread.setName("Remaining-Time Thread");
        saveThread.setName("Auto-Save Thread");
        networkThread.setName("Network-Check Thread");

        timeThread.start();
        saveThread.start();
        networkThread.start();
    }
}
