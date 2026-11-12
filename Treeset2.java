import java.util.TreeSet;
public class Treeset2 {
    public static void main(String[] args) {
        TreeSet<Integer> marks=new TreeSet<>();
        marks.add(75);
        marks.add(90);
        marks.add(65);
        marks.add(85);
        marks.add(95);
        marks.add(75);
        marks.add(80);
        System.out.println("Marks in Ascending Order:"+marks);
        System.out.println("Lowest Marks:"+marks.first());
        System.out.println("Highest Marks:"+marks.last());
        marks.remove(65);
        System.out.println(" 90 eists in marks:"+marks.contains(90));
        System.out.println("Number of unique marks:"+marks.size());
        


    }
    
}
