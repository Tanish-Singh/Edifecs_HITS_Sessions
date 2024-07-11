class Calculator{//similarly this can be a class to do a calculations

    // variable in class
    int a;

    public int add(int n1, int n2){ // hence for start i mentioned its access than the return type value then add()
        // as the name of it
        a = n1 + n2;
        return a; // exit character for the function as java expects the function to return int
    }
    }
public class classes {
    // object oriented programming
    // object has a property and behaviour
    
    // class
    public static void main(String[] args) {
        int num1=2;
        int num2=5;

        // now if i directly call add() this will throw an error beacuse we need to specify an entry
        // point hence for us object does that 
        Calculator calc = new Calculator();// here calc is a referenece variable
        int result = calc.add(num1 , num2);
        System.out.println(result);
    }
}
