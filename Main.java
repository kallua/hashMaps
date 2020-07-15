import java.util.*;
class Main { //example to implement HashMap
  public static void main(String[] args) {
    String str="This is is is a a a a sample sample stmt";
    HashMap<String, Integer> map=new HashMap<String, Integer>();
    String subStr[]= str.split(" ");
    //int count=1;
    for(int i=0;i<subStr.length;i++){
      if(map.containsKey(subStr[i])){
        int count=(int)map.get(subStr[i]);
        map.put(subStr[i],count+1);
      }
      else
      map.put(subStr[i],1);      
    }
    //System.out.println(map);
    for(Map.Entry entry: map.entrySet()){
      System.out.println("key: "+entry.getKey()+", Value: "+entry.getValue()); 
    }
  }
}