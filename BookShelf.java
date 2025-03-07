import java.util.ArrayList;

public class BookShelf {
    public char firstLetter;
    public ArrayList<Book> bookShelf;

    public BookShelf(){
        this.firstLetter = 'A';
        this.bookShelf = new ArrayList<Book>(8);
        for(int i=0; i<10; i++){
            bookShelf.add(null);
        }
    }

    public void setFirstLetter(char firstLetter){
        this.firstLetter = firstLetter;
    }

    public char getFirstLetter(){
        return this.firstLetter;
    }

    public void addBook(Book book){
        if(book.title.charAt(0) == this.firstLetter){//I found charAt in the
            //requested dropdown menu and I don't know if it's what I'm supposed to do
            this.bookShelf.add(book);
        } else {
            return;
        }
    }

    public void removeBook(int index){
        if(index <= 8){
            bookShelf.remove(index);
        }
    }

    @Override
    public String toString(){
        String bookLine = "";
        for(int i=0; i<bookShelf.size(); i++){
            if(bookShelf.get(i) != null){
                bookLine = bookLine + bookShelf.get(i) + "  ";
            }
        }
        if(bookLine.length() == 0){
            bookLine = "Empty";
        }
        return bookLine;
    }
}