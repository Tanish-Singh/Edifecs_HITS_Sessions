public class Dtypes {
    public static void main(String[] args) {
        // two types of data types
        // primitive - in which we have INT (byte, short, int, long), float(double, float), char, Boolean
        // why do we need extra format
        // int = 4 bytes, then for big numbers we use long which takes 8 bytes, 
        // for small number short = 2bytes, for more small numbers byte = 1byte
        //  1 byte can go to -128 to 127 , -128 to -1 (128 nums) then 0-127 (128 nums)
        int n = 8;
        byte b = 127;
        short sh = 558;
        long l = 7498092830l; // in case of long we need to specify l at last of every number
        System.out.println(n);
        System.out.println(b);
        System.out.println(sh);
        System.out.println(l);

        // in previously float is default in cpp but not in java hence this giver error
        //float val = 7.2;
        // by default in java we have double because after decimal the longer range of number
        // will depict the precision hence for scientific calculations double makes more sense
        // by default double is used in java and we ca directly declare that
        double val = 7.2;
        System.out.println(val);
        // so to work with float we need to specify it as f as a signature to that value;
        float val1= 3.4f;
        System.out.println(val1);

        // also for char we java has 2 bytes rather than other langs which follow 1 bytes
        // beacuse in java char can store any charac from any language not only english chars
        char alph = 't';
        System.out.println(alph);

        // boolean only takes true or false not (0,1)
        boolean flag = true;
        System.out.println(flag);
    }
}
