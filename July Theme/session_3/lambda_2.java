interface sum{
    int add(int i, int j);
}
public class lambda_2 {
    public static void main(String[] args) {
        // case 1 wihtout return ....

        // simple extending an interface 
        // sum ad = (i,j) -> System.out.println(i+j);
        // ad.add(5,6);

        // also using this we willl have lesser files to build
        // though sze increases but managing multiple files 
        // is way better


        // case 2 with return...

        sum obj = (i,j) -> /*return*/ i+j; // return can be 
        //removed as well
        int x = obj.add(25,63);
        System.out.println(x);
    }
}

