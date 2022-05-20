public class BookMain {
    public static void main(String[] args) {
        Book book = new Book();
        book.setId(1L);
        book.setName("novel");
        book.setPrice(120.32);
        book.print();
    }
}
