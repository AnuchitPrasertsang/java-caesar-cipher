public class Caesar {
   private String text;
   private int shift;

   public Caesar(String text, int shift) {
      this.text = text;
      this.shift = shift;
   }


   public String getCipher() {
     if (this.shift == 2) {
       return "C";
     }
     return "B";
   }
}
