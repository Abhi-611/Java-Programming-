package CollectionFramework;

import java.util.ArrayDeque;

public class ArrayDeq {
    public static void main(String[] args) {
        
        ArrayDeque ad = new ArrayDeque(); // Implements Deque and Queue // It is Double Ended Queue

        ad.add(100);     // Stores both type of data 
        ad.add("Pwsill");
        ad.add('B');
        System.out.println(ad);

        ad.addFirst(10);  // We can insert and delete data from front and rare ends only 
        ad.addLast(1000); // Index based accessing is allowed

        System.out.println(ad);

        ad.offer(500);
        ad.offerFirst(20);
        ad.offerLast(40);
        System.out.println(ad);


    }
}
