public class xption_1 {
    public static void main(String[] args) {
        /*errors
         * compile time error - (error in synatx to specify like
         *      make p big of println will through compile time error)
         * runtime error - (an application made by you , it opened and works
         *      on some exe file so it works now but in case file is deleted
         *      then it will give a runtime error by resourcelessness
         *      any resons that makes software stops at any critical part
         *      so we need to handle these run time errors
         *      we need to handle these errors hence we need to handle these)
         * logical error - (every thing is working fine but for 
         *      any work you get wrong output hence error in code logic)
         */
        // System.out.println(18/0);
        // System.out.println("bye"); // this statment will not work
        // as above will push exception arithemtic error



        // -------------------------------------------------------------------
        // what we can do this
        try{
            System.out.println(18/0);// this will throw exception but wont stop execution
        }
        catch(Exception e){ // exception class will throw it as an object 
            System.out.println("Something went wrong");
        }
        System.out.println("bye");
    }
}
