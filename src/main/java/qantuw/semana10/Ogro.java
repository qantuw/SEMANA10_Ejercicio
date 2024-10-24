
package qantuw.semana10;

public class Ogro implements Observer { 
    
    @Override
    public void actualizar(String clima) {
        switch (clima) {
            case "Primavera":
                System.out.println("OGRO --> PRIMAVERA --> SIGO DURMIENDO");
                break;
            case "Otoño":
                System.out.println("OGRO --> OTOÑO --> VOY A CAZAR");
                break;
            case "Invierno":
                System.out.println("OGRO --> INVIERNO  --> VOY A BAÑARME EN EL PANTANO");
                break;
            case "Verano":
                System.out.println("OGRO --> VERANO --> VOY A COMER");
                break;
        }
    }
}

