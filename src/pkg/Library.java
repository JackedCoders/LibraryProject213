package pkg;

import java.util.Arrays;

public class Library {
    private Book[] books; // array-based implementation of the bag data structure
    private int numBooks; // the number of books currently in the bag

    public Library() { //default constructor to create an empty bag
        this.books = new Book[4];
        this.numBooks = 0;
    }
    private int find(Book book) { // helper method to find a book in the bag
        return 0;
    }
    private void grow() { // helper method to grow the capacity by 4
        Book [] newBooks = Arrays.copyOf(this.books,this.books.length+4);
        
    }
    public void add(Book book) {
        if(numBooks == books.length){
            this.grow();
        }
        books[++numBooks] = book;
    }
    public boolean remove(Book book) { return false;}
    public boolean checkOut(Book book) { return false;}
    public boolean returns(Book book) { return false;}
    public void print() { } //print the list of books in the bag
    public void printByDate() { } //print the list of books by datePublished (ascending)
    public void printByNumber() { } //print the list of books by number (ascending)
}
