package datastructure;


import java.util.*;

public class UseMap {

        public static void main(String[] args) {
                /*
                 * Demonstrate how to use Map that includes storing and retrieving elements.
                 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
                 * Use For-Each loop and While-loop with Iterator to retrieve data.
                 *
                 * Store and retrieve data from/to a database table.
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

                Map<String, List<String>> map2 = new HashMap<>();
                map2.put("US", riversOfUS);
                map2.put("UK", riversOfUK);
                map2.put("France", riversOfFrance);
                map2.put("Russia", riversOfRussia);


                map2.put("Spain", riversOfSpain);

                for (Map.Entry<String, List<String>> country : map2.entrySet()) {
                        System.out.println("The major rivers in " + country.getKey() + " are " + country.getValue());
                }

                Iterator<Map.Entry<String, List<String>>> it = map2.entrySet().iterator();
                while(it.hasNext()){
                        Map.Entry<String, List<String>> pair = it.next();
                        System.out.println("The major rivers in " + pair.getKey() + " are " + pair.getValue());
                }

        }

}