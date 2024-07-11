public class strng {
    public static void main(String[] args) {
        // to store character stream so we use string or either character array
        //ideally as string is a class we need an object to do so
        String name = new String("Tanish Singh");
        String name1 = "Tanish"; // this is not a primitive datatype its a special class hence it will
        // auto create an object for you, all functions will work with it
        System.out.println(name);
        // string only with plus concatenation
        System.out.println(name1 + " works in edifecs");
        System.out.println(name1.charAt(1));// to know char at an index
        // concat 
        System.out.println(name.concat(" Bhankharh"));

        name = name +" is straight";// here the variable name is not over written in memory
        // as you can use a same refernce at multiple places, hence there is new address is created 
        // old address is not hampered, this is usefull in address manipulation
        System.out.println(name);
        // also in strings only you can create multiple reference vars but if their value are same 
        // they will be at the same value
        //example
        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println(s1==s2);
        // by default string is immutable every time new address is assigned only there is never like it
        // will be over written
    }
}
