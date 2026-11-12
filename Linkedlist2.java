import java.util.LinkedList;
public class Linkedlist2 {
    
    public static void main(String[] args) {
       LinkedList<String>songs=new LinkedList<>();
       songs.add("Feel my love..");
        songs.add("Uppentha...");
        songs.add("Mr.perfect...");
        songs.add("kariga loga..");
        songs.add("My Love is Gone..");
        songs.addFirst("Yedo priyaragam....");
        songs.addLast("Baby he Loves u..");
        songs.remove("Yedo Priyaragam");
        System.out.println("First song:"+songs.get(0));
        int a=songs.size();
        System.out.println("Last song:"+songs.get(a-1));
        System.out.println("Album:"+songs);

    }
}
