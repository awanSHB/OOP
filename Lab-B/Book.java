public class Book {
    public String author;
    public String[] chapternames = new String[5];
    
    public Book(){
        author = "";
        chapternames = null; 
    }
    
    public Book(String a, String cn[]){
        author = a;
        chapternames = cn;
    }
    
    public void setAuthor(String a){
        author = a;
    }
    public void setChapternames(String cn[]){
        chapternames = cn;
    }
    
    public String getAuthor(){
        return author;
    }
    public String[] getChapternames(){
        return chapternames;
    }
    
    public String compareAuthors(Book b1, Book b2){
        if((b1.author).equals(b2.author)){
            return "Yes True";
        }else{
            return "No False";
        }
    }
    
    public String comparechaptername(Book b1, Book b2){
        
        if((b1.chapternames.length) > (b2.chapternames.length)){
            return b1.author;
        }else{
            return b2.author;
        }
    }

}
