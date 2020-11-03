public class SuperArray{
private String[] data;
private int size=0; //The current size

public SuperArray(){
  data=new String[10];
}

public int size(){
  return size;
}

public boolean add (String element){
  if(size<data.length){
  data[size]=element;
  size++;
  return true;}
  else{
    return false;
  }
}

}
