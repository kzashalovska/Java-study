package org.example.practice.practice5;

import java.io.*;

public class SerializationGroup {
    public static Group deSerObj(String path) {
        Group group = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))) {
            group = (Group) ois.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return group;
    }


    public static void serObj(Serializable ob, String path) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path))) {
            oos.writeObject(ob);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}