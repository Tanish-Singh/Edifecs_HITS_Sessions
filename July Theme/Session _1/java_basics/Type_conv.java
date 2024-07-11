public class Type_conv {
    public static void main(String[] args) {
        /* // so if we want to assign int to byte this will throw error if int is out of range of byte
        byte b = 45;
        int a = 334;
        // b=a; // this gives error
        // reverse will work
        a=b; // this is a conversion */

        // what if i take a in range and then put it in b
        int a=12;
        byte b=45;// this should work but will throw error
        // so to do so we do casting example
        b = (byte)a;// this is the syntax for casting
        System.out.println(b);

        // for float to int
        float f = 5.6f;
        int x = (int)f; // we will lose after point
        System.out.println(x);

        // in case if somebody asks
        // if int is outof range of byte and we want to store that then java will use a concept of modulus
        int s = 2345;
        byte l = 44;
        l=(byte)s;
        System.out.println(l);

        // System.out.println(2345%256); hence this is modulours operator

        // Type promotion 
        byte z = 10;
        byte q = 30;
        int result = z * q; // here the range exceeds for a byte hence java auto promote the result as int
        System.out.println(result);
        
    }
}
