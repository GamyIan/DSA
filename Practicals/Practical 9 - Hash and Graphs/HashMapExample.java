import java.util.HashMap;
// HashMap - fast and unordered
// TreeMap - sorted by key, slower than Hashmap
// LinkedHashMap - ordered by insertion

public class HashMapExample {
    
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        students.put(1,"Anand");
        students.put(2,"Ashwin");
        students.put(3,"Arun");
        students.put(4,"Bijay");

        System.out.println("============= Printing Keys =============");
        for (int i : students.keySet()){
            System.out.println(i);
        }

        System.out.println("============= Printing Values =============");
        for (String name : students.values()){
            System.out.println(name);
        }

        System.out.println("============= Printing Keys and Values =============");
        System.out.println("students = {");
        for (int i: students.keySet()){
            System.out.println(i+" : "+students.get(i)+",");
        }
        System.out.println("}");

        System.out.println("============= Removing and Printing =============");
        students.remove(2);
        System.out.println("students = {");
        for (int i: students.keySet()){
            System.out.println(i+" : "+students.get(i)+",");
        }
        System.out.println("}");
    }
}
