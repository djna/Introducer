package org.djna;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Collector {

    public static void main(String[] args) {
        String[] someNames = { "a", "b", "c" };
        // cannot someNames[4] = "d";
        walkArray(someNames);

        ArrayList<String> listOfNames = new ArrayList<String>(3);
        for(String name : someNames) {
            listOfNames.add(name);
        }
        listOfNames.add("d");
        walkList(listOfNames);



    }

    static void walkArray(String[] anArray){
        System.out.printf("length of the array is %d\n", anArray.length);

        for (String item: anArray ) {
            System.out.printf("%s\n", item);
        }
    }

    static void walkList(List<String> aList){
        System.out.printf("length of the list is %d\n", aList.size() );

        for (String item: aList ) {
            System.out.printf("%s\n", item);
        }
    }
}
