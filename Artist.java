import java.util.ArrayList;

public class Artist {
    private String ID;
    private String Name;
    private String Address;
    private String Birthdate;
    private String Bio;
    private ArrayList<String> Occupations;
    private ArrayList<String> Genres;
    private ArrayList<String> Awards;

    public Artist(String id, String name, String address, String birthdate, String bio,
                  ArrayList<String> occupations, ArrayList<String> genres, ArrayList<String> awards) {
        ID = id;
        Name = name;
        Address = address;
        Birthdate = birthdate;
        Bio = bio;
        Occupations = occupations;
        Genres = genres;
        Awards = awards;
    }

    public boolean addArtist() {
        // Implement the logic for adding an artist
        // You can simulate adding to a text file here
        // For this example, let's return true if any condition is met
        if (isValidArtistID(ID) || isValidBirthdate(Birthdate) || isValidAddress(Address) ||
            isValidBio(Bio) || isValidOccupations(Occupations) || isValidAwards(Awards)) {
            return true;
        }
        return false;
    }

    public boolean updateArtist() {
        // Implement the logic for updating an artist
        // You can simulate updating a text file here
        // For this example, let's return true if any condition is met
        if (isValidArtistID(ID) || (isValidBirthdate(Birthdate) && !isBornBefore2000(Birthdate)) ||
            isValidAwardsForUpdate(Awards)) {
            return true;
        }
        return false;
    }

    // Implement the validation methods (similar to the previous response)
    
    // Helper methods go here
    
    private boolean isValidArtistID(String id) {
        // Implement the ID validation logic
        return true;
    }

    // Other helper methods ss
}
