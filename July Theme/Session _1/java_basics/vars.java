public class vars {
    public static void main(String[] args) {
        // to solve a real world problem using computer we need to mimic that as virtual world
        // so all the processing is done as in virtual world is on data
        // all this data is saved on DB, but in case for live processing
        // we need to store data so we call it as a variable which is a temporary container
        // that stores a value that might have a value, ex number, name,
        // So we call java as a strongly typed Language means we can create variables as much
        // but we need to specify its type
        int num = 3; // = to is assignment operator which will assignright value to the left hand side
        System.out.println(num);
        // we can create multiple vars
        int num1 = 4;
        System.out.println(num + num1);
        int result = num1 + num - 1;
        System.out.println(result);
    }
}
