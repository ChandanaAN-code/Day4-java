import java.util.*;
public class Lms1 {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> avabooks=new LinkedHashMap<>();
        LinkedHashMap<String,String> issbooks=new LinkedHashMap<>();
        LinkedHashMap<Integer,String> returnbook=new LinkedHashMap<>();
        LinkedHashMap<String,String> history=new LinkedHashMap<>();
        int bookId,stuid;
        String bookname,bookid,stuname,date;
        do
        {
        System.out.println("Operations to be performed: 1.Add book \n2.Display History \n3.issue a book \n4.Return a book \n5.Display All books\n");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter ur choice:");
        int choice=sc.nextInt();
    
        if(choice==1)
        {
            System.out.println("Add a Book:");
            System.out.println("Enter Number of books to add:");
            int n=sc.nextInt();
            for (int i=0;i<n;i++)
            {
            System.out.println("Enter a book ID:");
            bookId=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter a book Name:");
            bookname=sc.nextLine();
            avabooks.put(bookId,bookname);
            }
        }
        else if(choice==2)
        {
            System.out.println("Library History");
           System.out.println(history);
        }
        else if(choice==3)
        {
            System.out.println("Issue a Book");
            System.out.println("Enter a book ID:");
            bookid=sc.nextLine();
            sc.nextLine();
            System.out.println("Enter a book Name:");
            bookname=sc.nextLine();
            System.out.println("Enter a Student ID:");
            stuid=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter a student Name:");
            stuname=sc.nextLine();
            System.out.println("Enter a Date:");
            date=sc.nextLine();
            history.put("BookId","bookid");
            history.put("BookName","bookname");
            history.put("StudentId","stuid");
            history.put("StudentName","stuname");

        }
        else if(choice==4)
        {
            System.out.println("Return a book");
            System.out.println("Enter a Student ID:");
            stuid=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter a Book Name:");
            bookname=sc.nextLine();
            returnbook.put(stuid,"bookname");

        }
        else if(choice==5)
        {
          System.out.println("Dispaly all books");
          System.out.println(avabooks);
        }
        else if(choice==6)
        {
            System.out.println("Exit the loop ");
            break;
           
        }

        }while(true);
    }
}
