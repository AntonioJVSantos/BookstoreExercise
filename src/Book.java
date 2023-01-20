public class Book implements Printable {
    private String Title;
    private String id;
    private String author;
    private Double price;
    
    public Book(String title, String id, String author, Double price) {
        Title = title;
        this.id = id;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return Title;
    }

    public String getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public Double getPrice() {
        return price;
    }
    public void print(){
        System.out.println("ID do livro: "+this.id+" Titulo do livro: "+this.Title+" Autor: "+this.author+" Preço: "+this.price);
    }
    
}
