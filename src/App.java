import java.util.ArrayList;

public class App {
        
    public static void main(String[] args) throws Exception {

    Book livro1=new Book("Os Maias","1","Eça",10.00);
    Book livro2=new Book("Lusiadas","2","Camões",15.00);
    Book livro3=new Book("Livro do Desassossego","3","Fernando Pessoa",20.00);
    Book livro4=new Book("Livro Incrivel","4","Antonio Santos",1.00);
    Book livro5=new Book("Livro Incrivel","5","Antonio Santos",10.00);
    Book livro6=new Book("Livro Removido","6","Antonio Santos",10000.00);
    Catalog bertrand=new Catalog("1");

    bertrand.addBook(livro1);
    bertrand.addBook(livro1);
    bertrand.addBook(livro2);
    bertrand.addBook(livro3);
    bertrand.addBook(livro4);
    bertrand.addBook(livro5);
    bertrand.addBook(livro6);
    bertrand.removeBook("6");
    bertrand.print();

    System.out.println("Pesquisa no catalogo por 'Livro'");
     ArrayList<Book> procuraTitulo=bertrand.getSubstring("Livro");
     for(Book l:procuraTitulo){
         l.print();
     }
     System.out.println("Pesquisa no catalogo pelo livro 'Livro Incrivel' ");
     ArrayList<Book> procuraExacta=bertrand.getExactName("Livro Incrivel");
     for(Book l2:procuraExacta){
         l2.print();
     }
    System.out.println("A media do preço dos livros é : "+bertrand.getMedia());
    }
}
