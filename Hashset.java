import java.util.HashSet;
public class Hashset {
    public static void main(String[] args) {
        HashSet<String> names=new HashSet<>();
        names.add("John");
        names.add("Alice");
        names.add("David");
        names.add("Robert");
        names.add("John");
        System.out.println("Hashset:"+names);
        names.remove("David");
        System.out.println("Contains Alice:"+names.contains("Alice"));
        System.out.println("Size:"+names.size());
        System.out.println("Is Empty:"+names.isEmpty());


        
    }
    
}
