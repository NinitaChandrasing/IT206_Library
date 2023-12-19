import javax.swing.JOptionPane;

public class FenwickImp {
    
    public static void main(String[] args) {
        final int MAX = 6000;
    LibraryItem [] libaryCatalog = new LibraryItem [MAX];
    //create library then add items to it
    Library fenwick = createLibrary();

    


    String option = "";
        do {
        option = JOptionPane.showInputDialog("enter your choice\n1:add library Item\n2:search items \n3:checkout book\n4:print info\nE:exit");

        switch(option){
        case "1":
            addItems(libaryCatalog, fenwick);
            
            break;
        case "2":
            justSearch(libaryCatalog, fenwick);
            break;
        case "3":
            checkoutItem(libaryCatalog, fenwick);
            break;
        case "4":
            printInfo(libaryCatalog, fenwick);
            break;
        
        case "E","e":
            return;
        default:
            JOptionPane.showMessageDialog(null, "invalid choice");
    }     
    } while (option != "E"||option!="e");

    
    
    
    
  
        
}//end 1


public static void menu(LibraryItem[] libaryCatalog,Library fenwick){
     String option = "";
        do {
        option = JOptionPane.showInputDialog("enter your choice\n1:add library Item\n2:search items \n3:checkout book\n4:print info\nE:exit");

        switch(option){
        case "1":
            addItems(libaryCatalog, fenwick);
            
            break;
        case "2":
            justSearch(libaryCatalog, fenwick);
            break;
        case "3":
            checkoutItem(libaryCatalog, fenwick);
            break;
        case "4":
            //JOptionPane.showMessageDialog(null, libaryCatalog[0].toString());
            printInfo(libaryCatalog, fenwick);
            break;
        
        case "E","e":
            return;
        default:
            JOptionPane.showMessageDialog(null, "invalid choice");
    }     
    } while (option != "E"||option!="e");

}



    public static Library createLibrary(){
    Library aLibrary  = new Library();

    boolean validlibName= false;
    boolean validlibAddress = false;
    boolean vlaidLibrairan = false;

        do{
        try{
        String libName = JOptionPane.showInputDialog("enter library name");
        aLibrary.setLibName(libName);
        validlibName = true;
        }catch (IllegalArgumentException e) {JOptionPane.showMessageDialog(null,e.getMessage());}
        }while(validlibName != true);
///////////////////////////////////////////////////
        do{
        try{
        String libAddress = JOptionPane.showInputDialog("enter library address");
        aLibrary.setAddress(libAddress);
        validlibAddress = true;
        }catch (IllegalArgumentException e) {JOptionPane.showMessageDialog(null,e.getMessage());}
        }while(validlibAddress != true);
///////////////////////////////////////////////////
        do{
        try{
        String librarian = JOptionPane.showInputDialog("enter librarian name");
        aLibrary.setLibrarian(librarian);
        vlaidLibrairan = true;
        }catch (IllegalArgumentException e) {JOptionPane.showMessageDialog(null,e.getMessage());}
        }while(vlaidLibrairan != true);
///////////////////////////////////////////////////

JOptionPane.showMessageDialog(null,aLibrary.toString());
return aLibrary;

}


    public static void  addItems(LibraryItem[] libaryCatalog,Library fenwick){
        String option = "";
        do {
        option = JOptionPane.showInputDialog("enter your choice\n1:add book\n2:add media \nE:exit");

        switch(option){
        case "1":
            libaryCatalog[Library.getNumOfLibraryItems()] = addBook(libaryCatalog, fenwick);
            break;
        case "2":
            libaryCatalog[Library.getNumOfLibraryItems()] = addMedia(libaryCatalog,fenwick);
            break;
        case "E","e":
            return;
        default:
            JOptionPane.showMessageDialog(null, "invalid choice");
    }     
    } while (option != "E"||option!="e");

       // Library.setBook();
    }


    public static Book addBook(LibraryItem [] libaryCatalog,Library fenwick){
        Book abook = new Book();
        boolean validISBN = false;
        boolean validTitle= false;
        boolean validAvailableCopies= false;
        boolean validCheckoutID = false;
        boolean validDueDate= false;
        boolean validAuthor= false;
        boolean validEdition=false;
        boolean validPublishingYear=false;

        do{
        try{
        String iSBN = JOptionPane.showInputDialog("enter ISBN");
        abook.setISBN(iSBN);
        validISBN = true;
        }catch (IllegalArgumentException e) {JOptionPane.showMessageDialog(null,e.getMessage());}
        }while(validISBN!= true);
///////////////////////////////////////////////////
        do{
        try{
        String title = JOptionPane.showInputDialog("enter title");
        abook.setTitle(title);
        validTitle = true;
        }catch (IllegalArgumentException e) {JOptionPane.showMessageDialog(null,e.getMessage());}
        }while(validTitle!= true);
///////////////////////////////////////////////////
        do{
        try{
        int copies = Integer.parseInt(JOptionPane.showInputDialog("enter num of copes"));
        abook.setCopies(copies);
        validAvailableCopies = true;
        }catch (IllegalArgumentException e) {JOptionPane.showMessageDialog(null,e.getMessage());}
        }while(validAvailableCopies!= true);
///////////////////////////////////////////////////
        do{
        try{
        String id = JOptionPane.showInputDialog("enter checkou id");
        abook.setID(id);
        validCheckoutID = true;
        }catch (IllegalArgumentException e) {JOptionPane.showMessageDialog(null,e.getMessage());}
        }while(validCheckoutID!= true);
///////////////////////////////////////////////////
        do{
        try{
        String date = JOptionPane.showInputDialog("enter due date ");
        abook.setDate(date);
        validDueDate = true;
        }catch (IllegalArgumentException e) {JOptionPane.showMessageDialog(null,e.getMessage());}
        }while(validDueDate!= true);
///////////////////////////////////////////////////
        do{
        try{
        String author = JOptionPane.showInputDialog("enter author");
        abook.setAuthor(author);
        validAuthor = true;
        }catch (IllegalArgumentException e) {JOptionPane.showMessageDialog(null,e.getMessage());}
        }while(validAuthor!= true);
///////////////////////////////////////////////////
        do{
        try{
        int edition =  Integer.parseInt(JOptionPane.showInputDialog("enter edition"));
        abook.setEdition(edition);
        validEdition = true;
        }catch (IllegalArgumentException e) {JOptionPane.showMessageDialog(null,e.getMessage());}
        }while(validEdition!= true);
///////////////////////////////////////////////////
        do{
        try{
        int year =  Integer.parseInt(JOptionPane.showInputDialog("enter year"));
        abook.setYear(year);
        validPublishingYear = true;
        }catch (IllegalArgumentException e) {JOptionPane.showMessageDialog(null,e.getMessage());}
        }while(validPublishingYear!= true);
///////////////////////////////////////////////////
        //libaryCatalog[Library.getNumOfLibraryItems()] = abook;
        fenwick.setBook(abook);
        return abook;

    }

 public static Media addMedia(LibraryItem [] libaryCatalog,Library fenwick){

    Media aMedia = new Media();
    boolean validISBN = false;
    boolean validtTitle= false;
    boolean validAvailableCopies= false;
    boolean validCheckoutID= false;
    boolean validDueDate= false;
    boolean validtype= false;
    boolean validDuration = false;

    do{
        try{
        String iSBN = JOptionPane.showInputDialog("enter ISBN");
        aMedia.setISBN(iSBN);
        validISBN = true;
        }catch (IllegalArgumentException e) {JOptionPane.showMessageDialog(null,e.getMessage());}
        }while(validISBN!= true);
///////////////////////////////////////////////////
        do{
        try{
        String title = JOptionPane.showInputDialog("enter title");
        aMedia.setTitle(title);
        validtTitle = true;
        }catch (IllegalArgumentException e) {JOptionPane.showMessageDialog(null,e.getMessage());}
        }while(validtTitle!= true);
///////////////////////////////////////////////////
        do{
        try{
        int copies = Integer.parseInt(JOptionPane.showInputDialog("enter num of copes"));
        aMedia.setCopies(copies);
        validAvailableCopies = true;
        }catch (IllegalArgumentException e) {JOptionPane.showMessageDialog(null,e.getMessage());}
        }while(validAvailableCopies!= true);
///////////////////////////////////////////////////
        do{
        try{
        String id = JOptionPane.showInputDialog("enter checkou id");
        aMedia.setID(id);
        validCheckoutID = true;
        }catch (IllegalArgumentException e) {JOptionPane.showMessageDialog(null,e.getMessage());}
        }while(validCheckoutID!= true);
///////////////////////////////////////////////////
        do{
        try{
        String date = JOptionPane.showInputDialog("enter due date ");
        aMedia.setDate(date);
        validDueDate = true;
        }catch (IllegalArgumentException e) {JOptionPane.showMessageDialog(null,e.getMessage());}
        }while(validDueDate!= true);
///////////////////////////////////////////////////
        do{
        try{
        String type = JOptionPane.showInputDialog("enter type");
        aMedia.setType(type);
        validtype = true;
        }catch (IllegalArgumentException e) {JOptionPane.showMessageDialog(null,e.getMessage());}
        }while(validtype!= true);
///////////////////////////////////////////////////
        do{
        try{
        int duration = Integer.parseInt(JOptionPane.showInputDialog("enter duration"));
        aMedia.setDuration(duration);
        validDuration = true;
        }catch (IllegalArgumentException e) {JOptionPane.showMessageDialog(null,e.getMessage());}
        }while(validDuration!= true);


   fenwick.setMedia(aMedia);
        return aMedia;

 }


    public static void printInfo(LibraryItem[] libraryCatalog, Library fenwick){
    String librayInfo = fenwick.toString()+"Num of items: "+ Library.getNumOfLibraryItems();
    String catalog  = "Libary catalog\n";
    for(int i =0; i<Library.getNumOfLibraryItems();i++){
        catalog += libraryCatalog[i].toString()+"\n";
        
    }
    JOptionPane.showMessageDialog(null,librayInfo +"\n"+  catalog);
    }


    public static int searchLibraryItems(LibraryItem[] libraryCatalog, String searchTitle){
        int index = -1;
        for(int i = 0 ; i<Library.getNumOfLibraryItems();i++){
           if(searchTitle.equalsIgnoreCase(libraryCatalog[i].getTitle())){
              index = i;
              break;
           }
        }
        return index;
    }

    public static void checkoutItem(LibraryItem[] libraryCatalog, Library fenwick){
        String searchTitle =  "Libary catalog\n";
    for(int i =0; i<Library.getNumOfLibraryItems();i++){
        searchTitle += libraryCatalog[i].toString()+"\n";
        
    }
        searchTitle = JOptionPane.showInputDialog(searchTitle + "\nEnter title to checkout");
        int index = searchLibraryItems(libraryCatalog, searchTitle);
        if(index>-1){
            JOptionPane.showMessageDialog(null, libraryCatalog[index].getAvailableCopies()+" available copies for title: "+ libraryCatalog[index].getTitle());
           libraryCatalog[index] = null;
           //DVD.updateNumDVD;
           for(int i=index;i<Library.getNumOfLibraryItems();i++){
              libraryCatalog[i] = libraryCatalog[i+1];
           }
           Library.updateNumItems();
           
        }else{
           JOptionPane.showMessageDialog(null,  "title was not found to checkout");
        }
    }
    public static void justSearch(LibraryItem[] libraryCatalog, Library fenwick){
        String searchTitle =  "Libary catalog\n";
    for(int i =0; i<Library.getNumOfLibraryItems();i++){
        searchTitle += libraryCatalog[i].toString()+"\n";
    }
        searchTitle = JOptionPane.showInputDialog(searchTitle + "\nEnter title to search");
        int index = searchLibraryItems(libraryCatalog, searchTitle);
         if(index>-1){
        JOptionPane.showMessageDialog(null,libraryCatalog[index].toString());
        /*  if(index>-1){
           libraryCatalog[index] = null;
           //DVD.updateNumDVD;
           for(int i=index;i<Library.getNumOfLibraryItems();i++){
              libraryCatalog[i] = libraryCatalog[i+1];
           }
           Library.updateNumItems();*/
           
        }else{
           JOptionPane.showMessageDialog(null,  "title was not found");
        }
    }





    public static void removeCase(LibraryItem[]libaryCatalog,Library fenwick){
        if(Library.getNumOfLibraryItems()==0){
            JOptionPane.showMessageDialog(null, "no item to remove");
            menu(libaryCatalog,fenwick);
        }else{
            checkoutItem(libaryCatalog, fenwick);

        }
    }




}//end
