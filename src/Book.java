public class Book {

    private String title;
    private String author;
    private String description;
    private double price;
    private String isInStock;

    public Book(){

    }
    public Book(String title, String author, String description, double price, String isInStock){
        this.title = title;
        this.author = author;
        this.description = description;
        this.price = price;
        this.isInStock = isInStock;

    }
    public String getTitle(){
        return this.title;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public String getAuthor(){
        return this.author;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public String getDescription(){
        return this.description;
    }
    public void setDescription(){
        this.description=description;
    }
    public double getPrice(){
        return this.price;
    }
    public void setPrice{
        this.price=price;
    }
    public String getIsInStock(){
        return this.getIsInStock();
    }
    public void setIsInStock(){
        this.isInStock=isInStock;
    }

}
