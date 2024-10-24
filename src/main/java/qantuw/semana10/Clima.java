/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qantuw.semana10;

import java.util.ArrayList;
import java.util.List;

interface SujetoClima {
    void agregarObserver(Observer Observer);
    void eliminarObserver(Observer Observer);
    void notificarObservers(String clima);
}

public class Clima implements SujetoClima {
    private List<Observer> Observers = new ArrayList<>();
    private String climaActual;

    
    
    @Override
    public void agregarObserver(Observer Observer) {
        Observers.add(Observer);
    }

    @Override
    public void eliminarObserver(Observer Observer) {
        Observers.remove(Observer);
    }

    @Override
    public void notificarObservers(String estacion) {
        this.climaActual = estacion;
        for (Observer observador : Observers) {
            observador.actualizar(estacion);
        }
    }

    public void cambiarEstacion(String nuevoClima) {
        System.out.println("El clima ahora es: " + nuevoClima);
        notificarObservers(nuevoClima);
    }

}

