/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parte2;

import parte1.Soldado;

/**
 *
 * @author hinda
 */
public class Prueba {

    public static void main(String[] args) {
        //crear y initializar ejercito
        EjercitoOrdenado eOrdenado = new EjercitoOrdenado(5);

        eOrdenado.alistarSaldado(new Soldado("1235J", "soldado1", "apellido", "apellido", 30));
        eOrdenado.alistarSaldado(new Soldado("1235B", "soldado2", "apellido", "apellido", 29));
        eOrdenado.alistarSaldado(new Soldado("8695M", "soldado3", "apellido", "apellido", 35));
        eOrdenado.alistarSaldado(new Soldado("8564H", "soldado4", "apellido", "apellido", 20));
        eOrdenado.alistarSaldado(new Soldado("2314C", "soldado5", "apellido", "apellido", 28));

        //Saber el número de soldados que hay.
        System.out.println("\nNumero Saldados es: " + eOrdenado.numeroSaldados());

       // Saber si un soldado está en el ejército.
        Soldado s = new Soldado("1235J", "soldado1", "apellido", "apellido", 30);
        System.out.println("\nEste soldado esta en el ejercito? " + eOrdenado.isSaldadoExiste(s));

        //Sacar todos los soldados, en forma de ArrayList.
        System.out.println("\nmostrar la lista de soldados en array");
        eOrdenado.SacarSoldados().forEach(System.out::println);

        //remove a un soldado del ejército.
        eOrdenado.removeSaldado(s);

        //mostar la lista
        System.out.println("\ndespues de borar el soldado 1235J: ");
        eOrdenado.mostrar();
        
        System.out.println(eOrdenado.isEjercitoEmpty()? "Empty":"not empty");
 
    }
}
