
public class Media extends LibraryItem{
   private String type; //(CD, DVD, BLURAY) 
   private int duration;  

   Media(){super();}

     Media(String ISBN,String title, int availableCopies,String checkoutID, String dueDate,
     String type, int duration){
      super( ISBN, title,  availableCopies,
      checkoutID,  dueDate);
      setType(type);
      setDuration(duration);
     }
     
     public void setType(String type) {
      if(type.equalsIgnoreCase("CD")||type.equalsIgnoreCase("DVD")||type.equalsIgnoreCase("BLURAY")){
        this.type = type;
      }else{
      throw new IllegalArgumentException("invalid type");}
      }
     
     public void setDuration(int duration) {
      if(duration < 0 ){
        throw new IllegalArgumentException("Invalid  duration");
      }
      else{
        this.duration = duration;
      }
      }


     public String getType() {
         return type;
     }
     public int getDuration() {
         return duration;
     }



     public String toString() {
         return super.toString()+
         "type: "+ this.getType()+
         "duration: "+ this.getDuration();
     }

     
    
}
