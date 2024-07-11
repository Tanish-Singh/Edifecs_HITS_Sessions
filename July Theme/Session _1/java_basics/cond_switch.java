public class cond_switch {
    public static void main(String[] args) {
        // int x=1;
        // if (x>10 && x<50) { // we can give else or if
        //     System.out.println("Hello");
        // }// also if there is only one statement to execute you dont need brackets but for multiple
        // // we need to use brackets
        // else{
        //     System.out.println("bye");
        // }

        // int y=51;
        // int z = 9;
        // if (x>y && x>z) {
        //     System.out.println("X is greatest");
        // }
        // else if (x==y) {
        //     System.out.println("X is equal to y");
        // }
        // else{
        //     if (z>y) {
        //         System.out.println("z is greater than y");
        //     }
        //     else{
        //         System.out.println("y is greatest");
        //     }
        // }


        // // Ternary operator
        // int n = 901;
        // int result =0;
        // if (n%2==0) {
        //     result=10;
        // }
        // else{
        //     result=30;
        // }
        // System.out.println(result);

        // // to avoid such a big code we can use a ternary operator that is ?:
        // int res = n%2==0 ? 11 : 16;// if n is ever then print after ? else print after :
        // System.out.println(res);





        // switch statement
        // print a single day of week based on the number catch is it will not work in
        int n=6;

        switch(n){
            case 1:{
                System.out.println("Monday");
                     break;// after macthing it will execute all next statements hence we use break to come out of the block
            }
            case 2:
                {System.out.println("Tuesday");
                 break;}
            case 3:
                {System.out.println("Wednesday");
                 break;}
            case 4:
                {System.out.println("Thursday");
                 break;}
            case 5:
                {System.out.println("Friday");
                 break;}
            case 6:
                {System.out.println("Saturday");
                 break;}
            case 7:
                {System.out.println("Sunday");
                 break;}
            default:
                {System.out.println("enter valid number");}
            
        }

        // updated switch, also works with string by java 12
        String day = "Monday";
        switch(day){
            case "Saturday", "Sunday" -> System.out.println("11 AM");
            case "Monday" -> System.out.println("6am");
            default -> System.out.println("7 am");
        }

        // writing the value in result
        String result;
        switch(day){
            case "Saturday", "Sunday" -> result = "11 AM";
            case "Monday" -> result = "6am";
            default -> result = "7 am";

        }
        System.out.println(result);

        // return a value
        String d = "Tuesday";
        String resul;
        resul = switch(d){
            case "Saturday", "Sunday" -> "11 AM";
            case "Monday" -> "6am";
            default -> "7 am";
        };// in this we need to mention semicolon
        System.out.println(resul);


    }
}
 