/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parte2;

import java.util.ArrayList;
import java.util.TreeSet;
import parte1.Soldado;

/**
 *
 * @author hinda
 */
public class EjercitoOrdenado {

    //atributos
    private int numeroSoldados;
    private TreeSet<Soldado> ejercito;

    //costrectores
    public EjercitoOrdenado(int numeroSoldados) {
        this.numeroSoldados = numeroSoldados;
        this.ejercito = new TreeSet<>();
    }

    public EjercitoOrdenado(int numeroSoldados, TreeSet<Soldado> ejercito) {
        this.numeroSoldados = numeroSoldados;
        this.ejercito = ejercito;
    }

    //1. Saber el número de soldados que hay.
    public int numeroSaldados() {
        return ejercito.size();
    }

    //2. Alistar a un solado.
    public void alistarSaldado(Soldado s) {
        if (numeroSaldados() < numeroSoldados) {
            ejercito.add(s);
        }
    }

    //3. Saber si el ejército no tiene soldados.
    public boolean isEjercitoEmpty() {
        return ejercito.isEmpty();
    }

    //4. Saber si un soldado está en el ejército.
    public boolean isSaldadoExiste(Soldado s) {
        return ejercito.contains(s);
    }

    //5.Sacar todos los soldados, en forma de ArrayList.
    public ArrayList<Soldado> SacarSoldados() {
        ArrayList<Soldado> saldadosArray = new ArrayList<>();

        saldadosArray.addAll(ejercito);

        return saldadosArray;
    }

    //6.Desmatricular a un soldado del ejército.
    public void removeSaldado(Soldado s) {
        ejercito.remove(s);
    }

    //mostar 
    public void mostrar() {
        ejercito.forEach(System.out::println);
    }

}
