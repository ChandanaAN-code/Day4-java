import java.util.TreeSet;
public class Treeset1 {
    public static void main(String[] args) {
        TreeSet<Integer> Ids=new TreeSet<>();
        Ids.add(101);
        Ids.add(102);
        Ids.add(103);
        Ids.add(104);
        Ids.add(105);
        Ids.add(106);
        Ids.add(107);
        Ids.add(108);
        Ids.add(109);
        Ids.add(110);
        Ids.add(103);
        System.out.println("Hashset:"+Ids);
        Ids.remove(103);
        System.out.println("Contains Alice:"+Ids.contains(105));
        System.out.println("Size:"+Ids.size());
        System.out.println("Is Empty:"+Ids.isEmpty());


        
    }
    
}
