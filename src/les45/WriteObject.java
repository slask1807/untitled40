package les45;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
Person person = new Person(1, "Tom");
        Person person1 = new Person(2, "El");
        try {
            FileOutputStream fos = new FileOutputStream("peaple.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
