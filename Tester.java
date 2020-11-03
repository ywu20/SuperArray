public class Tester{
  public static void main(String[] args){
  SuperArray words = new SuperArray();
  System.out.println(words.size());
  words.add("kani");
  words.add("uni");
  words.add("ebi");
  System.out.println(words.size());
  System.out.println(words.get(1));
  System.out.println(words.set(0, "ducky"));
  }

}
