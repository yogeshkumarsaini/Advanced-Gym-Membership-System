import java.io.*;
import java.util.*;

public class FileHandler {

    public static void save(List<Member> members) throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("gym.dat"));
        oos.writeObject(members);
        oos.close();
    }

    public static List<Member> load() throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("gym.dat"));
        return (List<Member>) ois.readObject();
    }
}