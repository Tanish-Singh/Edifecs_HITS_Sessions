// public class xption_3 {
//     public static void main(String[] args) {
//         // want ot generate an exception
//         int i =0;
//         int j = 0;
//         try{
//             j = 0;
//             // to generate an exception
//             if(j==0){
//                 throw new ArithmeticException("Zero is wrong output"); // use throw keyword
//                 // also we use to message within this constructor
//             }
//         }
//         catch(ArithmeticException e){
//             j = 18/1;
//             System.out.println(e);
//         }
//     }
// }

// custom exception


// create a class for it
class MyException extends Exception{
    public MyException(String string){
        // until we have to print it the call
        super(string); // this constructor i of my exception and it
        // calls the constructor of the parent class
        /*The super keyword in Java is used to refer to the 
        immediate parent class of an object. It is particularly 
        useful in the context of inheritance, where a subclass 
        inherits properties and behaviors from a superclass. */
    }
}

public class xption_3 {
    public static void main(String[] args) {
        // want ot generate an exception
        int i =0;
        int j = 0;
        try{
            j = 0;
            // to generate an exception
            if(j==0){
                throw new MyException("Zero is wrong output"); // use throw keyword
                // also we use to message within this constructor
            }
        }
        catch(MyException e){
            j = 18/1;
            System.out.println("The custom exception "+e);
        }
    }
}
