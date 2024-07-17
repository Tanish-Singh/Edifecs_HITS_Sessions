public class xption_2 {
    public static void main(String[] args) {
        // try printing the particular exceptions

        // case 1 with only one catch block you wil get the same
        // answer but for different you can add on to different
        // catch blocks in order for different ecxception.
        // int i =10;
        // int j = 0;
        // try{
        //      j = i/j;
        // }
        // catch(Exception e){
        //     System.out.println("The exception occured is "+e);
        // }

        // // error with aray - out of bounds
        // int nums[] = new int[5];

        // try{
        //     System.out.println(nums[1]);
        //     System.out.println(nums[7]);
        //     System.out.println(nums[3]);// this will not work as it out of bound
        // }
        // catch(Exception e){
        //     System.out.println("The error cause "+e);
        // }

        // case - 2 for specific errors
        int arr[] = {2,4,6,7};
        try{
            System.out.println(4/10);
            System.out.println(arr[9]);
        }
        // you can specify a particular ctahc block for a particular error
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
        // index out of bpunda error
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(" Index out of the array");
        }
        // exception class handles all the excetpion so atlast you can use this
        // you can take it as a parent class handling all

        /*notes
         * object -> throwable - > we have exception (can handle ex runtime ,(SQL, IO excedd)
         * checked exception need compulsory to handle , 
         * (arithematic ,null pointer , array index outofbound) uncheck exception need
         * not to be handled , 
         * error (cant fix them ex thread dead, IO error, VM error, out of memory)
         */
    }
}
