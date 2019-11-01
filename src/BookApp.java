public class BookApp {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setTitle("hello");
        book1.setAuthor("me");
        book1.setDescription("fiction");
        book1.setPrice(2.5);
        book1.setIsInStock("yes");
        int numBook=5;
        System.out.println(book1.total(numBook));

        System.out.println(book1.getTitle()+" "+book1.getAuthor()+" "+book1.getDescription()+" "+book1.getPrice()+" "+book1.getIsInStock());

    }
}
