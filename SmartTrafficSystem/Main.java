package SmartTrafficSystem;

public class Main {
    static class TrafficJunction extends Thread {
        private int delay;

        TrafficJunction(String name, int delay) {
            super(name);
            this.delay = delay;
        }

        public void run() {
            for (int i = 1; i <= 3; i++) {
                System.out.println(getName() + " status: Signal cycle " + i + " - traffic is being managed");
                try {
                    Thread.sleep(delay);
                } catch (InterruptedException e) {
                    interrupt();
                    return;
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread north = new TrafficJunction("North Junction", 500);
        Thread south = new TrafficJunction("South Junction", 700);
        Thread east = new TrafficJunction("East Junction", 900);

        north.start();
        south.start();
        east.start();

        north.join();
        south.join();
        east.join();
    }
}
