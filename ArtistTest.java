import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class ArtistTest {

    @Test
    public void testAddArtist() {
        Artist artist1 = new Artist("569MMMRR_%", "John Doe", "Melbourne|Victoria|Australia",
                "05-11-1980", "This is a valid bio.",
                new ArrayList<>(List.of("Singer", "Songwriter")),
                new ArrayList<>(List.of("pop", "classical")),
                new ArrayList<>(List.of("2022, Best Song Written For Visual Media")));
        assertTrue(artist1.addArtist());

        Artist artist2 = new Artist("1234567890", "Jane Smith", "Melbourne|Victoria",
                "05/11/1980", "Short bio",
                new ArrayList<>(),
                new ArrayList<>(List.of("pop", "rock")),
                new ArrayList<>(List.of("1999, Best Artist")));
        assertFalse(artist2.addArtist());

        // Additional test cases can be added for other conditions...
    }

    @Test
    public void testUpdateArtist() {
        Artist artist1 = new Artist("569MMMRR_%", "John Doe", "Melbourne|Victoria|Australia",
                "05-11-1980", "This is a valid bio.",
                new ArrayList<>(List.of("Singer", "Songwriter")),
                new ArrayList<>(List.of("pop", "classical")),
                new ArrayList<>(List.of("2022, Best Song Written For Visual Media")));
        assertTrue(artist1.updateArtist());

        Artist artist2 = new Artist("1234567890", "Jane Smith", "Melbourne|Victoria|Australia",
                "05-11-1995", "Updated bio.",
                new ArrayList<>(List.of("Singer")),
                new ArrayList<>(List.of("rock")),
                new ArrayList<>());
        assertFalse(artist2.updateArtist());

        // Additional test cases can be added for other conditions...
    }
}
