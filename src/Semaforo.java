import javax.sql.rowset.spi.SyncResolver;

public class Semaforo {
    
    public int valore;

    public Semaforo(int valore) {
        this.valore = valore;
    }

    public int getValore() {
        return valore;
    }

    public synchronized void p(){

        while(valore == 0){

            try{
                
                
                System.out.println();
                System.out.println("---------------" + Thread.currentThread().getName() + " in attesa ai box --------------------");
                System.out.println();
                
                wait();
            }
            catch(Exception e){

                e.getMessage();

            }
        }
        valore--;
    }

    public synchronized void v(){

        valore++;
        notify();
    }
}
