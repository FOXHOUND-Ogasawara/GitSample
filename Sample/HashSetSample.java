package Sample;
// import java.util.HashSet;
import java.util.Set;

class HashSet {
   public static void main(String[] args) {
       // Q1
       Set<String> set = new java.util.HashSet<String>();
       set.add("うさぎ");
       set.add("トラ");
       set.add("うま");

       // Q2
       set.forEach(value -> {
           System.out.println(value);
       });
   }
}