import java.util.*;
import java.io.*;
public class CCC_14_S2{

    public static void main(String [] args)throws IOException{
      Scanner sc = new Scanner(System.in);
      HashMap<String, String> validGroup = new HashMap<>();
      Boolean b = true;
      int numppl = sc.nextInt();
      String[] firstGroup = new String[numppl];
      String[] secondGroup = new String[numppl];
      for(int i = 0; i< numppl; i++){
        firstGroup[i] = sc.next();
      }
      for(int i = 0; i < numppl; i++){
        secondGroup[i] = sc.next();
        if(!(validGroup.containsKey(secondGroup[i])) && !(validGroup.containsKey(firstGroup[i]))){
             if(firstGroup[i].equals(secondGroup[i])){
                b = false;
                break;
            }
            validGroup.put(secondGroup[i], firstGroup[i]);
            validGroup.put(firstGroup[i], secondGroup[i]);
            System.out.println("added new key on iteration: "+i);
            System.out.println("key-value added: "+validGroup);
        }else {
            System.out.println("! happens on iteration: "+i+ " "+ validGroup);
            if(validGroup.containsKey(secondGroup[i]) && !(validGroup.get(secondGroup[i]).equals(firstGroup[i]))){
                System.out.println("1bad"+" Key "+secondGroup[i]+" Value "+ validGroup.get(secondGroup[i])+" Key "+firstGroup[i]);
                b = false;
                break;
            }
            if(validGroup.containsKey(firstGroup[i]) && !(validGroup.get(firstGroup[i]).equals(secondGroup[i]))){
                System.out.println("2bad"+" Key "+firstGroup[i]+" Value "+ validGroup.get(firstGroup[i])+" Key "+secondGroup[i]);
                b = false;
                break;
            }
        }
      }
      System.out.println(validGroup);
      if(b == true){
        System.out.println("good");
      }
      else{
        System.out.println("bad");
      }
    }

}