package org.example.lectures.lecture6;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class App1 {
    public static void main(String[] args) {
//        Human human = new Human("Vasya",25, "47474747");
//        serObj(human, "Human");
//        Human human1 = deSerObj("Human");
//        System.out.println(human1);
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("DB", "gmp");
        stringMap.put("login", "vasya");
        stringMap.put("pass", "234566");
        saveProperties("properties", stringMap);

        System.out.println(readProperty("login", "properties" ));
    }

    public static void saveProperties(String path, Map<String, String> prop) {
        Properties properties = new Properties();
        prop.forEach((k, v) -> properties.setProperty(k, v));
        try {
            properties.store(new FileOutputStream(path), "My properties");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static String readProperty(String key, String path) {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties.getProperty(key);
    }

    public static Human deSerObj(String path) {
        Human human = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))) {
            human = (Human) ois.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return human;
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
