package be.vdab.Composition.Creators;

public class Author {

    private String name;
    private String email;
    private char gender;

    public Author (String name, String email, char gender){};

    /**
     * this down here is a field of your Author class now... Creating specific objects should be done in a main app.
     */
    Author FowsiaKoofi = new Author("Fowsia Koofi", "koofi.fawsia@pakistan.com", 'f') {
    };


    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    /**
     * no tostring?
     */
}
