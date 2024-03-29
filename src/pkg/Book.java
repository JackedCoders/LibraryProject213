/*
    CS 213 Project 1
    Authors: Prasidh Sriram & Manveer Singh
 */
package pkg;
public class Book {
    private String number;
    private String name;
    private boolean checkedOut;
    private Date datePublished;

    public Book (String number, String name, Date datePublished){
        this.number = number;
        this.name = name;
        this.checkedOut = false;
        this.datePublished = datePublished;
    }

    public String getNumber (){
        return this.number;
    }

    public Date getDatePublished(){
        return this.datePublished;
    }

    public boolean isCheckedOut () {
        return this.checkedOut;
    }

    public void setCheckedOut () {
        this.checkedOut = true;
    }

    public void setReturned () {
        this.checkedOut = false;
    }

    @Override
    public boolean equals(Object obj){
        Book newBook = (Book)obj;
        if(this.number.equals(newBook.number)){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        if(!checkedOut) {
            return "Book" + this.number + "::" + this.name + "::" + datePublished.toString() + "::is available.";
        }
        else{
            return "Book" + this.number + "::" + this.name + "::" + datePublished.toString() + "::is checked out.";
        }
    }
}
