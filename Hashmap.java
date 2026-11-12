import java.util.HashMap;
public class Hashmap {
    public static void main(String[] args)
    {
        HashMap<Integer,String>students=new HashMap();
        students.put(101,"John");
        students.put(102,"Alice");
        students.put(103,"David");
        students.put(104,"Robert");
         students.put(105,"John");
        students.put(106,"Alice");
        students.put(107,"David");
        students.put(108,"Robert");
         students.put(109,"John");
        students.put(110,"Alice");
        students.put(111,"David");
        students.put(112,"Robert");
        System.out.println("HashMap:"+students);
        System.out.println("Student 101:"+students.get(101));
        students.put(102,"peter");
        students.remove(103);
        System.out.println("Contains key 101:"+students.containsKey(101));
        System.out.println("Contains value John:"+students.containsValue("John"));
        System.out.println("Size:"+students.size());
    }
    
}
