package be.vdab.Composition;

import be.vdab.Composition.Books.Book;
import be.vdab.Composition.Creators.Author;

public class BookApp {
    public static void main(String[] args) {

        /**
         * Where you placed these lines originally they were actually class variables like 'String name' and 'int age'
         * You need to execute this in a main method. I created an app class with a main method for you.
         */
        //
        // You should not make Author abstract. That's why you had to put { } behind the constructor here.
        // new Author(... ) { }; What's happening here is you're putting an anonymous class behind an object initializer of an abstract class.
        // Remember we can't create objects of abstract classes!! We need to implement this class first with a concrete class.
        // The { } anonymous class is a fast way of doing this. Inside there should be implementations of eventuele abstract methods in the abstract class, but since there were none in your Author class an empty { } sufficed.
        Author FowsiaKoofi = new Author("Fowsia Koofi", "koofi.fawsia@pakistan.com", 'f');
        Book LTMC = new Book("Letters to my children", "Fowsia Koofi", 20,30);

    }
}
