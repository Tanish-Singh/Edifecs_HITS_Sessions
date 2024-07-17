@FunctionalInterface// by specifying this we know that function has only one method generally
// if i specify more methods it wont generate errors but iif you want that you specify this

interface A{// single abstract method (SAM) interface
    void show();
}

// class B implements A{// we can only create object of another class which implements it
//     public void show(){
//         System.out.println("In show");
//     }
// }
public class interface_3 {
    public static void main(String[] args) {
        // what if i dont want to use another class
        // then we can define instance's own implementation
        A obj = new A(){
            public void show(){
                System.out.println("in show");
            }
        };// this is an anonymous class
        /* an anonymous class is a type of inner class that does not have a 
        name and is used to instantiate objects with certain "on-the-fly" implementations, 
        usually for a single use. Anonymous classes enable you to make your code more 
        concise and readable by avoiding the need to create a separate named class. */

        obj.show();
    }
}
