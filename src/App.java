public class App {
    public static void main(String[] args) throws Exception {
        
        Box b = new Box();
        Semaforo s = new Semaforo(2);
        Macchina m1 = new Macchina(1, "Leclerc", "Ferrari", b, s);
        Macchina m2 = new Macchina(2, "Sainz", "Ferrari", b, s);
        Macchina m3 = new Macchina(3, "Perez", "Redbull", b, s);
        Macchina m4 = new Macchina(4, "Russel", "Mercedes", b, s);
        Macchina m5 = new Macchina(5, "Hamilton", "Mercedes", b, s);

        m1.start();
        m2.start();
        m3.start();
        m4.start();
        m5.start();

        m1.join();
        m2.join();
        m3.join();
        m4.join();
    }
}
