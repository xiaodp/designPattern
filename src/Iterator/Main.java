package Iterator;

public class Main {

    public static void main(String[] args) {

        BookShelf bookShelf = new BookShelf();
        bookShelf.append(new Book("Tom and Jerry1"));
        bookShelf.append(new Book("Tom and Jerry2"));
        bookShelf.append(new Book("Tom and Jerry3"));
        bookShelf.append(new Book("Tom and Jerry4"));
        Iterator iterator = bookShelf.iterator();
        for(;iterator.hasNext();){
            Book book = (Book) iterator.next();
            System.out.println(book.getName());
        }

    }
}
