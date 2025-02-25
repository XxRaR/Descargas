
import it.sauronsoftware.junique.JUnique;



public class Main {
    public static void main(String[] args){
        String id = "krupf";
        try{
            JUnique.acquireLock(id);
            Frame f = new Frame();
            f.setLocationRelativeTo(null);
            f.setVisible(true);
            
        } catch (Exception ex){
            System.out.println("la aplicacion ya se encuentra corriendo");
            System.exit(0);
        }
    }
}
