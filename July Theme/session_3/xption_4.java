public class xption_4 {
    public static void main(String[] args) {
        int arr[] = {2,4,6,7};
        try{
            
            System.out.println(arr[9]);
            // even if you mention retrun here it will 
            // execute finally block
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(" Index out of the array");
        }
        finally{
            System.out.println("Finally block this will always work");
        }
    }
}
