public class tesRemoveAll {


  public static void main(String[] args) {
      StrukturList2 myList = new StrukturList2();
      myList.addTail(4);
      myList.addTail(3);
      myList.addTail(7);
      myList.addTail(8);
      myList.addTail(1);
      myList.addTail(9);
      
      

      // Tampilkan elemen list
      myList.displayElement();
      // Output: 
      System.out.println("");
      myList.removeAll();
      myList.displayElement();
  }
}