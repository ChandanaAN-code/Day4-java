import java.util.LinkedHashSet;
public class Linkedhashset {
    public static void main(String[] args) {
        LinkedHashSet<String> names=new LinkedHashSet<>();
        names.add("John");
        names.add("Alice");
        names.add("David");
        names.add("Robert");
        names.add("John");
        System.out.println("LinkedHashset:"+names);
        names.remove("David");
        System.out.println("Contains Alice:"+names.contains("Alice"));
        System.out.println("Size:"+names.size());
        System.out.println("Is Empty:"+names.isEmpty());


        
    }
    
}

