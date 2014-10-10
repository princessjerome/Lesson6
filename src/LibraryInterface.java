public class LibraryInterface {
    
    public static void main (String[] args){
        Book b1, b2, b3, b4, b5;
        b1 = new Book("From Russia With Love", "Greg Hines");
        b2 = new Book("Living Smart", "Rita Langill");
        b3 = new Book("Singing in the Rain", "Harry Conner");
        b4 = new Book("Good Housekeeping", "Pat Burns");
        b5 = new Book("To Be a Model", "Lisa Lahey");
        System.out.println("Here are the books available: ");
        System.out.println(b1.getTitle());
        System.out.println(b2.getTitle());
        System.out.println(b3.getTitle());
        System.out.println(b4.getTitle());
        System.out.println(b5.getTitle());
        Patron p = new Patron("Miles Davis");
        
        System.out.println("Lending 4 books to " + p.getName());
        if(p.borrow(b1)) System.out.println (b1.getTitle()+ " successfully borrowed.");
        else             System.out.println (b1.getTitle()+ " could not be borrowed.");
        
        if(p.borrow(b2)) System.out.println (b2.getTitle() + " successfully borrowed.");
        else             System.out.println (b2.getTitle() + " could not be borrowed.");
        
        if(p.borrow(b3)) System.out.println (b3.getTitle() + " successfully borrowed.");
        else             System.out.println (b3.getTitle() + " could not be borrowed.");
        
        if(p.borrow(b4)) System.out.println (b4.getTitle() + " successfully borrowed.");
        else             System.out.println (b4.getTitle() + " could not be borrowed.");
        
        System.out.println("------\nAttempting to return the first book:\n---------");
        if(p.returnBook(b1)) System.out.println(b1.getTitle() + " successfully returned.");
        else                 System.out.println(b1.getTitle() + " was not borrowed out.");
        System.out.println("------\nHere is a list of books currently lent to " + p.getName() + "\n---------");
        if (p.hasBook(b1)) System.out.println(b1.getTitle());
        if (p.hasBook(b2)) System.out.println(b2.getTitle());
        if (p.hasBook(b3)) System.out.println(b3.getTitle());
        if (p.hasBook(b4)) System.out.println(b4.getTitle());
        if (p.hasBook(b5)) System.out.println(b5.getTitle());
    }
}
