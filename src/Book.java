public class Book {

    private String title;
    private String author;
    private String description;
    private double price;
    private String isInStock;
    private String sku;

    public Book(){

    }
    public Book(String title, String author, String description, double price, String isInStock, String sku){
        this.title = title;
        this.author = author;
        this.description = description;
        this.price = price;
        this.isInStock = isInStock;
        this.sku = sku;

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
    public void setDescription(String description){
        this.description=description;
    }
    public double getPrice(){
        return this.price;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public String getIsInStock(){
        return this.isInStock;
    }
    public void setIsInStock(String isInStock){
        this.isInStock=isInStock;
    }

    public String getSku(){
        return this.sku;
    }

    public void setSku(String sku){
        this.sku = sku;
    }

    public double total(int x){
        double total= x*20;
        return total;
    }

    public void getDisplayText(){
        System.out.println(author+", "+title+", "+description);
    }
}
