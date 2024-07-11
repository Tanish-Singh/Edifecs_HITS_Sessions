/*By default we have main - which signifies the start of execution of any code block
 * Example if as a program to develop a car see each class specifies the particualr component
 * and with the data of that component we create methods that exhibits a certain behaviour
 * lets take example of a computer
 */

class computer{
    public void playMusic(){ // y roun brackets we specify the calling name for it, public is used to
        // describe access of that variable
        // so a method tends to return something may be a pen, some name, integer or anythin 
        // in case of nothing we use void
        System.out.println("Music Playing..");

    }
    // in case you want to return a string
    public String getPen(int cost){ // so if pen costs something so with name we can specify the input to func
        return "Pen";// we can also add conditional statements for costings of pen
    }
}
public class fnctns {
    public static int add(int n1, int n2){ // to call for main without object you can only call static
        // method
        /*
         * Static variables share memory among all class instances, useful for global state or 
         * shared functionality.
         * Static members are accessible without creating an instance of the class, making them 
         * handy for utility functions and constants used across the entire program.
         * static members are associated with the class itself, affecting all instances, and can 
         * be accessed using the class name directly.
         * Static methods and variables cannot access non-static members of a class; they’re not 
         * tied to any specific instance
         * (instance is basicaly every time we use the function by calling it like add(4,5)
         * here i created the instance of that method)
         */
        int res;
        res = n1 + n2;
        return res;
    }

    public int addi(int m1, int m2){ // as this function is not static we need to make an additonal
        // object for it 
        int res;
        res = m1 + m2;
        return res;
    }

    public static void main(String[] args) {
        computer obj = new computer();
        obj.playMusic();
        String str = obj.getPen(10);
        System.out.println(str);

        System.out.println(add(4,5));

        fnctns obj1 = new fnctns();
        System.out.println(obj1.addi(3,6));
    }
}
