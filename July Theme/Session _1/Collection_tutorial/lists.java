import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;


public class lists {
    //List interface extends collection interface and adds methods that are specific to lists,
    // which are ordered collections that allow duplicate elements.
    public static void main(String[] args) {
        // ordered colletion, maintain insertion order, insert element, access element by index
        // search, duplicate elements list allows to have null elements
        List<String> list = new ArrayList<>();// dynamic in size
        // allows to add duplicate
        // list.add("element1");
        // list.add("element1");
        // list.add("element2");
        // list.add("element2");
        // System.out.println(list);

        // // add null
        // list.add(null);
        // System.out.println(list);


        // insertion order maintain
        list.add("First");
        list.add("Second");
        list.add("Fourth");
        list.add("Third");
        System.out.println(list);


        // acceess element
        System.out.println(list.get(0));
        System.out.println(list.get(3));

        // size
        System.out.println(list.size());

        // contains
        System.out.println(list.contains("Fourth"));

        // remove 
        list.remove(1);
        System.out.println(list);
        list.remove("Fourth"); // remove workks for index awa name
        System.out.println(list);

        // in cases there is an object same as index
        // suppose in integer array you want ot remove one but it will pick one as index
        // so u need to pass integer as object ex list.remove(Integer.valueOf(1)); this will
        // remove one of its place from any index

        List<String> list2 = new ArrayList<>();
        list2.add("Banana");
        list2.add("apple");
        list2.add("grapes");
        System.out.println(list2);

        // extend or add list 2 to one
        list.addAll(list2);
        System.out.println(list);

        // removeall - this will remove matching elements from the list(Intersection elements will be removed)

        // retainall - this will remove elements not preent in other list(intersection elements will be left)

        // clear - to clear all list

        // toArray() - returns an array of objects that can be used or converted as per use
        // ex
        Object a[] = list.toArray();

        for(Object e: a){
            String temp = (String) e;
            System.out.println(temp);
        }

        // get-
        System.out.println(list.get(2));

        //set - add something at a string
        list.set(1 , "Hello"); // same add func will work
        System.out.println(list);


        // add
        list.add(1, "apple");
        // indexOf - this gives index of element of first occurence else -1
        System.out.println(list.indexOf("apple")); 

        // lastindexOf - give the occurence from end of the error
        System.out.println(list.lastIndexOf("apple"));// will might differ if duplicates are there

        // list iteration, using for and for ech loop

        Iterator<String> fe = list.iterator(); // iterator method
        while(fe.hasNext()){// condition to check if has next
            System.out.println(fe.next());
        }

        // sublist - pick specific from index to index
        System.out.println(list.subList(2, 5));


    }
}
