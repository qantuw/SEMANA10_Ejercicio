
package qantuw.semana10;


public class SeñorDeLosAnillos {
    public static void main(String[] args) {
        Clima clima = new Clima();

        Observer ogro = new Ogro();
        Observer duende = new Duende();

        clima.agregarObserver(ogro);
        clima.agregarObserver(duende);

        clima.cambiarEstacion("Primavera");
        clima.cambiarEstacion("Otoño");
        clima.cambiarEstacion("Invierno");
        clima.cambiarEstacion("Verano");
    }
}
