/**
 * 
 * @author sommo samu
 */


public class Macchina extends Thread{

    /**
     * id scuderia
     */
    private int num;

    /**
     * nome pilota
     */
    private String pilota;
    
    /**
     * nome scuderia
     */
    private String scuderia;
    
    /**
     * box per pit stop
     */
    private Box box;
    
    /**
     * semaforo
     */
    private Semaforo s;


    /**
     * @param num numero della scuderia
     * @param pilota nome del pilora
     * @param scuderia nome della scuderia
     * @param box box per pitstop
     * @param s semaforo
     */
    public Macchina(int num, String pilota, String scuderia, Box box, Semaforo s){

        this.num = num;
        this.pilota = pilota;
        this.scuderia = scuderia;
        this.box = box;
        this.s = s;
        this.setName(pilota);

    }

    /**
     * @deprecated
     * @return
     */
    public int getNum() {
        return num;
    }

    /**
     * @deprecated
     * @return
     */
    public String getPilota() {
        return pilota;
    }

    /**
     * @deprecated
     * @return
     */
    public String getScuderia() {
        return scuderia;
    }

    /**
     * @deprecated
     * @return
     */
    public Box getBox() {
        return box;
    }

    /**
     * @deprecated
     * @return
     */
    public Semaforo getS() {
        return s;
    }

    /**
     * metodo che serve a far andare il thread, gestisce i giri e il cambio gomme, appena il pilota finisce la gara, lo dice
     */
    public void run(){

        for(int i = 1; i<11; i++){

            int randSec = (int)((Math.random() * 4) + 1);
            randSec = randSec*1000;

            try {
                
                Thread.sleep(randSec);
                System.out.println( pilota + " GIRO-" + i + " Finito");

            } catch (InterruptedException e) {

                e.printStackTrace();

            }

            if(i%3 == 0){

                s.p();

                box.cambioGomme(pilota);

                s.v();

            }

        }

        System.out.println("|" + pilota + " HA FINITOOOOOO |");
    }
    
}
