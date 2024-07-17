import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FILE_I_O {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\tanising\\Downloads\\sample1.txt"));
        // System.out.println(reader.ready()); // to check it the file is empty
            
        // char ch = (char)reader.read();
        // System.out.println(ch);

        //     // skip to skipp particular characters
        // reader.skip(10);

        // String line;            
        // while((line = reader.readLine())!= null){
        //         System.out.println(line);
        //     }
        
        // always ensure to basically remove above code or either comment it
        BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\tanising\\Desktop\\java_docs\\July Theme\\session_3\\Writingfile.txt"));
        char[] chars ={'h','e','l','l','o'};
        writer.write(chars,0,chars.length); // hello with 0 spacing 
        String lines;
        while((lines = reader.readLine())!=null){
            writer.write(lines);
            writer.newLine();// this will ensure every time the new line is chossen after one
        }
        reader.close();
        writer.close();
    }
}
