package API_intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class stream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,7,4,8,9);
        //changes in data in stream does not affect the original data in list
        Stream<Integer> streamData = list.stream();

//        long count = streamData.count();
//        System.out.println(count);

        Stream<Integer> filData = streamData.filter(n->n%2==0).sorted().map(n->n*2);  //all in one

//        Stream<Integer> sortedStream = filData.sorted();
//
//        Stream<Integer> mapStream = sortedStream.map(n->n*2);
//
//        mapStream.forEach(n-> System.out.println(n));   //here I am iterating on the new Stream which is mapStream, not on streamData

        filData.forEach(n-> System.out.println(n));

        //you can do only 1 operation in one stream
//        streamData.forEach(n-> System.out.println(n));
    }
}
