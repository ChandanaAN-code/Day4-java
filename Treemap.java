import java.util.TreeMap;
public class Treemap {
    public static void main(String[] args)
    {
        TreeMap<Integer,String>students=new TreeMap();
        students.put(101,"John");
        students.put(102,"Alice");
        students.put(103,"David");
        students.put(104,"Robert");
        System.out.println("TreeMap:"+students);
        System.out.println("Student 101:"+students.get(101));
        students.put(102,"peter");
        students.remove(103);
        System.out.println("Contains key 101:"+students.containsKey(101));
        System.out.println("Contains value John:"+students.containsValue("John"));
        System.out.println("Size:"+students.size());
    }
    
}

