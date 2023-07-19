package MapGenerics;

import java.util.*;
import java.util.Map.Entry;

public class Map2 {
    public static void main(String[] args) {
        
        Map map = new HashMap();

        map.put(1, "Rohit"); // Entry
        map.put(2, "Rohan");
        map.put(3, "Rahul");
        map.put(4, "Ramesh");

        System.out.println(map);

        System.out.println(map.get(4));

        Set key = map.keySet(); // get Keys 
        
        Iterator itr = key.iterator();

        while(itr.hasNext())
        {
            Integer key1 =(Integer)itr.next();
            //System.out.println(itr.next());
            System.out.println(key1);
        }

        Collection value = map.values(); // get Values

        Iterator itr1 = value.iterator();

        while (itr1.hasNext()) 
        {
            String value1 =(String)itr1.next();
            // System.out.println(itr1.next());
            System.out.println(value1);
        }

        Set entry = map.entrySet(); // getting entry

        Iterator itr3 = entry.iterator();

        while(itr3.hasNext())
        {
            Entry data =(Entry)itr3.next();
            // System.out.println(itr3.next());
            System.out.println(data.getKey()+":"+data.getValue());
        }
    }
}
