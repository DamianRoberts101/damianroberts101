public class Week10ObjectsStarter {

    static class Book {
        String title;
        int pages;
    }

    public static void updatePages(Book book, int pages) {
        book.pages = pages;
    }

    public static void main(String[] args) {
        Book book = new Book();
        book.title = "TODO";
        book.pages = 0;

        updatePages(book, 120);
        System.out.println(book.title + " has " + book.pages + " pages.");
    }
}
