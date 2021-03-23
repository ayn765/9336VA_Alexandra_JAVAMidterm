package datastructure;


import java.util.*;

public class UseMap {

        public static void main(String[] args) {
                /*
                 * Map is an Interface provided in java.util package
                 * A HashMap stores items in "key/value" pairs, and you can access them by an index of
                 * another type (e.g. a String). One object is used as a key (index) to another object (value).
                 * It can store different types: String keys and Integer values, or the same type, like: String
                 * keys and String values.
                 */

                List<String> riversOfUS = new ArrayList<>();
                riversOfUS.add("Missouri River");
                riversOfUS.add("Mississippi River");
                riversOfUS.add("Yukon River");

                List<String> riversOfUK = new ArrayList<>();
                riversOfUK.add("River Severn");
                riversOfUK.add("River Thames");
                riversOfUK.add("River Trent");

                List<String> riversOfFrance = new ArrayList<String>();
                riversOfFrance.add("River Loire");
                riversOfFrance.add("River Seine");
                riversOfFrance.add("River Garonne");

                List<String> riversOfRussia = new ArrayList<String>();
                riversOfRussia.add("River Lena");
                riversOfRussia.add("River Irtysh");
                riversOfRussia.add("River Ob");

                List<String> riversOfSpain = new ArrayList<String>();
                riversOfSpain.add("River Tajo");
                riversOfSpain.add("River Erbo");
                riversOfSpain.add("River Duero");

                //adding all arrayLists into the map:
                Map<String, List<String>> map2 = new HashMap<>();
                map2.put("US", riversOfUS);
                map2.put("UK", riversOfUK);
                map2.put("France", riversOfFrance);
                map2.put("Russia", riversOfRussia);
                map2.put("Spain", riversOfSpain);

                //Map is an Interface. Map.Entry<> method returns a collection view of the map:
                for (Map.Entry<String, List<String>> country : map2.entrySet()) {  //entrySet() returns a set view of mappings contained in the map
                        System.out.println("The major rivers in " + country.getKey() + " are " + country.getValue());
                }
                //Interface Iterator is used to iterate and view the elements of the map:
                Iterator<Map.Entry<String, List<String>>> it = map2.entrySet().iterator();
                while(it.hasNext()){
                        Map.Entry<String, List<String>> pair = it.next();
                        System.out.println("The major rivers in " + pair.getKey() + " are " + pair.getValue());
                }
        }
}