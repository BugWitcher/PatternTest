package Java8Features;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Unit1 {
    // Test for foreach possibilities

    Map<String, Integer> items = new HashMap<>();
    List<String> listitems = new ArrayList<>();

    private void initialize() {

        items.put("A", 10);
        items.put("B", 20);
        items.put("C", 30);
        items.put("D", 40);
        items.put("E", 50);
        items.put("F", 60);


        listitems.add("A");
        listitems.add("B");
        listitems.add("C");
        listitems.add("D");
        listitems.add("E");
    }

    private void printIteratingThroughMap(){
        System.out.println(" Printing iterating through map ");
        for (Map.Entry<String, Integer> entry : items.entrySet()) {
            System.out.println("Item : " + entry.getKey() + " Count : " + entry.getValue());
        }
    }

    private void printUsingForEachThroughMap() {

        System.out.println(" Printing using for each statement ");
        items.forEach((k,v)->System.out.println("Item : " + k + " Count : " + v));

        System.out.println(" Printing using complex for each statement ");
        items.forEach((k,v)->{
            System.out.println("Item : " + k + " Count : " + v);
            if("E".equals(k)){
                System.out.println("Hello E");
            }
        });

    }

    private void printListUsingVariousMethods() {
        System.out.println(" Iterating through list ");
        for(String item : listitems){
            System.out.println(item);
        }


        System.out.println(" Iterating using lambda ");
        //lambda
        //Output : A,B,C,D,E
        listitems.forEach(item -> System.out.println(item));

        System.out.println(" Printing using method reference ");
        listitems.forEach(System.out::println);

        //Stream and filter
        //Output : B
        System.out.println(" Stream and filter ");
        listitems.stream().filter(s ->(s.contains("D") || s.contains("B"))).forEach(System.out::println);
    }



    public Unit1() {
        initialize();
        printIteratingThroughMap();
        printUsingForEachThroughMap();
        System.out.println("------");
        printListUsingVariousMethods();
    }
}
