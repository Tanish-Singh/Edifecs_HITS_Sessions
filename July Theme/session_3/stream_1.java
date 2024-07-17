import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class stream_1 {
    // astream represents a sequence of objects from a source,
    // which supports aggregare operations
    // used by package called as classes, 
    //interfaces and enum to allow functional-style operations

    // source -> filter-> sort-> Map -> collect
    /* characteristics of streams
     * provides a set of elements in a sequential manner
     * it takes collections, arrays, or I/O resources as 
     * input source 
     * operations performed on stream doesnt change its nature (filtering)
     *  aggregate operations lieke filter, map, limit, reduce, find, match
     */
    public static void main(String[] args) {
        // create a stream of arrya
        Stream<String> stream = Stream.of("a","b","c");
        stream.forEach(System.out::println);// shorthand for lambda, passed in forEach
        // it will take each element and print it as per use

        // stream from collections
        Collection<String> col = Arrays.asList("Java","Edifecs","Session");// create a collection
        Stream<String> st = col.stream();// stream object to use stream
        st.forEach(System.out::println);
        // similarly replace collection with list or set or arrayas per need

        String[] starr = {"hello","Edifecs","HITS"};
        Stream<String> st1 = Arrays.stream(starr);
        st1.forEach(System.out::println); 
     }
}
