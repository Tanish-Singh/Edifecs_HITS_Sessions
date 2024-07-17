import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class serial_deserial_1 implements Serializable {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        serial_deserial emp = null; // use the name of original class
        // and the object will be called laterally

        try{
            FileInputStream fileIn = new FileInputStream("C:\\Users\\tanising\\Desktop\\java_docs\\July Theme\\session_3\\Object_op.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            emp = (serial_deserial) in.readObject();
            fileIn.close(); 
        }
        finally{
            System.out.println("Deserializing...");
            System.out.println(emp.name);
            System.out.println(emp.address);

        }
    }
}
