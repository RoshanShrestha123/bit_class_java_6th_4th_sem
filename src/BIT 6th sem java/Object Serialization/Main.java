import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
// import java.io.*;
// import java.io.FileNotFoundException;


public class Main{
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        FileOutputStream fileOutputStream = new FileOutputStream("Anoop.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        Person person = new Person();
        objectOutputStream.writeObject(person);

        // object deserialize
        FileInputStream fileInputStream = new FileInputStream("Anoop.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Person person2 = (Person) objectInputStream.readObject();
        person2.displayName();
    }
} 