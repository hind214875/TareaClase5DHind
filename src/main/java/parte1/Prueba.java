/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parte1;

/**
 *
 * @author hinda
 */
public class Prueba {

    public static void main(String[] args) {
        //crear y initializar ejercito
        Ejercito e = new Ejercito(5);

        e.alistarSaldado(new Soldado("1235J", "soldado1", "apellido", "apellido", 30));
        e.alistarSaldado(new Soldado("1235B", "soldado2", "apellido", "apellido", 29));
        e.alistarSaldado(new Soldado("8695M", "soldado3", "apellido", "apellido", 35));
        e.alistarSaldado(new Soldado("8564H", "soldado4", "apellido", "apellido", 20));
        e.alistarSaldado(new Soldado("2314C", "soldado5", "apellido", "apellido", 28));
        e.alistarSaldado(new Soldado("5896E", "soldado6", "apellido", "apellido", 23));

      
        //Saber el número de soldados que hay.
        System.out.println("\nNumero Saldados es: " + e.numeroSaldados());

        // Saber si un soldado está en el ejército.
        Soldado s = new Soldado("5896E", "soldado6", "apellido", "apellido", 23);
        System.out.println("\nEste soldado esta en el ejercito? " + e.isSaldadoExiste(s));

        //Sacar todos los soldados, en forma de ArrayList.
        System.out.println("");
        e.SacarSoldados().forEach(System.out::println);

        //remove a un soldado del ejército.
        e.removeSaldado(new Soldado("1235J", "soldado1", "apellido", "apellido", 30));

        //mostar la lista
        System.out.println("");
        e.mostrar();
       
        System.out.println(e.isEjercitoEmpty()? "Empty":"not empty");
    }
}
