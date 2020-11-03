public class Tester{
  public static void main(String[] args){
  SuperArray words = new SuperArray();
  System.out.println(words.size());
  words.add("kani");
  words.add("uni");
  words.add("ebi");
  for (int i=0;i<11;i++){
    words.add("add");
  }
  for(int i = 0; i < words.size(); i++){
  System.out.println( words.get(i) );
}
  System.out.println(words.size());
  System.out.println(words.set(0, "ducky"));
  System.out.println(words.get(0));
  
  SuperArray word = new SuperArray();
word.add("kani");
word.add("uni");
word.add("ebi");
for(int i = 0; i < word.size(); i++){
  System.out.println( word.get(i) );
}
  }
}
