public class LibraryTester {
    public void main(){
        BookShelf bs1 = new BookShelf();
        bs1.setFirstLetter('O');
        BookShelf bs2 = new BookShelf();
        bs2.setFirstLetter('T');
        System.out.println(bs1);
        System.out.println(bs2);
        Book book1 = new Book("The Heart of the Betrayed", "Crime");
        Book book2 = new Book("Our Hill of Stars", "Fantasy");
        Book book3 = new Book("One of a Kind", "Science Fiction");
        Book book4 = new Book("The Vision of Roses", "Romance");
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(book4);
        bs1.addBook(book1);
        bs1.addBook(book2);
        bs1.addBook(book3);
        bs1.addBook(book4);
        bs2.addBook(book1);
        bs2.addBook(book2);
        bs2.addBook(book3);
        bs2.addBook(book4);
        System.out.println(bs1);
        System.out.println(bs2);
    }
}
