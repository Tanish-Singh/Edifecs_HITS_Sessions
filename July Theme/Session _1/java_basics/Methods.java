public class Methods {
    public static void main(String[] args) {
        // A method is a block of code or collection of statements or a set of code grouped 
        // together to perform a certain task or operation. it is used to achieve the reusablity
        // of code
        // in a method we have 4 comps
        // public int sum (int a, intb)
        // public is access specifier, int is return type, sum is method name, parameter list
        // static here convert the function into class property hence we need not to create its instance
        // hence to run a function without object we can use static keyword



        // // calling a method
        // System.out.println(1);
        // greet();// this shows error because here function isnt static from a static function you can 
        // // only call a static function
        // System.out.println(2);// here you can see sout will executed after the function where the call
        // // exit main method and go to reet method


        // System.out.println("The average is "+average(10, 16));

        // int avg = average(91,89);//can also be used to store this
        // System.out.println(avg);// also the variable in a function lock is not recognised in other function
    }
    // public static void greet(){// use void in there is  no return type
    //     System.out.println("Hello all");
    // }


    // /* method params is the input you pass within a function */
    // public static int average(int a, int b){// we can add multiple parameters
    //     int avg;
    //     avg = (a+b)/2;
    //     return avg;// no line after this
    // }
}
