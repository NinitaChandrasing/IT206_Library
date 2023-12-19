

public abstract class LibraryItem {
    private String ISBN;
    private String title;

    private int availableCopies;
    private String checkoutID;
    private String dueDate;

    private int totalNumOfItems;

    LibraryItem(){totalNumOfItems++;}

    LibraryItem(String ISBN,String title, int availableCopies,
    String checkoutID, String dueDate){
       
       setISBN(ISBN);
       setTitle(title);
       setCopies(availableCopies);
       setID(checkoutID);
       setDate(dueDate);
       totalNumOfItems++;
    }

    //set methods
    public void setDate(String dueDate) {
        if(dueDate.equals("")||dueDate.length()!=8){
            throw new IllegalArgumentException("due date cannot be empty");
        }
        else{
            this.dueDate = dueDate;
        }

    }

    public void setID(String checkoutID) {
        //gnumber G+8 = 9 lenght
        if(checkoutID.equals("")||checkoutID.length() != 9){
            throw new IllegalArgumentException("invalid ID, ID cannot be empty & must have a lenght of 9");
       }
       for(int i = 1; i< checkoutID.length(); i++){
        if( checkoutID.charAt(0)=='G' && Character.isDigit(checkoutID.charAt(i)) == true ){
            this.checkoutID =checkoutID;
        }else{
            throw new IllegalArgumentException("invalid gnumber");
        }
       }
    }
    

    public void setCopies(int availableCopies) {
        if(availableCopies>6000||availableCopies<0){
            throw new IllegalArgumentException("Invalid number of copies");
        }
        else{
            this.availableCopies= availableCopies;
        }
    }

    public void setTitle(String title) {
        if(title.equals("")){
            throw new IllegalArgumentException("ISBN cannot be empty");
        }
        else{
            this.title = title;
        }
    }

    public void setISBN(String iSBN) {
        if(iSBN.equals("")){
            throw new IllegalArgumentException("ISBN cannot be empty");
        }
        else{
            this.ISBN = iSBN;
        }
    }

    //get methods


    public int getNumItems(){
        return totalNumOfItems;
    }

    public int decreaeNumItems(){
        return totalNumOfItems--;
    }
    public String getISBN(){
        return ISBN;
    }
    public String getTitle(){
        return title;
    }
    public int getAvailableCopies(){
        return availableCopies;
    }
    public String getCheckoutID(){
        return checkoutID;
    }
    public String getDueDate(){
        return dueDate;
    }
    
//tostring
public String toString() 
{
    return " ISBN: " + this.getISBN() +
    " title: " + this.getTitle() +
    " avaliable copies: " + this.getAvailableCopies()+
    " checkout id: " + this.getCheckoutID()+
    " due date: " + this.getDueDate();
}
}
    

