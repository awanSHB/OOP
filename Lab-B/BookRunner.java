public class BookRunner {
    public static void main(String args[]){
        String cn[] = {"classes", "objects", "varibles", "Strings"};
        Book b1 = new Book("Qasim", cn);
        Book b2 = new Book();
        b2.setAuthor("Qasim");
        String cns[] = {"Datatype", "encapsulation", "Polymorphism", "Stack", "Heap"};
        b2.setChapternames(cns);
        
        Book ab = new Book();
        System.out.println(ab.compareAuthors(b1, b2));
        
        System.out.println("\nAfter changing author name: ");
        
        b2.setAuthor("Hassan");
        System.out.println("The author of book with greater chapter names is "+ab.comparechaptername(b1, b2));
    }
}	