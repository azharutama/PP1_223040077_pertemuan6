public class tesSize {
  
    // Tambah elemen 7 di awal list
 
 

    public static void main(String[] args) {
      StrukturList2 myList = new StrukturList2();
  
    
      myList.addTail(7);
      myList.addTail(6);
      myList.addTail(4);
      myList.addTail(2);
      myList.addTail(3);
  
      // Tampilkan elemen list
      myList.displayElement();
      // Output: 
      System.out.println("");
      System.out.println(myList.size());
      
     
  
  
    
     
}
}
