public class lambda_1 {
    // so before it we had functional interface in which we can use an anonymous class
    // in order to create a single function for it
    // in java 8 they decided to make it lesser verbrose and introduced 
    // lambdas .   
    interface A{
        void show();
    }

    interface B{
        void show(int i);
    }
    public static void main(String[] args) {

        // case 1 ---  
        /*interface A{// single abstract method (SAM) interface
            void show();
        }

        public class interface_3 {
            public static void main(String[] args) {
                // what if i dont want to use another class
                // then we can define instance's own implementation
                A obj = new A(){
                    public void show(){
                        System.out.println("in show");
                    }
                }; */

        // note we know that within A obj you can complete  it 
        // by new A() also in brackets you can specify any
        // anonymous function like a void show with no return
        // even compiler will be able to guess it similar way
        // we can even avoid the interface


        /*Lambda functions, or lambda expressions, 
        were introduced in Java 8 to provide a clear and 
        concise way to represent instances of single-method 
        interfaces, also known as functional interfaces. 
        They allow you to write more readable and maintainable 
        code by enabling you to treat functionality as a method 
        argument or pass code as data. */
        // lambda only works with functional interface.
        A obj = () -> System.out.println("in show");
        obj.show(); // here we removed so much and its the beauty
        // it will still work


        // to take user input
        B obj1 = i -> System.out.println("in show"+i);
        // so in single arg we can skip brackets as well as type of
        // varibale
        obj1.show(6);
    }    
}
