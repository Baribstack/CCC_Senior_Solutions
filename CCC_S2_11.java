import java.util.*;
import java.io.*;
public class CCC_S2_11{
    public static void main(String [] args) throws IOException{
        HashMap<String,String> charBinaryPair = new HashMap<>();
        String SubString = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numChar = Integer.parseInt(br.readLine());
        String[] getInput = new String[2];
        for(int i = 0; i < numChar; i++){
            getInput = br.readLine().split(" ");
            charBinaryPair.put(getInput[1],getInput[0]);
        }
       /*  System.out.println();
        System.out.println(charBinaryPair);
        System.out.println(binaryChar);*/
        String sequence = br.readLine();
        String finalSequence = "";
        br.close();
        for(int i = 0; i < sequence.length()+1; i++){
            if(charBinaryPair.containsKey(SubString) == true){
               // System.out.println(SubString +" "+ i + " "+charBinaryPair.get(SubString));
                finalSequence+=charBinaryPair.get(SubString);
                SubString="";
            }  
            if(i == sequence.length()) break;;
            SubString+=Character.toString(sequence.charAt(i));
           // System.out.println(Character.toString(sequence.charAt(i)));
            //System.out.println(SubString);
        }      
        System.out.print(finalSequence);
    }

}
