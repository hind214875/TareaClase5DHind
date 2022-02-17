/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea5DHind;

import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author hinda
 */
public class EjercitoOrdenado {
    
    public static void main(String[] args) {
        //para un set ordenado es mejor utilizar TreeSet
           SortedSet<Soldado> ejércitoOrdenado = new TreeSet<>();
           
         //rellenar la lista HashSet
        ejércitoOrdenado.add(new Soldado("1235J", "soldado1", "apelido", "apellido", 30));
        ejércitoOrdenado.add(new Soldado("1235J", "soldado2", "apelido", "apellido", 29));//solo para probar
        ejércitoOrdenado.add(new Soldado("8695M", "soldado3", "apelido", "apellido", 35));
        ejércitoOrdenado.add(new Soldado("8564H", "soldado4", "apelido", "apellido", 20));
        ejércitoOrdenado.add(new Soldado("2314C", "soldado5", "apelido", "apellido", 28));
        ejércitoOrdenado.add(new Soldado("5896E", "soldado6", "apelido", "apellido", 23));
        ejércitoOrdenado.add(new Soldado("56321B", "soldado7", "apelido", "apellido", 40));
        ejércitoOrdenado.add(new Soldado("1235N", "soldado8", "apelido", "apellido", 31));  
        
        //1. Saber el número de soldados que hay.
        //muestre solo 7 porque uno duplicado
        System.out.println("Numero de soldados son: " + ejércitoOrdenado.size());
        
          //2. Alistar a un solado.
        //3. Saber si el ejército no tiene soldados.
        System.out.println("el ejercito tiene soldados?: " + ejércitoOrdenado.isEmpty());
        
         //4. Saber si un soldado está en el ejército.
        Soldado s = (new Soldado("8695M", "soldado3", "apelido", "apellido", 35));
        System.out.println("Este soldado esta en el ejercito? " + ejércitoOrdenado.contains(s));
        
         //5.Sacar todos los soldados, en forma de ArrayList.
        ArrayList<Soldado> saldadosArray = new ArrayList<>();

        for (Soldado saldado : ejércitoOrdenado) {
            saldadosArray.add(saldado);
        }
        
        saldadosArray.forEach(System.out::println);
        System.out.println("\n\n Aqui la lista despues la Desmatricular el saldado3 del ejército");
        
        //6.Desmatricular a un soldado del ejército.
         ejércitoOrdenado.remove(s);
         ejércitoOrdenado.forEach(System.out::println);
           
    }
}
