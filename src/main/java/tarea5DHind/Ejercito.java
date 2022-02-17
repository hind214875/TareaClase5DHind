/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea5DHind;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author hinda
 */
public class Ejercito {

    public static void main(String[] args) {
        //crear un HashSet
        Set<Soldado> ejército = new HashSet<>();

        //rellenar la lista HashSet
        ejército.add(new Soldado("1235J", "soldado1", "apelido", "apellido", 30));
        ejército.add(new Soldado("1235J", "soldado2", "apelido", "apellido", 29));
        ejército.add(new Soldado("8695M", "soldado3", "apelido", "apellido", 35));
        ejército.add(new Soldado("8564H", "soldado4", "apelido", "apellido", 20));
        ejército.add(new Soldado("2314C", "soldado5", "apelido", "apellido", 28));
        ejército.add(new Soldado("5896E", "soldado6", "apelido", "apellido", 23));
        ejército.add(new Soldado("56321B", "soldado7", "apelido", "apellido", 40));
        ejército.add(new Soldado("1235N", "soldado8", "apelido", "apellido", 31));

        //1. Saber el número de soldados que hay.
        System.out.println("Numero de soldados son: " + ejército.size());

        //2. Alistar a un solado.
        //3. Saber si el ejército no tiene soldados.
        System.out.println("el ejercito tiene soldados?: " + ejército.isEmpty());

        //4. Saber si un soldado está en el ejército.
        Soldado s = (new Soldado("8695M", "soldado3", "apelido", "apellido", 35));
        System.out.println("Este soldado esta en el ejercito? " + ejército.contains(s));

        //5.Sacar todos los soldados, en forma de ArrayList.
        ArrayList<Soldado> saldadosArray = new ArrayList<>();

        for (Soldado saldado : ejército) {
            saldadosArray.add(saldado);
        }
        
        saldadosArray.forEach(System.out::println);
        System.out.println("\n\n Aqui la lista despues la Desmatricular el saldado3 del ejército");
        
        //6.Desmatricular a un soldado del ejército.
         ejército.remove(s);
         ejército.forEach(System.out::println);
    }

}
