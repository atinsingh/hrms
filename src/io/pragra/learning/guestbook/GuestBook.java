package io.pragra.learning.guestbook;

public class GuestBook {
   private int capacity = 20;
   private Guest [] book = new Guest[20];

   public void add(Guest guest) throws InvalidNameException, GuestBookFullException {
       if(guest.getName().length()<4) {
           throw new InvalidNameException("Name should be 4 or more character");
       }

       for (int i = 0 ;  i < book.length; i++) {
           if(book[i] == null) {
               book[i] = guest;
               break;
           }
       }
       if(book[capacity-1]!=null) {
           throw new GuestBookFullException("All Guest has been added no more room");
       }
   }
}
