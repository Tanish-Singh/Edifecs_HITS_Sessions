import java.util.Collection;
import java.util.ArrayList;
public class intro {
    public static void main(String[] args) {
        // // 1array to store similar type of elements (homogenous data) to overcome we can store objects
        // // as array
        // int[] arr = new int[100];//2 store 100 values in arr
        // // these are fixed in size cant store more than 100
        // // 3 no readymade libs or api to write logics using array
        // // hence there exist a collection framework
        // System.out.println(arr);
        Collection<String> new_collection = new ArrayList<>();
        // add element to the collection
        new_collection.add("First");
        new_collection.add("Second");
        new_collection.add("Third");
        new_collection.add("Fourth");
        System.out.println(new_collection);

        //Remove an element
        new_collection.remove("Third");
        System.out.println(new_collection);

        // to check if an element is present ise contains returns boolean
        System.out.println(new_collection.contains("Third"));

        // iterate over collection using foreach
        new_collection.forEach((element) -> {
            System.out.println(element);
        });

        // clear to clear the collection
        new_collection.clear();
        System.out.println(new_collection);
    }
}
