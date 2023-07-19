package DateAndTimeAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEachMethod {
    public static void main(String[] args) {
        
        // List<Integer> list = new ArrayList<Integer>();

        // list.add(2);
        // list.add(4);
        // list.add(6);
        // list.add(8);

        // System.out.println(list);

        List<Integer> list =Arrays.asList(2,4,6,8);

        list.forEach(i->System.out.println(i)); // We can also access data through forEach() Method


            
        
    }
}
