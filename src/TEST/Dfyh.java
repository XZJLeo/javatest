package TEST;

import java.util.Properties;
import java.util.Set;

public class Dfyh {
    public static void main(String[] args) throws Exception {
        createObject();
    }

    public static void createObject() throws Exception {

        Properties pro = new Properties();
        pro.load(Student.class.getResourceAsStream("/stu.properties"));
        Set<String> name = pro.stringPropertyNames();
        name.stream().forEach(n -> {
            System.out.println("key:" + n + "value:" + pro.getProperty(n));
        });

    }
}