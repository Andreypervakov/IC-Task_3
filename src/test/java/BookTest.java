import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.library.Book;
import ru.library.Category;

public class  BookTest {

    @Test
    public void shouldSetCategory() {
        final Book book = new Book("bookName", "bookAuthor");
        book.setCategory(new Category("categoryName"));

        Assertions.assertNotNull(book.getCategory());
    }

    @Test
    public void  shouldGetName() {
        final Book book = new Book("bookName", "bookAuthor");
        book.getName();

        Assertions.assertEquals ("bookName", book.getName());

    }
    @Test
    public void shouldGetAuthor(){
        final Book book = new Book("bookName", "bookAuthor");
        book.getAuthor();

        Assertions.assertEquals ("bookAuthor", book.getAuthor());
    }
}
