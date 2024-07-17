// interface A{
//     void show();
//     void config();
// }
// public class lmbda_2 {
//     public static void main(String[] args) {
//         // what is an interface
//         /*Interface is not a class and in interface all function
//          * are by default public abstract,
//          * we can't intantiate an interface
//          * we cant create object for it
//          */
//         A obj;
//         obj = new A();// This throws an error 

//         /*Hence you cant intantiate it so y do we create an interface
//          * ex if i want to tell you the way to our office like you need to take left
//          * catch a bus then change another bus to reach out to the office 
//          * This way i have a set of instructions for you to follow
//          * which you can use in order to reach the office similarly an interface
//          * can be visualised as a guidline , a recipe, a set of instruction,,a path which can
//          * be followed later on to get something
//          */
//     }
// }

interface A{ // as it is a path or a set of instruction
    void show();
    void config();
    // in interface we can also define about static and final variables
    // there values cant be changed as they arent stored in head
    int age = 21;
    String city = "Mohali";
}

// we will create a class which will impleent it
class B implements A{
    public void show(){
        System.out.println("in show");
    }
    public void config(){
        System.out.println("in config");
    }
}
public class interfaces_2{
    public static void main(String[] args) {
        // create object
        A obj;
        obj = new B();
        obj.show();
        obj.config();
        System.out.println(A.city);
        
    }
}

// we can also implement multiple interfaces in a single class
// ex x is another interface 
// we can say class B implements A,X