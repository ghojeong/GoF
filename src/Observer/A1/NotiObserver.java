public class NotiObserver implements Observer {
    public void update(NumberGenerator generator) {
        int n = generator.getNumber();
        if (n > 30) {
            System.out.println("NotiObserver: Number Exceeds 30!");
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
    }
}
