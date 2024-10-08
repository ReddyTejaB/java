 class Demo {
     public void display() {
         int id = 123;
         String name = "Teja";
         System.out.println(id + " " + name);
     }
 }

     public class Local {
         public static void main(String[] args) {
             Demo local = new Demo();
             local.display();
         }
     }
 