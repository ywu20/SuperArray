public class SuperArray{
private String[] data;
private int size=0; //The current size

public SuperArray(){
  data=new String[1];
}

public int size(){
  return size;
}

public boolean add (String element){
  if(size+2>data.length){
    resize();
  }
  data[size]=element;
  size++;
  return true;
}

public String get(int index){
  return data[index];
}

public String set (int index, String element){
  String out = data[index];
  data[index]=element;
  return out;
}

private void resize(){
  String[] newArr = new String[data.length+10];
  for (int i=0; i<data.length; i++){
    newArr[i]=data[i];
  }
  data = newArr;
}

}
