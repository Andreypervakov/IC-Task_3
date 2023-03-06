import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.library.Newspaper;

import java.time.Instant;
import java.util.Date;

public class NewspaperTest {
    @Test
    public void shouldGetNewspaperDate(){
        final Newspaper newspaper =  new Newspaper(null, Instant.now());
        newspaper.getDate();

        Assertions.assertNotNull( newspaper.getDate());

    }
}
