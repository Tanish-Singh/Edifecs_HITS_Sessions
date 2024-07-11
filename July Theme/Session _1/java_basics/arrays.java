public class arrays {
    // need of array
    // we can save multiple values in a single variables
    // syntax - int num[] = {5,6,7} (imagine a glass which can hold water similary a tray can have
    // multiple glass holding water)
    // empty array of a specific size
    // int num1[] = new int[4]; hence array of size 4
    public static void main(String[] args) {
        int nums[] = {3,4,5,1};// use indexing for it
        System.out.println(nums[1]);

        // change value
        nums[0] = 6;
        System.out.println(nums[0]);

        // dynamic array
        int nums1[] = new int[4]; //here the value for all will be 0 of an array size 4
        nums1[0] = 9;
        nums1[1] = 19;
        nums1[2] = 2;
        nums1[3] = 90;
        // so to print either we can print all 1 by 1 or using a loop
        for(int i=0; i<4;i++){ // either i<=3
            System.out.println("Using loop "+nums1[i]);
        }



        // multi dimensional array
        // store multple arrays into a single big array.
        // int nums[][] = new int[3][4];(3 arrays in big array with 4 elements)
        int arr[][] = new int[3][4];
        // to print all the values we will use nested loop
        for(int i=0;i<3;i++){
            for(int j=0; j<4;j++){
                System.out.println("multidimensanol arr "+arr[i][j]);
            }
        }
        // to print in a box structure
        for(int i=0;i<3;i++){
            for(int j=0; j<4;j++){
                System.out.print(arr[i][j]+" ");//use print to stay in same line
            }
            System.out.println();// to get into new line
        }
        System.out.println("Jagged array--------------------------------->");
        // jagged array where we wont specify the num of columns hence we individually specify the column
        int arr1[][] = new int[3][];
        arr1[0] = new int[3];// specify specific colums
        arr1[1]= new int[2];
        arr1[2] = new int[4];  
        // to print here we will use a special function
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr1[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        // enhance for loop
        System.out.println("Enchanced for loop");
        for(int n[]:arr1){// n will get individual element as array
            for(int m: n){// m will get individual ellement as int
                System.out.print(m+" ");
            }
            System.out.println();
        }
    }
}
// drawbacks of array
/*
 * it occupy space in heap which is continous
 * we cant increase the size of array
 * searching and inserting takes times
 * only a single element type can be stored
 */