package pkg;

public class Book {
    private String number;
    private String name;
    private boolean checkedOut;
    private Date datePublished;

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

        return "Book"+this.number+"::"+this.name+"::";
    }
}
