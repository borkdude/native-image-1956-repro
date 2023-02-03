import java.net.*;
import java.io.File;

public class ClassLoader {
    public static void main(String [] args) throws java.io.IOException, MalformedURLException {
        File path = new File(args[0]);
        URL url = path.toURI().toURL();
        URL[] urls = { url };
        URLClassLoader uc = new URLClassLoader(urls);
        System.out.println("getResourceAsStream: " + uc.getResourceAsStream("my_file.txt"));
        System.out.println("getResource: " + uc.getResource("my_file.txt"));
        System.out.println("findResource: " + uc.findResource("my_file.txt"));
        System.out.println("getResourceS: " + java.util.Collections.list(uc.getResources("my_file.txt")));
        System.out.println("findResourceS: " + java.util.Collections.list(uc.findResources("my_file.txt")));
    }
}
