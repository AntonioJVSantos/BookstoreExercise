import java.util.ArrayList;
import java.util.HashMap;

public class Catalog implements Printable {
    private String id;
    private HashMap<String,Book> mapaBook;
    public Catalog(String id) {
        this.id = id;
        this.mapaBook=new HashMap<>();
    }
    public void addBook(Book book){
        if(this.mapaBook.containsKey(book.getId())){
            System.out.println("impossivel inserir livro com ID duplicado");
        }
        else{
            this.mapaBook.put(book.getId(), book);
        }
        
        
        
    }
    public void removeBook(String id){
        if(this.mapaBook.containsKey(id)){
            this.mapaBook.remove(id);
        }
    }
    public ArrayList<Book> getExactName(String nome){
        ArrayList<Book> temporaria= new ArrayList<>();
        for(String key:mapaBook.keySet()){
            if(mapaBook.get(key).getTitle().equals(nome)){
                temporaria.add(mapaBook.get(key));
            }
        }
        return temporaria;
    }
    public ArrayList<Book> getSubstring(String sub){
        ArrayList<Book> temporaria= new ArrayList<>();
        for(String key:mapaBook.keySet()){
            if(mapaBook.get(key).getTitle().contains(sub)){
                temporaria.add(mapaBook.get(key));
            }
        }
        return temporaria;
    }
    public double getMedia(){       
        double total=0;
        for(String key:mapaBook.keySet()){
            total+=mapaBook.get(key).getPrice();
        }
        return total/mapaBook.size();
    }
    public void print(){
        System.out.println("Lista do Catalogo com ID "+this.id);
        for(String key:mapaBook.keySet()){
            mapaBook.get(key).print();
        }
    }
}
