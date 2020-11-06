public class Demo{
  public static SuperArray removeDuplicates(SuperArray s){
    for(int i=0; i<s.size(); i++){
      for(int j=i;j<s.size(); j++){
        if(s.get(i)== s.get(j)){
          s.remove(j);
        }
      }
    }
    return s;
  }
  public static void main(String[] args){
    SuperArray words = new SuperArray();
  //grouped to save vertical space
  words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
  words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
  words.add("una");    words.add("ebi");     words.add("toro");

  System.out.println(words);
  removeDuplicates(words);
  System.out.println(words);  
  }
}
