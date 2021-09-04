package org.djna;


import java.util.*;

public class Collector {

    public static void main(String[] args) {

        Map<String, Coordinates > locations = new HashMap<String, Coordinates>();

        locations.put("aaa", new Coordinates(2, 4) );
        locations.put("bbb", new Coordinates(1, 13) );
        locations.put("ccc", new Coordinates(17, 10) );

        String lookFor = "bbb";
        Coordinates foundCoordinate = locations.get("bbb");
        System.out.printf( "Found %s=>%s\n", lookFor, foundCoordinate);
        walkByKey(locations);
    }

    static void walkByKey(Map<String, Coordinates > locationMap){
        System.out.printf("Size of map %d\n", locationMap.size());

        for (String key: locationMap.keySet() ) {
            System.out.printf( "%s=>%s\n", key, locationMap.get(key) );
        }
    }

    static void walkList(List<String> aList){
        System.out.printf("length of the list is %d\n", aList.size() );

        for (String item: aList ) {
            System.out.printf("%s\n", item);
        }
    }
}
