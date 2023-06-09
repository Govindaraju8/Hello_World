import java.util.*;
class Book
{
    private String title;
    private String Author;
    private String publisher;
    public Book(String t,String A,String p)
    {
        this.title=t;
        this.Author=A;
        this.publisher=p;
    }
    public String gettitle()
    {
        return title;
    }
    public String getAuthor()
    {
        return Author;
    }
    public String getpublisher()
    {
        return publisher;
    }
}
public class Hashmapp1{
    public static void main(String args[])
    {
        Map<String,HashMap<Integer,Book>> library=new HashMap<>();
        HashMap<Integer,Book> h1=new HashMap<>();
        // for the first department
        h1.put(101,new Book("c programming","dennis","srinivas"));
        h1.put(102,new Book(" java programming","james","indira publisher"));
        h1.put(103,new Book(" c++ programming"," Bjarne Stroustrup","ravi chandra"));
        // for the second Department
        HashMap<Integer,Book> h2=new HashMap<>();
        h2.put(1001,new Book(" BEEE","dennis","srinivas"));
        h2.put(1002,new Book(" computer economics","james","indira publisher"));
        h2.put(1003,new Book(" semiconductors"," Bjarne Stroustrup","ravi chandra"));
        // for the third department
        HashMap<Integer,Book> h3=new HashMap<>();
        h3.put(10001,new Book(" Digital Electronics","dennis","srinivas"));
        h3.put(10002,new Book(" power systems","james","indira publisher"));
        h3.put(10003,new Book(" control systems"," Bjarne ","ravi chandra"));
        library.put("cse",h1);
        library.put("ece",h2);
        library.put("eee",h3);
        // printing the output using the for each loop
        for (String department : library.keySet()) {
            System.out.println("Department: " + department);

            HashMap<Integer, Book> books = library.get(department);
            for (Integer bookId : books.keySet()) {
                Book book = books.get(bookId);
                System.out.println("Book ID: " + bookId);
                System.out.println("Title: " + book.gettitle());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("Publisher: " + book.getpublisher());
                System.out.println();
            }
        }
        // printing th output using entry set
        /*
        for (Map.Entry<String, HashMap<Integer, Book>> entry : library.entrySet()) {
            String department = entry.getKey();
            HashMap<Integer, Book> books = entry.getValue();
            System.out.println("Department: " + department);

            for (Map.Entry<Integer, Book> bookEntry : books.entrySet()) {
                int bookId = bookEntry.getKey();
                Book book = bookEntry.getValue();
                System.out.println("Book ID: " + bookId);
                System.out.println("Title: " + book.gettitle());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("Publisher: " + book.getpublisher());
                System.out.println();
            }
        }*/

}
        //System.out.println(library);
}