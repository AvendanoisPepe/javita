/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;


/**
 *
 * @author Sebastian
 */
public class Colecciones {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("\n Ejemplo HashMap \n");
        Map<Integer, String> map = new HashMap<Integer, String>();
        
        map.put(1,"Rodriguez");         map.put(15,"Ramos");
        map.put(3,"Ospina");            map.put(5,"Guarin");
        map.put(11,"Cuadrado");         map.put(14,"Armero");
        map.put(16,"Bacca");            map.put(8,"Zuñiga");
        map.put(18,"Teo");              map.put(6,"Mondragon");
        map.put(7,"Yepes");            
        
        Iterator<Integer> it = map.keySet() .iterator();
        while(it.hasNext()){
            Integer key = it.next();
            System.out.println("Clave: " + key + " -------> Valor: " + map.get(key));
        }
        
        
        System.out.println("\n Ejemplo de TreeMap \n");
        Map<Integer, String> treeMap = new TreeMap<Integer , String>();
        
        treeMap.put(1,"Ospina");        treeMap.put(15,"Ramos");
        treeMap.put(3,"Yepes");         treeMap.put(5,"Bacca");
        treeMap.put(11,"Zuñiga");       treeMap.put(11,"Mondragon");
        treeMap.put(16,"Armero");       treeMap.put(8,"Cuadrado");
        treeMap.put(18,"Guarin");       treeMap.put(6,"Teo");
        treeMap.put(7,"Rodriguez");  
        
        it = treeMap.keySet() .iterator();
        
        while(it.hasNext()){
            Integer key = it.next();
            System.out.println("Clave: " + key + " ---------> Valor: " + treeMap.get(key));
        }
        
        System.out.println("\n Ejemplo de  LinkedHashMap \n");
        
        Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer , String>();
        
        linkedHashMap.put(1,"Ospina");        linkedHashMap.put(15,"Ramos");
        linkedHashMap.put(3,"Yepes");         linkedHashMap.put(5,"Bacca");
        linkedHashMap.put(11,"Zuñiga");       linkedHashMap.put(11,"Mondragon");
        linkedHashMap.put(16,"Armero");       linkedHashMap.put(8,"Cuadrado");
        linkedHashMap.put(18,"Guarin");       linkedHashMap.put(6,"Teo");
        linkedHashMap.put(7,"Rodriguez");  
        
        it = linkedHashMap.keySet() .iterator();
        
        while(it.hasNext()){
            Integer key = it.next();
            System.out.println("Clave: " + key + " --------> Valor: " + linkedHashMap.get(key));
        }
        System.out.println("LA PUTA MADRE METI GIT PERO AHORA DESDE VISUAL");
        System.out.println("\n Metodos para mostrar de Map \n");
        System.out.println("Mostramos el numero de elementos que tiene el TreeMap: treeMap.size() = " + treeMap.size());
        System.out.println("Vemos si el TreeMap esta vacio: treeMap.isEmpty() = " + treeMap.isEmpty());
        System.out.println("Obtenemos un elemento del Map pasandole la clave 6: treeMap.get(6) = " + treeMap.get(6));
        System.out.println("Borramos un elemento del Map , el 18 (porque fue sustituido): treeMap.remove(19) = " + treeMap.remove(18));
        System.out.println("Vemos que pasa si queremos obtener la clave 10 que ya no existe: treeMap.get(18) = " +treeMap.get(18));
        System.out.println("vemos si existe un elemento con la clave 18: treeMap.containsKey(18) = " +treeMap.containsKey(18));
        System.out.println("vemos si existe un elemento con la clave 1: treeMap.containsKey(1) = "+ treeMap.containsKey(1));
        System.out.println("vemos si existe el valor: 'Rodriguez' en el Map: treeMap.containsValue(\"Rodriguez\") =" + treeMap.containsValue("Rodriguez"));
        System.out.println("Vemos si existe el valor 'teo' en el Map:treeMap.containsValue(\"Teo\") = " + treeMap.containsValue("Teo"));
        System.out.println("Borramos todos los elementos del Map: treeMap.clear()");treeMap.clear();
        System.out.println("Comprobamos si lo hemos eliminado viendo su tamaño treeMap.size(): = " + treeMap.size());
        System.out.println("lo comprobamos tambien viendo si esta vacio : treeMap.isEmpty() = " + treeMap.isEmpty());
      
        
        System.out.println("\n\n For: forma alternativa de recorrer los Map");
        for(Map.Entry<Integer, String> jugador: linkedHashMap.entrySet()){
            Integer clave = jugador.getKey();
            String valor = jugador.getValue();
            System.out.println(clave + "-------------->" + valor);
        }
        
        System.out.println("\n\n TreeMap con objetos y con la clave String");
        Map<String, JugadorSeleccion> jugadores = new TreeMap<String, JugadorSeleccion>();
        jugadores.put("Ospina", new JugadorSeleccion(1,"Ospina","Portero"));
        jugadores.put("Ramos", new JugadorSeleccion(15,"Ramos","Delantero"));
        jugadores.put("Yepes", new JugadorSeleccion(13,"Yepes","Central"));
        jugadores.put("Bacca", new JugadorSeleccion(5,"Bacca","Delantero"));
        jugadores.put("Zuñiga", new JugadorSeleccion(11,"Zuñiga","Lateral Izquierdo"));
        jugadores.put("Abel Aguilar", new JugadorSeleccion(14,"Abel Agular","Medio Campista"));
        jugadores.put("Armero", new JugadorSeleccion(16,"Armero","Lateral"));
        jugadores.put("Cuadrado", new JugadorSeleccion(8,"Cuadrado","Centro Campista"));
        jugadores.put("Guarin", new JugadorSeleccion(18,"Guarin","Volante"));
        jugadores.put("Teo", new JugadorSeleccion(6,"Teo","Delantero"));
        jugadores.put("Rodriguez", new JugadorSeleccion(7,"Rodriguez","Medio Campista"));
        
        for(Map.Entry<String, JugadorSeleccion> jugador: jugadores.entrySet()){
            String clave = jugador.getKey();
            JugadorSeleccion valor = jugador.getValue();
            System.out.println(clave + "-------> "+ valor.toString());
        }
        
        JugadorSeleccion js = new JugadorSeleccion(7,"Rodriguez","Delantero");
        System.out.println("\n\n Esta este objeto js en Map: jugadores.containsValue(js)" + jugadores.containsValue(js));
        
        JugadorSeleccion js1 = new JugadorSeleccion(22,"armero","Extremo Derecho");
        jugadores.put("armero", js1);
        System.out.println("\n\n Esta este objeto js1 en Map: jugadores.containsValue(js1)" + jugadores.containsValue(js1));
        
    }
    
}
