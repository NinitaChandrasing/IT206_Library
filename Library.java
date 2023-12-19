public  class Library{ 
        //when creatinga lirbary create the items
        private  String libName;
        private  String libAddress;  
        private String librarian;
        private static int numOfLibraryItems;
        // <- same as totalnumofitems in lirbaryItem
        //access throuh lirbaryItem.getnumofitems
        private int numLibraries;

        private Book book;
        private Media media;

        //Book books;
        //Media media;
        Library(){numLibraries++;}

        Library(String libName, String libAddress, String lirbarian){  
        setLibName(libName);
        setAddress(libAddress);
        setLibrarian(lirbarian);
      
        numLibraries++;  
        
        } 

        public void setLibName(String libName) {
        if(libName.equals("")){
        throw new IllegalArgumentException("libary name cannot be empty");
         }
        else{
        this.libName = libName;
         }
        }

        public void setAddress(String libAddress) {
        if(libAddress.equals("")){
        throw new IllegalArgumentException("address cannot be empty");
        }
       else{
        this.libAddress = libAddress;
         }       
        }

        public void setLibrarian(String librarian) {
        if(librarian.equals("")){
        throw new IllegalArgumentException("librarian cannot be empty");
        }
       else{
        this.librarian = librarian;
         }     
        }


        public String getLibName() {
            return libName;
        }
        public String getLibAddress() {
            return libAddress;
        }
        public String getLibrarian() {
            return librarian;
        }        
    
        public String toString() {

                return " library name: "+ this.getLibName()+
                " address: "+ this.getLibAddress()+
                " librarian: "+ this.getLibrarian();
        }

        public static int getNumOfLibraryItems() {
            return numOfLibraryItems;
        }


        public Book getBook(){return this.book;}
        public Media getMedia(){return this.media;}
        
        public void setBook(Book book){
                this.book = book;
                numOfLibraryItems++;

        }
        public void setMedia(Media media){
                this.media = media;
                 numOfLibraryItems++;
        }

        public static void updateNumItems(){
                numOfLibraryItems--;
        }

}   