
import java.util.LinkedHashMap;
public class Linkedhashmap2 {
    public static void main(String[] args)
    {
        LinkedHashMap<Integer,String>students=new LinkedHashMap<>();
        students.put(101,"John");
        students.put(102,"Alice");
        students.put(103,"David");
        students.put(104,"Robert");
        students.put(104,"Peter");
        System.out.println("LinkedHashMap:"+students);
        System.out.println("Student 101:"+students.get(102));
        students.put(103,"Mary");
        students.remove(105);
        System.out.println("Contains key 101:"+students.containsKey(101));
        System.out.println("Contains value John:"+students.containsValue("John"));
        System.out.println("All student ids :"+students.keySet());
        System.out.println("All student names :"+students.values());
    }
    
}

