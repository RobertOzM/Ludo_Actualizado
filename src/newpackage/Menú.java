package newpackage;

import java.util.Scanner;

/**
 *
 * @author OROZCO
 */
public class Menú {
    public static void main(String[] args) {
   //ACTUALIZACION 1
   /*
       public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Tablero t = new Tablero();
        Ficha ficha = new Ficha();
        jugador j = new jugador();

//DADO
        int a = 0;
//
//MENU
        do {
            System.out.println("");
            System.out.println("________________________________");
            System.out.println("///////////////////////////////");
            System.out.println("///      BIENVENIDO A       ///");
            System.out.println("///       LUDO STAR         ///");
            System.out.println("///////////////////////////////");
            System.out.println("");
            System.out.println("Menú:");
            System.out.println("1.-¡JUGAR! ");
            System.out.println("2.-Reglas");
            System.out.println("_________________________________");

            int m = entrada.nextInt();
            switch (m) {
                case 1:
                    for (int i = 0; i < 50; i++) {
                        while (i == 1) {
                            System.out.println("presiona 1 para lanzar dado");
                            int lanzar = entrada.nextInt();
                            if (lanzar == 1) {
                                int dado;
                                dado = (int) (Math.random() * 6) + 1;
                                System.out.println("El dado muestra: " + dado);
                                if (dado == 6 || dado == 1) {
                                    j.sacarficha(0, j.f2);
                                    System.out.println("Presione 1 para lanzar dado de la f2");
                                    lanzar = entrada.nextInt();
                                    if (lanzar == 1) {
                                     System.out.println(j.moverficha(dado, j.f2));   
                                    }
                                }
                                System.out.println(j.moverficha(dado, j.f1));
                            }
                        }
                    }
                    break;

                case 2:
                    reglas Reglas = new reglas();
                    Reglas.Reglas();
                    break;
            }
        } while (a < 5);
   */
   
   //ACTUALIZACION 2_____________________________________________________________
   /*
                   case 1:
                    for (int i = 0; i < 50; i++) {
                        while (i == 1) {
                            System.out.println("presiona 1 para lanzar dado");
                            int lanzar = entrada.nextInt();
                            if (lanzar == 1) {
                                int dado;
                                dado = (int) (Math.random() * 6) + 1;
                                System.out.println("El dado muestra: " + dado);
                                if (dado == 6 || dado == 1) {
                                    j.sacarficha(0, j.f1);
                                    System.out.println("Presione 1 para lanzar dado de la F1");
                                    int lanzarU = entrada.nextInt();
                                    if (lanzarU == 1) {
                                     dado = (int) (Math.random() * 6) + 1;
                                     System.out.println(j.moverficha(dado, j.f1));   
                                    }
                                }
                            }
                        }
                    }
                    break;
   */
   
   
   //******ACTUALIZACION 3************
   //public class Ludo {

    //public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Tablero t = new Tablero();
        Ficha ficha = new Ficha();
        jugador jU = new jugador();
        jugador jD = new jugador();
        jugador jT = new jugador();
        jugador jC = new jugador();

//DADO
        int a = 0;
//
//MENU
        do {
            System.out.println("");
            System.out.println("________________________________");
            System.out.println("///////////////////////////////");
            System.out.println("///      BIENVENIDO A       ///");
            System.out.println("///       LUDO STAR         ///");
            System.out.println("///////////////////////////////");
            System.out.println("");
            System.out.println("Menú:");
            System.out.println("1.-¡JUGAR! ");
            System.out.println("2.-Reglas");
            System.out.println("_________________________________");

            int m = entrada.nextInt();
            switch (m) {
                case 1:
                    for (int i = 0; i < 50; i++) {
                        while (i == 1) {
                            System.out.println("presiona 1 para lanzar dado");
                            int lanzar = entrada.nextInt();
                            if (lanzar == 1) {
                                int dado;
                                dado = (int) (Math.random() * 6) + 1;
                                System.out.println("El dado muestra: " + dado);
                                if (dado == 6 || dado == 1) {
                                    jU.sacarficha(0, jU.f1);
                                    System.out.println("Presione 1 para lanzar dado de la F1");
                                    int lanzarU = entrada.nextInt();
                                    if (lanzarU == 1) {
                                     dado = (int) (Math.random() * 6) + 1;
                                     System.out.println(jU.moverficha(dado, jU.f1));   
                                    }
                                }
                            }
                        }
                    }
                    break;

                case 2:
                    reglas Reglas = new reglas();
                    Reglas.Reglas();
                    break;
            }
        } while (a < 5);
  }      
}
    
//********ACTUALIZACION 4 2:35********
/*
        Scanner entrada = new Scanner(System.in);
        Tablero t = new Tablero();
        Ficha ficha = new Ficha();
        jugador jU = new jugador();
        jugador jD = new jugador();
        jugador jT = new jugador();
        jugador jC = new jugador();

//DADO
        int a = 0;
//
//MENU
        do { //do de repetir el menú
            System.out.println("");
            System.out.println("________________________________");
            System.out.println("///////////////////////////////");
            System.out.println("///      BIENVENIDO A       ///");
            System.out.println("///       LUDO STAR         ///");
            System.out.println("///////////////////////////////");
            System.out.println("");
            System.out.println("Menú:");
            System.out.println("1.-¡JUGAR! ");
            System.out.println("2.-Reglas");
            System.out.println("_________________________________");

            int m = entrada.nextInt();
            switch (m) { //cases de opciones de menu
                case 1: //opcion de jugar
                    int i = 0;
                    do { //DO WHILE PARA INCREMENTO DE I, QUE SERÁ IGUAL A LOS TURNOS
                        while (i == 0) { //0 es rojo
                            System.out.println("****COLOR: Rojo****");
                            System.out.println("presiona 1 para lanzar dado");
                            int lanzar = entrada.nextInt();
                            if (lanzar == 1) {
                                int dado;                        //<---DADO (será que lo ponemos como variable global?())
                                dado = (int) (Math.random() * 6) + 1;
                                System.out.println("El dado muestra: " + dado);
                                if (dado == 6 || dado == 1) { //IF de Salida de casa
                                    System.out.println("Escoge el Numero de Ficha a salir de la casa");
                                    int escogers = entrada.nextInt();
                                    switch (escogers) { // Cases de escoger el numero de fichas
                                        case 1:
                                            jU.sacarficha(0, jU.f1);
                                            System.out.println("Presione 1 para lanzar dado de la F1");
                                            int lanzarU = entrada.nextInt();
                                            if (lanzarU == 1) {
                                                dado = (int) (Math.random() * 6) + 1;
                                                System.out.println(jU.moverficha(dado, jU.f1));
                                            }
                                            break;
                                        case 2:
                                            break;
                                        case 3:
                                            break;
                                        case 4:
                                            break;
                                    }
                                }
                                System.out.println("Escoge el numero de ficha"); //viniente de Lanzar==1
                                int escogerf = entrada.nextInt();
                                    switch (escogerf){
                                        case 1:
                                            if (){
                                                
                                            }
                                            break;
                                    }
                                
                            }
                        i++;
                        }
 
        while (i == 1) {

            i++;
        }
        while (i == 2) {

            i++;
        }
        while (i == 3) {

            i = 0;
        }

    }
    while (i == 5);
*/

////Actualizacion 5 4:28
/*
        Scanner entrada = new Scanner(System.in);
        Tablero t = new Tablero();
        Ficha ficha = new Ficha();
        jugador jU = new jugador();
        jugador jD = new jugador();
        jugador jT = new jugador();
        jugador jC = new jugador();

//DADO
        int a = 0;
//
//MENU
        do { //do de repetir el menú
            System.out.println("");
            System.out.println("________________________________");
            System.out.println("///////////////////////////////");
            System.out.println("///      BIENVENIDO A       ///");
            System.out.println("///       LUDO STAR         ///");
            System.out.println("///////////////////////////////");
            System.out.println("");
            System.out.println("Menú:");
            System.out.println("1.-¡JUGAR! ");
            System.out.println("2.-Reglas");
            System.out.println("_________________________________");

            int m = entrada.nextInt();
            switch (m) { //cases de opciones de menu
                case 1: //opcion de jugar
                    int i = 0;
                    do { //DO WHILE PARA INCREMENTO DE I, QUE SERÁ IGUAL A LOS TURNOS
                        while (i == 0) { //0 es rojo
                            System.out.println("****COLOR: Rojo****");
                            System.out.println("presiona 1 para lanzar dado");
                            int lanzar = entrada.nextInt();
                            if (lanzar == 1) {
                                int dado;                        //<---DADO (será que lo ponemos como variable global?())
                                dado = (int) (Math.random() * 6) + 1;
                                System.out.println("El dado muestra: " + dado);
                                if (dado == 6 || dado == 1) { //IF de Salida de casa
                                    System.out.println("Escoge el Numero de Ficha a salir de la casa");
                                    int escogers = entrada.nextInt();
                                    switch (escogers) { // Cases de escoger el numero de fichas
                                        case 1:
                                            jU.sacarficha(0, jU.f1);
                                            System.out.println("Presione 1 para lanzar dado de la F1");
                                            int lanzarU = entrada.nextInt();
                                            if (lanzarU == 1) {
                                                dado = (int) (Math.random() * 6) + 1;
                                                System.out.println(jU.moverficha(dado, jU.f1));
                                            }
                                            break;
                                        case 2:
                                            break;
                                        case 3:
                                            break;
                                        case 4:
                                            break;
                                    }
                                }
                                System.out.println("Escoge el numero de ficha"); //viniente de Lanzar==1
                                int escogerf = entrada.nextInt();
                                    switch (escogerf){
                                        case 1:
                                            jU.sacarficha(0, jU.f1);
                                            dado = (int) (Math.random() * 6) + 1;
                                            System.out.println(jU.moverficha(dado, jU.f1));
                                            break;
                                        case 2:
                                            break;
                                    }
                            }
                        i++;
                        }
 
        while (i == 1) {
                            System.out.println("****COLOR: azul****");
                            System.out.println("presiona 1 para lanzar dado");
                            int lanzar = entrada.nextInt();
                            if (lanzar == 1) {
                                int dado;                        //<---DADO (será que lo ponemos como variable global?())
                                dado = (int) (Math.random() * 6) + 1;
                                System.out.println("El dado muestra: " + dado);
                                if (dado == 6 || dado == 1) { //IF de Salida de casa
                                    System.out.println("Escoge el Numero de Ficha a salir de la casa");
                                    int escogers = entrada.nextInt();
                                    switch (escogers) { // Cases de escoger el numero de fichas
                                        case 1:
                                            jU.sacarficha(0, jU.f1);
                                            System.out.println("Presione 1 para lanzar dado de la F1");
                                            int lanzarU = entrada.nextInt();
                                            if (lanzarU == 1) {
                                                dado = (int) (Math.random() * 6) + 1;
                                                System.out.println(jU.moverficha(dado, jU.f1));
                                            }
                                            break;
                                        case 2:
                                            break;
                                        case 3:
                                            break;
                                        case 4:
                                            break;
                                    }
                                }
                                System.out.println("Escoge el numero de ficha"); //viniente de Lanzar==1
                                int escogerf = entrada.nextInt();
                                    switch (escogerf){
                                        case 1:
                                            jU.sacarficha(0, jU.f1);
                                            dado = (int) (Math.random() * 6) + 1;
                                            System.out.println(jU.moverficha(dado, jU.f1));
                                            break;
                                    }
                            }
            i++;
        }
        while (i == 2) {

            i++;
        }
        while (i == 3) {

            i = 0;
        }

    }
    while (i == 5);
    break;

    case 2://opcion de Reglas
    reglas Reglas = new reglas();
    Reglas.Reglas ();
break;
        }
        
    }while (a < 5);
*/