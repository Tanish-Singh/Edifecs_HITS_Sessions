// import java.io.BufferedReader;
import java.io.IOException;
// import java.io.InputStreamReader;
import java.util.Scanner;

public class user_ip {
    public static void main(String[] args) throws IOException {
        // // use input
        // System.out.println("Hello"); // here println is a function of a class printstream if you click
        // // control and click on println, hence we need to create an object for it,
        // // click on out pressing control it will show you that out is object itself, and as its a static
        // // variable of a system class hence we do so


        // user input
        // int num = System.in.read(); // simply click throws an IO exception while hovering as it gives error
        // System.out.println(num);
        // // but you see it outputs the ascii value
        // // lets delete it from 48
        // System.out.println(num-48);


        // // hence the above will not work for large numbers hence we have a specialized class for it
        // // BufferReader
        // InputStreamReader in = new InputStreamReader(System.in);// this also expect an object hence it has system
        // BufferedReader bf = new BufferedReader(in); // here buffer reader expect an input object
        // // Hence before it we add input streamer

        // // now
        // int num = Integer.parseInt(bf.readLine());// readline only take string and we will convert it to int
        // System.out.println(num);

        // bf.close(); // this is a resource hence it is useful when taking input from server or file or host etc


        // scanner
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);

        // similarly we can do it with the sentence
        Scanner sc1 = new Scanner(System.in);
        String str = sc1.nextLine();
        System.out.println(str);
        
        sc.close();
        sc1.close();
    }
}
