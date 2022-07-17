package newpackage;
/**
 *
 * @author OROZCO
 */
public class jugador {
        
    Ficha f1 = new Ficha();
    Ficha f2 = new Ficha();
    Ficha f3 = new Ficha();
    Ficha f4 = new Ficha();

    String moverficha(int dado, Ficha fich) { //R: será que cambiamos tipo de variable de dato (no funcionó)

        fich.posfinal = fich.posfinal + dado;
        if (fich.posfinal == 57) {

            return "La ficha ha llegado a la casilla final";

        } else if (fich.posfinal > 57) {

            fich.posfinal = fich.posfinal - dado;

            return "El numero " + dado + " es mayor a las casillas que te faltan, por lo tanto, te quedas en el mismo lugar";
        }
        return "el dado arrojó " + dado + " te encuentras en la casilla " + fich.posfinal;

    }

    String sacarficha(int dado, Ficha fich) {

        if (dado == 6 || dado == 1) {

            return "Has salido, ahora volveras a lanzar para moverte" + this.moverficha(dado, fich);
        }
        return "No has podido salir, has perdido el turno ";

    }
    
    
    boolean finalrecorrido(){
        return f1.posfinal ==57 && f2.posfinal ==57 && f3.posfinal == 57 && f4.posfinal== 57;
    
       
    }
   
    String ganador(){
        if(finalrecorrido()){
        
            return "Has llegado al final, todas tus piezas han logrado llegar a la base! ";
        
        }
        return null;
    }

}
