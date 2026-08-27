public class Week10ObjectsStarter {

    static class Book {
        private String title;
        private int pages;

        public Book(String title, int pages) {
            this.title = title;
            this.pages = pages;
        }

        public String getTitle() {
            return title;
        }

        public int getPages() {
            return pages;
        }

        public void setPages(int pages) {
            this.pages = pages;
        }
    }

    public static void updatePages(Book book, int pages) {
        book.setPages(pages);
    }

    public static void main(String[] args) {
        Book book = new Book("TODO", 0);

        updatePages(book, 120);
        System.out.println(book.getTitle() + " has " + book.getPages() + " pages.");
    }
}
