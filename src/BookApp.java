import java.util.ArrayList;
import java.util.Scanner;

public class BookApp {
    public static void main(String[] args) {
        ArrayList<Book> database= new ArrayList<>();
        Book book1 = new Book();
        book1.setSku("Java1001");
        book1.setTitle("Head First Java");
        book1.setAuthor("Kathy Sierra and Bert Bates");
        book1.setDescription("Easy to read Java workbook");
        book1.setPrice(47.5);
        book1.setIsInStock("yes");
        database.add(book1);
        Book book2 = new Book();
        book1.setSku("Java1002");
        book1.setTitle("Thinking in Java");
        book1.setAuthor("Bruce Eckel");
        book1.setDescription("Details about Java under the hood");
        book1.setPrice(20.00);
        book1.setIsInStock("yes");
        database.add(book2);
        Book book3 = new Book();
        book1.setSku("Orcl1003");
        book1.setTitle("OCP:Oracle Certified Professional Java SE");
        book1.setAuthor("Jeanne Boyarsky");
        book1.setDescription("Everything you need to know in one place");
        book1.setPrice(45.00);
        book1.setIsInStock("yes");
        database.add(book3);
        System.out.println("What is the SKU of the book you are looking for? ");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.next();
        switch (userInput){
            case "Orcl1003" = database.get(0).getDisplayText();
        }
        database.get(0).getDisplayText();
    }
}
