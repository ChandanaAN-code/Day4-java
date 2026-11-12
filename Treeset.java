import java.util.TreeSet;
public class Treeset {
    public static void main(String[] args) {
        TreeSet<String> names=new TreeSet<>();
        names.add("John");
        names.add("Alice");
        names.add("David");
        names.add("Robert");
        names.add("John");
        System.out.println("Treeset:"+names);
        names.remove("David");
        System.out.println("Contains Alice:"+names.contains("Alice"));
        System.out.println("Size:"+names.size());
        System.out.println("Is Empty:"+names.isEmpty());


        
    }
    
}
