
package qantuw.semana10;

import qantuw.semana10.Observer;

/**
 *
 * @author ASUS
 */
public class Duende implements Observer {
    
    @Override
    public void actualizar(String clima) {
        switch (clima) {
            case "Primavera":
                System.out.println("DUENDE --> PRIMAVERA --> DUENDE HACE MAGIA");
                break;
            case "Otoño":
                System.out.println("DUENDE --> OTOÑO --> DEBO TRABAJAR");
                break;
            case "Invierno":
                System.out.println("DUENDE --> INVIERNO --> HORA DE DORMIR");
                break;
            case "Verano":
                System.out.println("DUENDE --> VERANO --> MOMENTO DE SALIR A DISFRUTAR DEL PAISAJE");
                break;
        }
    }
}


