import java.util.HashSet;

public class HashSetExample {

    public static void main(String[] args) {
        
        HashSet<String> browsers = new HashSet<>();
        browsers.add("Chrome");
        browsers.add("Firefox");
        browsers.add("Edge");
        browsers.add("Edge"); // Duplicate value will appear only once

        // Will print randomly because order is not preserved when inserting or storing elements.
        for (String s: browsers){
            System.err.println(s);
        }


    }
}