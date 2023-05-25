public class Box {
    
    public void cambioGomme(String nome){

        int randSec = (int)((Math.random() * 5) + 1);
        randSec = randSec*1000;

        System.out.println();
        System.out.println(nome + " sta cambiando le gomme");
        System.out.println();
        
        try {
            
            Thread.sleep(randSec);

        } catch (InterruptedException e) {

            e.printStackTrace();

        }


    }
}
