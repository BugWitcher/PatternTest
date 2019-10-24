package SerializableTests;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SerializationExample {


    String fileName = "simpleserial.ser" ;

    public void serialize() {

        SerialSimpleEx object1 = new SerialSimpleEx("Pierwsza",19);
        object1.lista = Arrays.asList("Red","Black","Blue","Yellow");

        SerialSimpleEx object2 = new SerialSimpleEx("Druga",25);
        object2.lista= Arrays.asList("Gray","Blue","Orange");

        List<SerialSimpleEx> objectList= new ArrayList<SerialSimpleEx>();

        objectList.add(object1);
        objectList.add(object2);

        try
        {
            //Saving of object in a file

            FileOutputStream file = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(objectList);

            out.close();
            file.close();
            System.out.println("Object has been serialised ");

        }
        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }


    }

    public void deserialize() {
       String fileName = "simpleserial.ser" ;

       List<SerialSimpleEx> objectList= new ArrayList<SerialSimpleEx>();

        try
        {
            // Reading the object from a file
            FileInputStream file = new FileInputStream(fileName);
            ObjectInputStream in = new ObjectInputStream(file);

            // Method for deserialization of object
            objectList = (List<SerialSimpleEx>)in.readObject();

            in.close();
            file.close();

            System.out.println("Object has been deserialized ");

            for (SerialSimpleEx object : objectList) {
               System.out.println(object.toString());
            }



        }

        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }

        catch(ClassNotFoundException ex)
        {
            System.out.println("ClassNotFoundException is caught");
        }


    }
    public SerializationExample(){
        serialize();
        deserialize();
    }
}
