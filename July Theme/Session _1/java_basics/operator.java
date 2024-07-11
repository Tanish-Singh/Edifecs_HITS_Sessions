public class operator {
    public static void main(String[] args) {
        // // arithematic operators
        // int num1 = 4;
        // int num2 = 5;
        // int result = num1 + num2;// hence we can do -,*,/ div,%modulous
        // System.out.println(result);
        // num1= num1+3;
        // System.out.println(num1);
        // num1-=1;
        // System.out.println(num1);
        // num1++;// increment
        // System.out.println(num1);
        // num1--;
        // System.out.println(num1);

        // /* diff between ++num(pre increment) and num++ (post increment)*/

        // int x = 4;
        // int re = x++;// here this will first fetch the value of num
        // int y = 4;
        // int res =++y;// here this will first increment then fetch the value of num
        // System.out.println(re);
        // System.out.println(res);


        // // relational opertors - <,>,==,!=, <=, >=
        //  int x=6;
        //  int y=5;
        //  boolean result = x!=y;
        //  System.out.println(result);


        // locial operators  - and(&)/or(|)/not(!)
        int x = 4;
        int y = 3;
        int z = 9;
        /* difference between &,&&  in the case && it will see first condition and in case its false
         * it will notcheck for the second one cause defaultly answer is false, similarly in case || 
         * it will check first cond and if its true then it will skip second cause 
         * in the case default will be true as in both cases second condition ouput wont matter much
         * this concept is called short circuit.
        */
        boolean re  = x>y && z>=x || x<y;
        System.out.println(re);

    }
}


