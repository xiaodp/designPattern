package Iterator;

import java.util.ArrayList;
import java.util.List;

public class BookShelf implements Aggregate {

   private List<Book> books  = null;
   private int last = 0;

   public BookShelf(){
       books = new ArrayList<Book>();
   }

   public void append(Book book){
       books.add(book);
   }

   public Book getBookAt(int index){
       return books.get(index);
   }

   public int getLength(){
       return books.size();
   }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
