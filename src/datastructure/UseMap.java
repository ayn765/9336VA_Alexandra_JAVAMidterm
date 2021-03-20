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

//        Map<String, String> map = new HashMap<>();
//        map.put("US", "Washington DC");
//        map.put("Russia", "Moscow");
//        map.put("United Kingdom", "London");
//        map.put("Spain", "Madrid");
//        map.put("France", "Paris");
//
//        for(Map.Entry<String, String> me : map.entrySet()){
//            System.out.print(me.getKey() + " : ");
//            System.out.println(me.getValue());


            List<String> riversOfUS = new ArrayList<>();
            riversOfUS.add("Missouri River");
            riversOfUS.add("Mississippi River");
            riversOfUS.add("Yukon River");

            List<String> riversOfUK = new ArrayList<>();
            riversOfUK.add("River Severn");
            riversOfUK.add("River Thames");
            riversOfUK.add("River Trent");

            List<String> riversOfFrance = new ArrayList<>();
            riversOfUK.add("River  Loire");
            riversOfUK.add("River Seine");
            riversOfUK.add("River Garonne");

            List<String> riversOfRussia = new ArrayList<>();
            riversOfUK.add("River  Lena");
            riversOfUK.add("River Irtysh");
            riversOfUK.add("River Ob");

            List<String> riversOfSpain = new ArrayList<>();
            riversOfUK.add("River  Tajo");
            riversOfUK.add("River Erbo");
            riversOfUK.add("River Duero");

            Map<String, List <String>> map2 = new HashMap<>();
            map2.put("US",riversOfUS);
            map2.put("Russia", riversOfRussia);
            map2.put("UK", riversOfUK);
            map2.put("France", riversOfFrance);
            map2.put("Spain", riversOfSpain);

            for(Map.Entry<String, List<String>> country: map2.entrySet()){
                System.out.println(country.getKey() + " " + country.getValue());
            }

//            List<String> typeOfFood = new ArrayList<>();
//
//            Cities cities;
//            Cities moscow = new Cities();
//            Cities london = new Cities();
//            Cities paris = new Cities();
//
//
//            list.put("Russia", );
//
//            for(Map.Entry<String,String> me1 : map.entrySet()){
//                System.out.print(me1.getKey() + " : ");
//                System.out.println(me1.getValue());
//            }
        }

    }

