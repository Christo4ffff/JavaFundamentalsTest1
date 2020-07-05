package Composition.Creators;

public abstract class Author {

    private String name;
    private String email;
    private char gender;

    public Author (String name, String email, char gender){};

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
}
