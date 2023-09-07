import java.io.*;
import java.util.*;
public class Main{
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sequence = br.readLine();
        br.close();
        HashMap<Character, Integer> romanValue = fillRomanValue();
        int totalValue = 0;
        for(int i = 1; i <= sequence.length()-2; i+=2){
            System.out.println(sequence.charAt(i) + " " + i);
            if(romanValue.get(sequence.charAt(i)) < romanValue.get(sequence.charAt(i+2))){
                totalValue = totalValue - ((Character.getNumericValue(sequence.charAt(i-1))) * romanValue.get(sequence.charAt(i)));
                System.out.println(totalValue + " 1");
            }else{
                totalValue = totalValue + ((Character.getNumericValue(sequence.charAt(i-1))) * romanValue.get(sequence.charAt(i)));
                System.out.println(totalValue + " 0");
            }
        }
        totalValue = totalValue + ((Character.getNumericValue(sequence.charAt(sequence.length()-2))) * romanValue.get(sequence.charAt(sequence.length()-1)));
        System.out.println(totalValue);
    }
    public static HashMap<Character, Integer> fillRomanValue(){
        HashMap<Character, Integer> romanValue = new HashMap<>();
        romanValue.put('I',1);
        romanValue.put('V',5);
        romanValue.put('X',10);
        romanValue.put('L',50);
        romanValue.put('C',100);
        romanValue.put('D',500);
        romanValue.put('M',1000);
        return romanValue;

    }
}