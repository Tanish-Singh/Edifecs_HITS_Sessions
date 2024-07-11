import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class set {
    public static void main(String[] args) {
        /*the set interface of java collections framework provides feature of mathermatical
         * set in java. it extends the collectio interface. Unlike the List interface, sets cannot 
         * contain duplicate elements.
         * 
         * these are implemented in EnumSet, HashSet, LinkedHashset, TreeSet
         */
        Set<Integer> st = new HashSet<>();// hashset implementation is prefered because time 
        // complexity is very less that is every operation is way faster in this
        // add, addall-to add other collection element , remove, removeall - remove el
        // ment from this set using other given
        // retainAll() - to save the intersection, clear(), Size, contains

        st.add(10);
        st.add(10);
        st.add(20);
        st.add(30);
        st.add(30);
        st.add(50);
        System.out.println("Set print : "+st);// also set are not in order, basically it uses hashing
        // that's why here is random ness
        
        st.remove(10);
        System.out.println("Removed 10 : "+st);

        Set<Integer> set = new LinkedHashSet<>();// elements are 
        set.add(10);
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(30);
        set.add(50);
        System.out.println("Linked Hashset "+set);// although this method is a bit slower

        // TreeSet

        Set<Integer> set1 = new TreeSet<>();// bit faster than linked hashset but slower than hashset
        set1.add(10);
        set1.add(30);
        set1.add(40);
        set1.add(20);
        System.out.println("Tree set : "+set1);
        /*
         * Hash set is fast as all are uniquly identified as hascode within the hashtable,
         * and is generally used when order of elements is not necessary
         */

    }
}
