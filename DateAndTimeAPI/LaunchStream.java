package DateAndTimeAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LaunchStream {
    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(2,4,5,8,9);

        Stream<Integer> streamData = list.stream();

        streamData.forEach(i->System.out.println(i)); // We cannot use double stream 
    }
}
