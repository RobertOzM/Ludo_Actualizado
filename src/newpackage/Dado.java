package newpackage;
/**
 *
 * @author OROZCO
 */
public class Dado {
        public void lanzardado(){
        int dado;
        //int repetir = 0;
        
        dado = (int)(Math.random()*6)+1;
        System.out.println("El dado muestra: "+dado);
        //repetir = dado;
        
        /*if (dado == 6){
            repetir = dado + dado;
            lanzardado(repetir);                 //Hallar manera para que al dar 6, se repita turno
            System.out.println("sube "+repetir);
            
        }*/
        
    }
}
