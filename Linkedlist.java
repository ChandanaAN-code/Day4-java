import java.util.LinkedList;
public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<String> names=new LinkedList<>();
        names.add("John");
        names.add("Alice");
        names.add("David");
        names.add("Robert");
        System.out.println("LinkedList:"+names);
        System.out.println("First ELement:"+names.get(0));
        names.set(1,"Peter");
        names.remove("David");
        names.addFirst("Sam");
        names.addLast("Tom");
        System.out.println("Size:"+names.size());

    }
    
}
