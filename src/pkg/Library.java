/*
    CS 213 Project 1
    Authors: Prasidh Sriram & Manveer Singh
 */

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
        for(int i = 0; i < numBooks; i++){
            if(books[i].getNumber().equals(book.getNumber())){
                return i;
            }
        }
        return -1;
    }
    private void grow() { // helper method to grow the capacity by 4
        Book [] newBooks = new Book[books.length+4];
        for(int i = 0; i < books.length; i++){
            newBooks[i] = books[i];
        }
        this.books = newBooks;
    }
    public Book findBook(String number){ //Find book number given object
        for(int i = 0; i < books.length; i++){
            if(books[i].getNumber().equals(number)){
                return books[i];
            }
        }
        return null;
    }

    public void add(Book book) {
        if(numBooks+1 == books.length){
            this.grow();
        }
        books[numBooks+1] = book;
        numBooks++;
    }

    public boolean remove(Book book) {
        int index = find(book);
        if(index == -1) {
            return false;
        }
        books[index] = null;
        for(int i = index; i < numBooks; i++){
            books[i] = books[i+1];
        }
        numBooks--;
        return true;
    }

    public boolean checkOut(Book book) {
        int index = find(book);
        if(index == -1){

            return false;
        }

        if(books[index].isCheckedOut()){
            return false;
        }

        books[index].setCheckedOut();
        return true;
    }
    public boolean returns(Book book) {
        int index = find(book);
        if(index == -1){
            return false;
        }

        if(!books[index].isCheckedOut()){
            return false;
        }

        books[index].setReturned();
        return true;
    }

    public void print() { //print the list of books in the bag
        if(numBooks == 0){
            System.out.println("Library catalog is empty!");
            return;
        }
        System.out.println("** List of books in the library.");
        for(int i = 0; i<=numBooks; i++){
            if(books[i] != null){
                System.out.println(this.books[i].toString());
            }
        }
        System.out.println("**End of list");
    }

    public void printByDate() { //print the list of books by datePublished (ascending)

        int n = numBooks;
        if(n == 0){
            System.out.println("Bookshelf is empty!");
            return;
        }
        for(int i = 1; i<n; i++){
            Book key = books[i];
            int j = i - 1;

            while((books[j] != null && books[i] != null) && j>= 0 && books[j].getDatePublished().compare(key.getDatePublished()) > 0){
                books[j+1] = books[j];
                j = j - 1;
            }
            books[j+1] = key;
        }
        System.out.println("** List of books by the dates published.");
        for(int i = 0; i <= numBooks; i++){
            if(books[i] != null) {
                System.out.println(this.books[i].toString());
            }
        }
        System.out.println("** End of list");
    }
    public void printByNumber() { //print the list of books by number (ascending)
        int n = numBooks;
        if(n == 0){
            System.out.println();
        }
        for(int i = 1; i < n; i++){
            Book key = books[i];
            int j = i - 1;

            while((books[j] != null && books[i] != null) && j >= 0 && Integer.valueOf(books[j].getNumber()) > Integer.valueOf(key.getNumber())){
                books[j+1] = books[j];
                j = j-1;
            }
            books[j+1] = key;
        }
        System.out.println("** List of books by the book numbers.");
        for(int i = 0; i <= numBooks; i++){
            if(books[i] != null) {
                System.out.println(this.books[i].toString());
            }
        }
        System.out.println("** End of list");
    }
}
