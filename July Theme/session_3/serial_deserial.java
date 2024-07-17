// use a class that implements serialization

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class serial_deserial implements Serializable {
    // serialization is the conversion of that state of an object into byrw stream,
    // deserialization does the opposite
    // also we can serialize objects on one platform and deserailize them on another.
    public String name;
    public String address;
    public static void main(String[] args) {
        // once a class is created and you use object io use it in cases 
        // you want to use the object once program is deleted object is vanished
        // hence in cases we nned to use that object again we use serialization
        // deserialization 
        // so any class is serializable if it uses serializable class
        // process is jvm independent
        // instantiate the employee class
        serial_deserial emp = new serial_deserial();
        emp.name = "Tanish";
        emp.address = "Chandigarh";

        // emp object hold the data hence we will convert them in stream
        // of bytes

        // define an output constructor
        // then pass it to object output construcotor
        // then call it by passing object to it
        try{
            FileOutputStream fileout = new FileOutputStream("C:\\Users\\tanising\\Desktop\\java_docs\\July Theme\\session_3\\Object_op.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileout);
            out.writeObject(emp);
            fileout.close();
            System.out.println("Serialization complete");
        }
        catch(IOException e){
            e.printStackTrace(); // it writes about traces usefull for error tracking
            // debugging, temporary handling
        }

    }
}
