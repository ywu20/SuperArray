public class SuperArray{
private String[] data;
private int size=0; //The current size

public SuperArray(){
  data=new String[10];
}

public SuperArray(int initialCapacity){
  data= new String[initialCapacity];
}

public int size(){
  return size;
}

public boolean add (String element){
  if(size+1>data.length){
    resize();
  }
  data[size]=element;
  size++;
  return true;
}


public void add(int index, String element){
  for(int i=size; i>index;i--){
    if(size+1>data.length){
      resize();
    }
    data[i]=data[i-1];
  }
  data[index]=element;
  size++;
}

public String remove(int index){
  String out=data[index];
for(int i=index; i<size-1;i++){
  data[i]=data[i+1];
}
size--;
return out;
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
  String[] newArr = new String[data.length*2];
  for (int i=0; i<data.length; i++){
    newArr[i]=data[i];
  }
  data = newArr;
}

public boolean isEmpty(){
  return size==0;
}

public void clear(){
  data = new String[10];
  size=0;
}

public String toString(){
  String out ="[";
  for(int i=0; i<size-1; i++){
    out+=data[i]+",";
  }
  if(size!=0){
  out+=data[size-1];
}
  out+="]";
  return out;
}

public boolean contains(String s){
  for(int i=0;i<size;i++){
    if(data[i].equals(s)){
      return true;
    }
  }
  return false;
}

/*
public int indexOf(String s){

}

public String[] toArray(){

}
*/
}
