public class Demo{
  public static SuperArray removeDuplicates(SuperArray s){
    for(int i=0; i<s.size(); i++){
      for(int j=i+1;j<s.size(); j++){
        if(s.get(i)== s.get(j)){
          s.remove(j);
        }
      }
    }
    return s;
  }

  public static SuperArray findOverlap(SuperArray a, SuperArray b){
    SuperArray out = new SuperArray();
    for(int i=0;i<a.size();i++){
      for(int j=0; j<b.size();j++){
      if(a.get(i)==b.get(j)){
        out.add(a.get(i));
      }
    }
    }
    removeDuplicates(out);
    return out;
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

SuperArray a = new SuperArray();
SuperArray b = new SuperArray();

  //grouped to save vertical space
  a.add("kani");   b.add("uni");     b.add("ebi");     a.add("una");
  a.add("una");    a.add("ebi");    b.add("kani");    a.add("una");
  a.add("una");    b.add("ebi");     a.add("toro");

  System.out.println(a);
  System.out.println(b);
  System.out.println(findOverlap(a,b));
  }
}
