public class Book extends LibraryItem{
     private String author;
     private int edition;
     private int publishingYear;

     Book(){super();}

     Book(String ISBN,String title, int availableCopies,String checkoutID, String dueDate,
     String author, int edition, int publishingYear){
        super(ISBN, title,  availableCopies,
        checkoutID,  dueDate);
        setAuthor(author);
        setEdition(edition);
        setYear(publishingYear);
     }

//set methids

     public void setAuthor(String author) {
      if(author.equals("")){
         throw new IllegalArgumentException("author cannot be empty");
     }
     else{
         this.author = author;
     }
     }

     public void setEdition(int edition) {
      if(edition < 0 ){
         throw new IllegalArgumentException("Invalid edition");
     }
     else{
         this.edition = edition;
     }
     }

     public void setYear(int publishingYear) {
      if(publishingYear < 0 ){
         throw new IllegalArgumentException("Invalid pulishing year");
     }
     else{
         this.publishingYear = publishingYear;
     }
     }




//get mthods
     public String getAuthor() {
         return author;
     }
     public int getEdition() {
         return edition;
     }
     public int getPublishingYear() {
         return publishingYear;
     }

     //tostring
     public String toString() {

         return super.toString() + 
         " author: " + this.getAuthor()+
         " edition: " + this.getEdition()+
         " publising year: " + this.getPublishingYear();
      }

     
    
}
