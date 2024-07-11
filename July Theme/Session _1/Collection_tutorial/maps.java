import java.util.*;

public class maps {
    public static void main(String[] args) {
        // Map are stored in key/value payers are unique values associated with individual values. a
        // map connot contain duplicate keys. And, each key is associated with a single value.
        // here it is implemented by hasmap tree map enummap, linked
        // here we use put mehtod put(K,V) that is key associated and a value into the map
        // this is not exactly in collection framework
//        List<Integer> list = new ArrayList<>();
        Map<String, String> map = new HashMap<>();
        map.put("us", "United States");
        map.put("in", "India");
        map.put("en", "India");
        map.put("Cad", "Canada");// we can have duplicate values but not duplicate payers

        System.out.println(map);

        System.out.println("Removing Cad : "+map.remove("Cad"));

        // boolean
        System.out.println(map.containsKey("Cad"));
        
        // to avoid error in put we can use putifabsent also to avoid overwrite of values
        // ex if i do
        map.put("kr", "Korea");
        map.put("kr", "Karnataka");// as the key is same this will over write the above val
        System.out.println(map);

        // to avoid this we can use ifabsent
        map.put("na", "Nalaska");
        map.putIfAbsent("na", "nagaland");
        System.out.println(map);
        // put all to add another map to same map

        // get
        System.out.println("Get method na : "+map.get("na"));
        // default value
        // if there is not corresponding value we can return a defined value
        // containsValue to check some value
        // replace(k,new,old) replace value
        // remove 
        // KeySet(return set of all key)
        // values(return set of all values)
        // entry set(set of all key/value)
        System.out.println("Key set : "+map.keySet());
        System.out.println("ValueSet : "+map.values());
        System.out.println("Entry set : "+map.entrySet());

    }
}
